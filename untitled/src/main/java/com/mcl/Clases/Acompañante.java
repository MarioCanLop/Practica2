package com.mcl.Clases;

public class Acompañante extends MutxamelFC {

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, String parentesco, Jugador integrante) {
        super(nombre, edad);
        this.parentesco = parentesco;
        this.integrante = integrante;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void animarEquipo(){

    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra en el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() +" de " + integrante.getNombre()  + " viajando a " + ciudad );
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + " celebra el gol");
    }
}
