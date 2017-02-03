package com.example.davi.culturando;

import java.util.Date;

/**
 * Created by davitabosa on 20/01/17.
 */
public class Evento {
    private Date data;
    private String nome;

    public Evento(String nome,Date data) {
        this.data = data;
        this.nome = nome;
    }

    public Evento() {
        data = new Date();
        nome = new String();
    }

    public Date getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}
