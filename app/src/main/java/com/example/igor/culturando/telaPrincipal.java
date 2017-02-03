package com.example.igor.culturando;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class telaPrincipal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);

    }




    public void chamaEspacoArquivo(View v) {
        setContentView(R.layout.telamapaarquivopublicodoceara);
    }

    public void chamaEspacoJuvenal(View v) {
        setContentView(R.layout.telamapacasadejuvenalgaleno);
    }

    public void chamaEspacoCineteatro(View v) {
        setContentView(R.layout.telamapacineteatrosaoluiz);
    }

    public void chamaEspacoDragao(View v) {
        setContentView(R.layout.telamapadragaodomar);
    }

    public void chamaEspacoTeatro(View v) {
        setContentView(R.layout.telamapajosedealencar);
    }


    public void chamaEspacoSobrado(View v) {
        setContentView(R.layout.telamapadrjoselourenco);
    }

    public void chamaEspacoEscola(View v) {
        setContentView(R.layout.telamapaescoladearteseoficios);
    }
    public void chamaEspacoMuseu(View v) {
        setContentView(R.layout.telamapamuseudoceara);
    }

    public void chamaEspacoIracema(View v) {
        setContentView(R.layout.telamapaportoiracemadasartes);
    }


    public void chamaTelaCheck(View v) {setContentView(R.layout.telacheck);}

    public void chamaTelaConfig(View v) {setContentView(R.layout.telaconfig);}

    public void chamaTelaRadar(View v) {

        //setContentView(R.layout.telaradar);
        Intent radar = new Intent(getApplicationContext(), com.example.davi.culturando.radar.class);
        startActivity(radar);
    }

    public void chamaTelaProg(View v) {
        setContentView(R.layout.telaprog);
    }

    public void chamaTelaPrincipal(View v) {
        setContentView(R.layout.telaprincipal);
    }


    public void chamaTelaProgresso(View v) {setContentView(R.layout.telacheckprogresso);}

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


