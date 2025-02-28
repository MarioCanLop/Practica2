package com.mcl.Clases;

import com.mcl.Interfaces.AccionesDeportivas;
import com.mcl.Enums.Equipos;
import com.mcl.Enums.Posiciones;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas {

    private Equipos categoria; //varibales
    private int dorsal; //varibales
    private Posiciones posicion; //varibales
    private ArrayList<Integer> dorsales_usados; //varibales


    public Jugador(String nombre, int edad, Posiciones posicion, int dorsal, Equipos categoria) { //constructor
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.categoria = categoria;
        dorsales_usados = new ArrayList<>();

    }

    public void anadirDorsal(int dorsal){
        dorsales_usados.add(dorsal);
    } //añadir dorsal  a la lista

    public Equipos getCategoria() {
        return categoria;
    } //obtener la categoria

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    } //cambiar la categoria

    public int getDorsal() {
        return dorsal;
    } //obtener el dorsal

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    } // cambiar dorsal

    public Posiciones getPosicion() {
        return posicion;
    } //obtener posicion

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    } // cambiar posicion

    public void calentar(){
        System.out.println("El jugador " + getNombre() + " sale a calentar");
    } // calentando

    public void descansar(){
        System.out.println("El jugador " + getNombre() + "esta descansando");
    } //descansando

    public void marcarGol(){
        System.out.println("GOOOOOOOOOOL");
        System.out.println("GOL del jugador " + getNombre() );
    }



    @Override
    public void concentrarse() { //Concentrarse para el partido
        System.out.println("El jugador" + getNombre() + "se esta concentrando");
    }

    @Override
    public void viajar(String ciudad) { //Viajando para el partido
        System.out.println("El jugador " + getNombre() + "esta viajando con el equipo hacia " + ciudad);
    }

    @Override
    public void celebrarGol() { //celebrando el gol
        System.out.println("El jugador " + getNombre() + " celebra el gol junto a sus compañeros");
    }

    @Override
    public void entrenar() { //entrenando
        System.out.println("El jugador " + getNombre() + " entrena junto a sus compañeros");
    }

    @Override
    public void jugarPartido(String rival) { //jugando
        System.out.println("El jugador " + getNombre() + "esta dispuntando el partido en la posicion de " + getPosicion());
    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombre() +
                ", Edad: "+ getEdad() +
                ", Categoría: " + categoria +
                ", Dorsal: " + dorsal +
                ", Posicion: " + posicion;
    }
}
