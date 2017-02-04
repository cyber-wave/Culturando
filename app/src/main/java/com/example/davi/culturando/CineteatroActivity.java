package com.example.davi.culturando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.igor.culturando.R;

import java.util.HashMap;

public class CineteatroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telamapacineteatrosaoluiz);
    }
    private void pegarInfo(final VolleyCallback callback){

        HashMap<String, String> params = new HashMap<>();
        params.put("@select","name,location,eventOccurrences");
        params.put("name", "ilike(Cineteatro*)");
        final String url = "http://mapa.cultura.ce.gov.br/api/space/find?";
        //params.put("name","ilike(C*)");

        final String query = VolleyTools.stringifyRequest(params, "@select");

        StringRequest espacoRequest = new StringRequest(url + query, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callback.onSuccess(response);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Não foi possivel obter JSON: " + error.getMessage());
                callback.onFailure();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(espacoRequest);
    }
}
