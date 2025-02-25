package com.mcl.Clases;

public class Masajista extends MutxamelFC {

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }


    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + getNombre() + "le esta dando un masaje a " + jugador.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + "se concentra junto al equipo para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajitsta " + getNombre() + "viaja junto al equipo hacia " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + "celebra el gol junto a su equipo");
    }
}
