package com.mcl.Clases;

import com.mcl.Interfaces.AccionesDeportivas;
import com.mcl.Enums.Equipos;

public class Entrenador extends MutxamelFC implements AccionesDeportivas {

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) { //constructor
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    public Equipos getEquipo() {
        return equipo;
    } //obten el equipo al que entrena

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    } //cambio el equipo al que entrena

    public String getFormacionPreferida() {
        return formacionPreferida;
    } //obten la formacion

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    } //cambia la formacion

    public void planificarEntrenamiento(){
        System.out.println("El entrenador esta planificando el entreno");
    } //planifica el entreno

    public void hacerCambios(Jugador jugador1, Jugador jugador2){ //hace cambios

        System.out.println("Se va a realizar un cambio en el terreno de juego");

        System.out.println("El jugador " + jugador1.getNombre() + "es sustituido por " + jugador2.getNombre());

        System.out.println("El cambio se ha efectuado");
    }


    @Override
    public void concentrarse() {
        System.out.println("El entrenados " +getNombre() + " se concentra en el partido" );
    } //Concentrarse para el partido

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + getNombre() + " esta viajando junto al equipo hacia " + ciudad);
    }//Viajando para el partido

    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + " celebra el gol de manera euforica");
    } //celebrando el gol

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " esta entrenando a su equipo");
    } //entrenando

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El " + getEquipo() + " de " + getNombre() + " esta jugando contra " + rival);
    }//jugando
}
