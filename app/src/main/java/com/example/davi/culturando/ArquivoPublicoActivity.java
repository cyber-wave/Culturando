package com.example.davi.culturando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.igor.culturando.R;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ArquivoPublicoActivity extends AppCompatActivity {

    private ScrollView src;
    private RelativeLayout rel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.telamapaarquivopublicodoceara);
        src = (ScrollView) findViewById(R.id.scrArquivo);
        rel = (RelativeLayout) findViewById(R.id.relArquivo);
     


    }


}
