package com.example.davi.culturando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.igor.culturando.R;

public class ArquivoPublicoActivity extends AppCompatActivity {

    private ScrollView src;
    private RelativeLayout rel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.telamapaarquivopublicodoceara);
        src = (ScrollView) findViewById(R.id.scrArquivo);
        rel = (RelativeLayout) findViewById(R.id.relArquivo);
        LayoutInflater inflater = getLayoutInflater();
        for(int i = 0; i<100; i++){
            TextView txv = new TextView(getApplicationContext());
            txv.setText("poxa igor!");
            rel.addView(txv);
        }


    }
}
