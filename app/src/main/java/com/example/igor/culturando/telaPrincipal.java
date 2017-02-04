package com.example.igor.culturando;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.davi.culturando.AlencarActivity;
import com.example.davi.culturando.ArquivoPublicoActivity;
import com.example.davi.culturando.ChecklistActivity;
import com.example.davi.culturando.CineteatroActivity;
import com.example.davi.culturando.ConfigActivity;
import com.example.davi.culturando.DragaoActivity;
import com.example.davi.culturando.IracemaActivity;
import com.example.davi.culturando.JoseLourencoActivity;
import com.example.davi.culturando.JuvenalActivity;
import com.example.davi.culturando.MuseuActivity;
import com.example.davi.culturando.OficiosActivity;
import com.example.davi.culturando.ProgActivity;
import com.example.davi.culturando.Radar;
import com.example.davi.*;


public class telaPrincipal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);

    }




    public void chamaEspacoArquivo(View v) {
        //setContentView(R.layout.telamapaarquivopublicodoceara);
        Intent i = new Intent(getApplicationContext(), ArquivoPublicoActivity.class);
        startActivity(i);
    }

    public void chamaEspacoJuvenal(View v) {

        //setContentView(R.layout.telamapacasadejuvenalgaleno);
        Intent i = new Intent(getApplicationContext(), JuvenalActivity.class);
        startActivity(i);
    }

    public void chamaEspacoCineteatro(View v) {
        //setContentView(R.layout.telamapacineteatrosaoluiz);
        Intent i = new Intent(getApplicationContext(), CineteatroActivity.class);
        startActivity(i);

    }

    public void chamaEspacoDragao(View v) {

        //setContentView(R.layout.telamapadragaodomar);
        Intent i = new Intent(getApplicationContext(), DragaoActivity.class);
        startActivity(i);
    }

    public void chamaEspacoTeatro(View v) {

        Intent i = new Intent(getApplicationContext(), AlencarActivity.class);
        startActivity(i);
        //setContentView(R.layout.telamapajosedealencar);
    }


    public void chamaEspacoSobrado(View v) {

        Intent i = new Intent(getApplicationContext(), JoseLourencoActivity.class);
        startActivity(i);
        //setContentView(R.layout.telamapadrjoselourenco);
    }

    public void chamaEspacoEscola(View v) {

        //setContentView(R.layout.telamapaescoladearteseoficios);
        Intent i = new Intent(getApplicationContext(), OficiosActivity.class);
        startActivity(i);
    }
    public void chamaEspacoMuseu(View v) {
        //// TODO: intent
        //setContentView(R.layout.telamapamuseudoceara);
        Intent i = new Intent(getApplicationContext(), MuseuActivity.class);
        startActivity(i);
    }

    public void chamaEspacoIracema(View v) {
        //TODO: intent
        //setContentView(R.layout.telamapaportoiracemadasartes);
        Intent i = new Intent(getApplicationContext(), IracemaActivity.class);
        startActivity(i);

    }


    public void chamaTelaCheck(View v) {
        //setContentView(R.layout.telacheck);
        Intent i = new Intent(getApplicationContext(), ChecklistActivity.class);
        startActivity(i);
    }

    public void chamaTelaConfig(View v) {

        //setContentView(R.layout.telaconfig);
        Intent i = new Intent(getApplicationContext(), ConfigActivity.class);
        startActivity(i);
    }

    public void chamaTelaRadar(View v) {

        //setContentView(R.layout.telaradar);
        Intent radar = new Intent(getApplicationContext(), Radar.class);
        startActivity(radar);
    }

    public void chamaTelaProg(View v) {

        //setContentView(R.layout.telaprog);
        Intent i = new Intent(getApplicationContext(), ProgActivity.class);
        startActivity(i);

    }

    public void chamaTelaPrincipal(View v) {

        //setContentView(R.layout.telaprincipal);

    }


    public void chamaTelaProgresso(View v) {
        setContentView(R.layout.telacheckprogresso);
    }

    public void chamaTelaDesafio(View v) {setContentView(R.layout.telacheckdesafio);}





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


