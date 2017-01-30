package com.example.igor.culturando;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static com.example.igor.culturando.R.anim.fadein;
import static com.example.igor.culturando.R.anim.fadeinsplash;


public class telaAbertura extends AppCompatActivity implements Runnable {

   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.telaabertura);

       ImageView imgSplash = (ImageView) findViewById(R.id.imgSplash);
       Animation fadeIn = AnimationUtils.loadAnimation(telaAbertura.this, fadeinsplash);
       imgSplash.startAnimation(fadeIn);

       Handler handler = new Handler();
       handler.postDelayed(this, 5000);


}


    @Override
    public void run(){
        startActivity(new Intent(this, telaPrincipal.class));
        overridePendingTransition(fadein, R.anim.fadeout);
        finish();
    }

}
