package com.mcl.Clases;

public class Acompañante extends MutxamelFC {

    private Jugador integrante; //vairables
    private String parentesco; //variables

    public Acompañante(String nombre, int edad, String parentesco, Jugador integrante) { //Constructor
        super(nombre, edad);
        this.parentesco = parentesco;
        this.integrante = integrante;
    }

    public Jugador getIntegrante() {
        return integrante;
    } //obtenemos el jugador

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    } //cambiamos el jugador

    public String getParentesco() {
        return parentesco;
    } //obtenemos parentesco

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    } //cambiamos parentesco

    public void animarEquipo(){
        System.out.println(getNombre() +"Animando al equipo como uno mas");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra en el partido");
    } //Concentrarse para el partido

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() +" de " + integrante.getNombre()  + " viajando a " + ciudad );
    }//Viajando para el partido

    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + " celebra el gol");
    } //celebrando el gol
}
