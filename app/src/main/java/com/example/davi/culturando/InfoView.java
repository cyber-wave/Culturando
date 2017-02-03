package com.example.davi.culturando;



import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.*;
import com.example.igor.culturando.R;
import com.example.igor.culturando.telaAbertura;

import static com.example.igor.culturando.R.anim.fadeinsplash;

/**
 * Created by davitabosa on 31/01/17.
 */

public class InfoView extends LinearLayout implements View.OnTouchListener {
    private Espaco espaco;
    private TextView txvDist;
    private TextView txvNome;
    private View rootView;

    public InfoView(Context context, Espaco espaco) {
        super(context);
        this.espaco = espaco;
        init(context);


    }


    private void init(Context context) {
        rootView = inflate(context,R.layout.espacoview,this);
        txvDist = (TextView) findViewById(R.id.txvM);
        txvNome = (TextView) findViewById(R.id.txvEquip);
        txvDist.setText("");
        txvNome.setText(espaco.getNome());

    }
    public void setNomeColor(int color){
        txvNome.setTextColor(color);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        this.setBackgroundColor(Color.LTGRAY);
        return false;
    }
}
