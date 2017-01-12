package com.example.igor.culturando;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;



public class telaPrincipal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);

        ImageButton btnCheck = (ImageButton) findViewById(R.id.btnCheck);
        ImageButton btnProg = (ImageButton) findViewById(R.id.btnProg);
        ImageButton btnMapa = (ImageButton) findViewById(R.id.btnConfig);
        ImageButton btnRadar = (ImageButton) findViewById(R.id.btnRadar);
        ImageButton btnMes = (ImageButton) findViewById(R.id.btnMes);
        ImageButton btnHoje = (ImageButton) findViewById(R.id.btnHoje);
        ImageButton btnFavorito = (ImageButton) findViewById(R.id.btnFavorito);
        ImageButton btnCategoria = (ImageButton) findViewById(R.id.btnCategoria);
        ImageButton btnPrincipal = (ImageButton) findViewById(R.id.btnPrincipal);
        ImageButton btnAjudaCheck = (ImageButton) findViewById(R.id.btnAjudaCheck);


    }


    public void chamaTelaCheck(View v) {
        setContentView(R.layout.telacheck);
    }

    public void chamaTelaConfig(View v) {setContentView(R.layout.telaconfig);}

    public void chamaTelaRadar(View v) {
        setContentView(R.layout.telaradar);
    }

    public void chamaTelaProg(View v) {
        setContentView(R.layout.telaprog);
    }

    public void chamaTelaPrincipal(View v) {
        setContentView(R.layout.telaprincipal);
    }




    public void chamaTelaMes(View v) {
        setContentView(R.layout.telaprogmes);
    }

    public void chamaTelaHoje(View v) {setContentView(R.layout.telaproghoje); }

    public void chamaTelaFavorito(View v) {
        setContentView(R.layout.telaprogfavorito);
    }

    public void chamaTelaCategoria(View v) {
        setContentView(R.layout.telaprogcategoria);
    }






    public void ajudaCheck(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("VDC Thamires VDC Thamires VDC Thamires");

        alert.setPositiveButton("Entendi", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //Your action here
            }
        });

        //alert.setNegativeButton("Cancel",
        //      new DialogInterface.OnClickListener() {
        //          public void onClick(DialogInterface dialog, int whichButton) {
        //          }
        //      });

        alert.show();
    }




}


