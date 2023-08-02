package org.example;

public class Endereco {

    private long numero;
    private String rua;

    public Endereco(long numero, String rua) {
        this.numero = numero;
        this.rua = rua;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
