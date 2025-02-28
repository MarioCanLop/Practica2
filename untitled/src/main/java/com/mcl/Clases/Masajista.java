package com.mcl.Clases;

public class Masajista extends MutxamelFC {

    private String titulacion; //variables
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) { // constructor
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    } //obtienes titulacion

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    } //cambias titulacion

    public int getAnosExperiencia() {
        return anosExperiencia;
    } //obtienes años de experiencia

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    } //cambias años de experiencia


    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + getNombre() + "le esta dando un masaje a " + jugador.getNombre());
    } //dar el masaje al jugador

    @Override
    public void concentrarse() { //Concentrarse para el partido
        System.out.println("El masajista " + getNombre() + "se concentra junto al equipo para el partido");
    }

    @Override
    public void viajar(String ciudad) { //Viajando para el partido
        System.out.println("El masajitsta " + getNombre() + "viaja junto al equipo hacia " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre() + "celebra el gol junto a su equipo");
    } //celebrando el gol

    @Override
    public String toString() {
        return "Masajista{" +
                "Nombre= " + getNombre() +  '\'' +
                ", Edad= " + getEdad()+  '\'' +
                ", titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
