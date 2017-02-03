package com.example.davi.culturando;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.igor.culturando.R;
import com.example.igor.culturando.telaPrincipal;

/**
 * Created by davitabosa on 31/01/17.
 */

public class ChecklistActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telacheck);
        configurarBotoes();
    }
    public void configurarBotoes(){
        ImageButton btnRadar,btnConfig,btnInicio,btnProg;
        btnRadar = (ImageButton) findViewById(R.id.btnRadar);
        btnConfig = (ImageButton) findViewById(R.id.btnConfig);
        btnInicio = (ImageButton) findViewById(R.id.btnPrincipal);
        btnProg = (ImageButton) findViewById(R.id.btnProg);

        btnProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaTelaProg(v);
            }
        });

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaTelaConfig(v);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comeco = new Intent(getApplicationContext(),telaPrincipal.class);
                startActivity(comeco);
                finish();
            }
        });
        btnRadar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaTelaRadar(v);
            }
        });
    }

    public void chamaTelaCheck(View v) {
        //setContentView(R.layout.telacheck);

    }

    public void chamaTelaConfig(View v) {
        //setContentView(R.layout.telaconfig);
        Intent config = new Intent(getApplicationContext(),ConfigActivity.class);
        startActivity(config);
    }

    public void chamaTelaRadar(View v) {
        //setContentView(R.layout.telaradar);
        Intent radar = new Intent(getApplicationContext(), com.example.davi.culturando.radar.class);
        startActivity(radar);
    }

    public void chamaTelaProg(View v) {

        //setContentView(R.layout.telaprog);
        Intent prog = new Intent(getApplicationContext(),ProgActivity.class);
        startActivity(prog);
    }
    public void chamaTelaPrincipal(View v) {

        //setContentView(R.layout.telaprincipal);
        Intent inicio = new Intent(getApplicationContext(),telaPrincipal.class);
        startActivity(inicio);
    }
}
