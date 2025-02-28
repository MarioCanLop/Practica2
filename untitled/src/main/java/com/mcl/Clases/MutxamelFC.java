package com.mcl.Clases;

import com.mcl.Interfaces.FuncionesIntegrantes;

import java.util.ArrayList;

public abstract class MutxamelFC implements FuncionesIntegrantes {

    private String nombre; //variables
    private int edad; //variables

    public MutxamelFC(String nombre, int edad) { //constructor
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    } //obten nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //cambia nombre

    public int getEdad() {
        return edad;
    } //obten edad

    public void setEdad(int edad) {
        this.edad = edad;
    } //cambia edad






}
