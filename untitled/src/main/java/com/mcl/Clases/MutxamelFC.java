package com.mcl.Clases;

import com.mcl.Interfaces.FuncionesIntegrantes;

import java.util.ArrayList;

public abstract class MutxamelFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;
    private ArrayList<Jugador> jugadores;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void anadirJugador(Jugador jugador){

        for (Jugador jugador1: jugadores){

            if (jugador.equals(jugador1)){
                continue;
            }else {
                jugadores.add(jugador);
            }

        }

    }

}
