package com.example.davi.culturando;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.igor.culturando.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by davitabosa on 19/01/17.
 */

public class radar extends AppCompatActivity {

    StringRequest espacoRequest;
    boolean existeLocalizacao = false;
    RequestQueue requestQueue;
    Map<String, String> params;
    String url_espacos = "http://mapa.cultura.ce.gov.br/api/space/find?";
    String query;
    double latitude,longitude;
    JSONArray resposta;
    String strResposta;
    ArrayList<Espaco> espacos,espacosProximos;
    JSONArray jsnaResposta;
    //views
    ScrollView scrollRadar;

    //layout
    LinearLayout linearScroll;

    //gps
    private LocationManager manager;
    private LocationListener listener;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaradar);

        params = new HashMap<>();
        espacos = new ArrayList<>();
        espacosProximos = new ArrayList<>();
        resposta = new JSONArray();
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        scrollRadar = (ScrollView) findViewById(R.id.scrollRadar);
        linearScroll = (LinearLayout) findViewById(R.id.layoutScroll);

        //gps


        //pegarInfo();
        pegarLocalUsuario();



        //pegarEspacosProximos(700);
        //mostrarEspacosProximos();




    }

    private void pegarLocalUsuario() {
        manager = (LocationManager) getSystemService(LOCATION_SERVICE);

        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                latitude = location.getLatitude();
                longitude = location.getLongitude();
                System.out.println("Latitude: " + latitude + " Longitude: " + longitude);
                Toast.makeText(getApplicationContext(),"Latitude: " + latitude + " Longitude: " + longitude,Toast.LENGTH_SHORT).show();
                pegarInfo(new VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                        System.out.println("so0s");
                        strResposta = result;
                        System.out.println(strResposta);
                        tratarObjeto(strResposta);
                        pegarEspacosProximos(100);
                        mostrarEspacosProximos();
                        //mostrarTodosEspacos();
                    }
                });
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {
                AlertDialog.Builder builder = new AlertDialog.Builder(radar.this);
                builder.setTitle("Localização desativada");
                builder.setMessage("O Radar funcionará incorretamente se a localização estiver desativada. Deseja ativar?");
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent conf = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                    }
                });
                builder.show();
            }
        };
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { //codigo para verificar permissao do usuario de usar o gps, besteiras do Marshmellow
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{
                        //quero essas tres permissoes
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.INTERNET
                }, 777);//777 é o meu codigo pra saber qual permissao foi concedida;
                return;
            }else{
                ativarGPS();
            }
        }
        else{
            ativarGPS();
        }
    }

    private void pegarInfo(final VolleyCallback callback){
        params.put("@select","name,location");
        //params.put("name","ilike(C*)");

        query = stringifyRequest(params,"@select");
        espacoRequest = new StringRequest(url_espacos + query, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println(url_espacos+query);
            /*dirty code
                strResposta = response;
                System.out.println("str"+strResposta);
                System.out.println("str"+strResposta);
                System.out.println("str"+strResposta);
                System.out.println(response);
                System.out.println(response);
                System.out.println(response);
                */
                System.out.println("onsucesso");
                callback.onSuccess(response);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Não foi possivel obter JSON: "+ error.getMessage());
            }
        });
        requestQueue.add(espacoRequest);
    }


    private void tratarObjeto(String response) {
        Espaco esp = new Espaco(0,0,"");
        System.out.println("tratar obj " + response);

        try {
            jsnaResposta = new JSONArray(response);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        for (int index = 0; index < jsnaResposta.length(); index++) {

            //espacos.add(new Espaco(jsnaResposta.getJSONObject(index)));

            try {
                esp = new Espaco(jsnaResposta.getJSONObject(index));

            } catch (JSONException e) {
                e.printStackTrace();
            }

            espacos.add(esp);
//            System.out.println(espacos.get(index).getNome());

        }
        Collections.sort(espacos);
        System.out.println(espacos.size());


    }

    private void mostrarTodosEspacos(){
        try {
            System.out.println("Todos os espacos: " + espacos.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView txvEspaco;
        for (int i = 0; i < espacos.size(); i++) {

            txvEspaco = new TextView(getApplicationContext());
            txvEspaco.setText(espacos.get(i).getNome());
            txvEspaco.setTextColor(Color.BLACK);
            if (i % 2 == 0)
                txvEspaco.setBackgroundColor(Color.LTGRAY);
            linearScroll.addView(txvEspaco);
        }
    }

    private void mostrarEspacosProximos() {
        TextView txvEspaco;
        linearScroll.removeAllViews();
        Espaco esp;
        if (espacosProximos.size() > 0){
            for (int i = 0; i < espacosProximos.size(); i++) {
                esp = espacosProximos.get(i);
                txvEspaco = new TextView(getApplicationContext());
                txvEspaco.setText(esp.getNome() + " - " + esp.distanciaAte(latitude,longitude) + "m");
                txvEspaco.setTextColor(Color.BLACK);
                if (i % 2 == 0)
                    txvEspaco.setBackgroundColor(Color.LTGRAY);
                linearScroll.addView(txvEspaco);
            }
        }
        else {
            txvEspaco = new TextView(getApplicationContext());
            txvEspaco.setText("Nenhum espaço proximo detectado!");
            txvEspaco.setTextColor(Color.BLACK);
            linearScroll.addView(txvEspaco);
        }
        Toast.makeText(getApplicationContext(),"espacos proximos" + espacosProximos.size(),Toast.LENGTH_SHORT).show();
    }




    public String stringifyRequest(Map<String, String> map, String... keys){
        String output = "";
        int cont = 0;
        for(String key : keys){

            if(cont >0)
                output+=("&");
            output += key + "=";
            output +=(map.get(key));
            cont++;
        }
        return output;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode){
            case 777:
                if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                    ativarGPS();
                } //se a permissao do sistema for positiva

        }
    }

    private void ativarGPS(){
        manager.requestLocationUpdates("gps", 1000, 20, listener);
        Toast.makeText(getApplicationContext(),"GPS ligando..",Toast.LENGTH_SHORT).show();
    }

    private void pegarEspacosProximos(double raio){
        for(int i = 0; i < espacos.size(); i++){
            Espaco e = espacos.get(i);
            if(e.distanciaAte(latitude,longitude) <= raio){
                espacosProximos.add(e);
            }
        }
    }
}
