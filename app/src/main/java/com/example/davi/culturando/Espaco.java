package com.example.davi.culturando;

import com.google.*;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by davitabosa on 20/01/17.
 */

public class Espaco implements Comparable<Espaco> {
    private double latitude, longitude;
    private String nome;
    private LatLng posicao;
    private String descricao;
    private ArrayList<Evento> eventos;


    public void baixarDescricaoPeq() {
        //codigo do Volley pra baixar a descricao pequena.
    }


    public Espaco(double latitude, double longitude, String nome) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        posicao = new LatLng(latitude,longitude);
        eventos = new ArrayList<Evento>();
    }

    public Espaco(JSONArray info) {
        try {
            JSONObject obj = info.getJSONObject(0);
            JSONObject location = obj.getJSONObject("location");

            this.latitude = Double.parseDouble(location.getString("latitude"));
            this.longitude = Double.parseDouble(location.getString("longitude"));
            this.nome = obj.getString("name");
            posicao = new LatLng(this.latitude,this.longitude);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Espaco(JSONObject obj) {
        JSONObject location = null;
        try {
            location = obj.getJSONObject("location");

            this.latitude = Float.parseFloat(location.getString("latitude"));
            this.longitude = Float.parseFloat(location.getString("longitude"));
            this.nome = obj.getString("name");
            posicao = new LatLng(this.latitude,this.longitude);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void pushEvento(Evento e) {
        eventos.add(e);
    }

    public LatLng getPosicao() {
        return posicao;
    }
    public String getDescricao() {
        return descricao;
    }
    //pra ordenar o ArrayList( ainda ta "bugado")
    @Override
    public int compareTo(Espaco espaco) {
        return this.nome.compareTo(espaco.getNome());
    }


    //calcula a distancia deste espaco até um ponto definido.
    public double distanciaAte(double latAtual, double longAtual) {
        LatLng posAtual;
        double dist;
        posAtual = new LatLng(latAtual,longAtual);
        //System.out.println("distanciaAte"+ posAtual.toString());
        dist = SphericalUtil.computeDistanceBetween(getPosicao(),posAtual);
        System.out.println("Distancia: "+ dist+"m");
        return dist;

    }
}