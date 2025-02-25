package com.mcl.Clases;

import com.mcl.Interfaces.AccionesDeportivas;
import com.mcl.Enums.Equipos;
import com.mcl.Enums.Posiciones;

public class Jugador extends MutxamelFC implements AccionesDeportivas {

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Posiciones posicion, int dorsal, Equipos categoria) {
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.categoria = categoria;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void calentar(){
        System.out.println("El jugador " + getNombre() + " sale a calentar");
    }

    public void descansar(){
        System.out.println("El jugador " + getNombre() + "esta descansando");
    }

    public void marcarGol(){
        System.out.println("GOOOOOOOOOOL");
        System.out.println("GOL del jugador " + getNombre() );
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador" + getNombre() + "se esta concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + getNombre() + "esta viajando con el equipo hacia " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador " + getNombre() + " celebra el gol junto a sus compañeros");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " entrena junto a sus compañeros");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + "esta dispuntando el partido en la posicion de " + getPosicion());
    }
}
