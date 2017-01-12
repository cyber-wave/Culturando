package com.example.igor.culturando;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class telaAbertura extends AppCompatActivity implements Runnable {

   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.telaabertura);

       Handler handler = new Handler();
       handler.postDelayed(this, 2000);


   }


    @Override
    public void run(){
        startActivity(new Intent(this, telaPrincipal.class));
        finish();
    }

}
