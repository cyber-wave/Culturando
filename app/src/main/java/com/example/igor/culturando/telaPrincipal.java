package com.example.igor.culturando;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.davi.culturando.*;
public class telaPrincipal extends AppCompatActivity {

    Intent radar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);
        radar = new Intent(getApplicationContext(), com.example.davi.culturando.radar.class);

        ImageButton btnCheck = (ImageButton) findViewById(R.id.btnCheck);
        ImageButton btnProg = (ImageButton) findViewById(R.id.btnProg);
        ImageButton btnMapa = (ImageButton) findViewById(R.id.btnConfig);
        ImageButton btnRadar = (ImageButton) findViewById(R.id.btnRadar);
        ImageButton btnPrincipal = (ImageButton) findViewById(R.id.btnPrincipal);


        ImageButton btnMes = (ImageButton) findViewById(R.id.btnMes);
        ImageButton btnHoje = (ImageButton) findViewById(R.id.btnHoje);
        ImageButton btnFavorito = (ImageButton) findViewById(R.id.btnFavorito);
        ImageButton btnCategoria = (ImageButton) findViewById(R.id.btnCategoria);

        ImageButton btnAjudaCheck = (ImageButton) findViewById(R.id.btnAjudaCheck);
        ImageButton btnAjudaProg = (ImageButton) findViewById(R.id.btnAjudaProg);
        ImageButton btnAjudaRadar = (ImageButton) findViewById(R.id.btnAjudaRadar);
        //ImageButton btnAjudaRotas = (ImageButton) findViewById(R.id.btnAjudaRotas);
        ImageButton btnAjudaPrincipal = (ImageButton) findViewById(R.id.btnAjudaPrincipal);


       // TabItem btnProgresso = (TabItem) findViewById(R.id.btnProgresso);
       // TabItem btnDesafio = (TabItem) findViewById(R.id.btnDesafio);



    }



    public void chamaTelaCheck(View v) {
        setContentView(R.layout.telacheck);}

    public void chamaTelaConfig(View v) {setContentView(R.layout.telaconfig);}

    public void chamaTelaRadar(View v) {
        //setContentView(R.layout.telaradar);

        startActivity(radar);
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


    public void chamaTelaProgresso(View v) {
        setContentView(R.layout.telacheckprogresso);
    }

    public void chamaTelaDesafio(View v) {
        setContentView(R.layout.telacheckdesafio);
    }


    public void ajudaCheck(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("Esta seção contém uma lista de atividades para cada Espaço Cultural que você " +
                "poderá executar para tirar o maior " +
                "proveito possível do Espaço. " +
                "Você poderá marcar quando concluir uma das atividades.");

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


    public void ajudaProg(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("Nesta seção, se encontra a programação de todos os Espaços Culturais disponíveis no nosso aplicativo, a " +
                "qual você tem a opção de visualizá-la na forma de categorias (Teatro, Cinema, Música Popular, etc), do mês atual, ou " +
                "do Espaço Cultural selecionado. Você também poderá favoritar um evento no ícone de estrela, compartilhá-lo em suas " +
                "redes sociais no ícone de compartilhamento e habilitar um " +
                "lembrete para um evento desejado no ícone de sino, para que seu celular " +
                "possa notificá-lo quando o evento estiver próximo.");

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





    public void ajudaRadar(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("Esta seção do aplicativo exibe quais eventos estão acontecendo próximos a você no" +
                " momento. Ao clicar no evento, " +
                "você terá informações sobre ele, incluindo local " +
                "e seu horário de início/término. Você também poderá compartilhá-lo.");

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



    public void ajudaConfig(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("Aqui, você poderá habilitar ou desabilitar o " +
                "recurso de notificações do aplicativo. Você também poderá " +
                "conhecer um pouco sobre os " +
                "desenvolvedores e, caso encontre algum problema, nos contatar.");

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



    public void ajudaPrincipal(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("Aqui, você encontrará todos os Equipamentos Culturais disponíveis em nosso" +
                " aplicativo. Ao clicar em um, você terá acesso à sua história, " +
                "sua programação e sua galeria de fotos.");

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




    public void ajudaRotas(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ajuda");
        alert.setMessage("Esta seção apresenta as rotas para chegar ao Equipamento Cultural selecionado. Os " +
                "caminhos de rotas disponibilizados são as de ônibus, carro e à pé.");

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


