package com.example.davi.culturando;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.igor.culturando.R;
import com.example.igor.culturando.telaPrincipal;

/**
 * Created by davitabosa on 31/01/17.
 */

public class ConfigActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaconfig);
        //TODO: Colocar Configuracoes para o radar
    }
    public void chamaTelaCheck(View v) {
        //setContentView(R.layout.telacheck);
        Intent checklist = new Intent(getApplicationContext(),ChecklistActivity.class);
        startActivity(checklist);
    }

    public void chamaTelaConfig(View v) {
        //setContentView(R.layout.telaconfig);
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
