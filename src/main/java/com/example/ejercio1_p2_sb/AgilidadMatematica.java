package com.example.ejercio1_p2_sb;

public class AgilidadMatematica {
    private int contadorAciertos;
    private int contadorFalloos;
    private int incognita;
    private int NumeroOperaciones=20;

    public AgilidadMatematica() {
    }

    public AgilidadMatematica(int contadorAciertos, int contadorFalloos, int incognita, int numeroOperaciones) {
        this.contadorAciertos = contadorAciertos;
        this.contadorFalloos = contadorFalloos;
        this.incognita = incognita;
        NumeroOperaciones = numeroOperaciones;
    }

    public int getContadorAciertos() {
        return contadorAciertos;
    }

    public void setContadorAciertos(int contadorAciertos) {
        this.contadorAciertos = contadorAciertos;
    }

    public int getContadorFalloos() {
        return contadorFalloos;
    }

    public void setContadorFalloos(int contadorFalloos) {
        this.contadorFalloos = contadorFalloos;
    }

    public int getIncognita() {
        return incognita;
    }

    public void setIncognita(int incognita) {
        this.incognita = incognita;
    }

    public int getNumeroOperaciones() {
        return NumeroOperaciones;
    }

    public void setNumeroOperaciones(int numeroOperaciones) {
        NumeroOperaciones = numeroOperaciones;
    }
}
