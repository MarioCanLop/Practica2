package com.mcl;

import com.mcl.Clases.Acompañante;
import com.mcl.Clases.Entrenador;
import com.mcl.Clases.Jugador;
import com.mcl.Clases.Masajista;
import com.mcl.Enums.Equipos;
import com.mcl.Enums.Posiciones;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Juan", 31, Posiciones.Delantero, 10, Equipos.Senior);
        Jugador jugador2 = new Jugador("Pepe", 21, Posiciones.Centrocampìsta, 7, Equipos.Senior);
        Jugador jugador3 = new Jugador("Luis", 41, Posiciones.Defensa, 4, Equipos.Senior);
        Jugador jugador4 = new Jugador("Marcos", 20, Posiciones.Delantero, 9, Equipos.Senior);

        Entrenador entrenador1 = new Entrenador("Juan Alberto", 50, Equipos.Senior, "4-3-3");

        Masajista masajista1 = new Masajista("Juaquin", 23, "Grado universitario", 4);

        Acompañante acompañante1 = new Acompañante("Maria", 33, "Hermana", jugador1);

        jugador1.concentrarse();

        jugador3.entrenar();

        masajista1.darMasaje(jugador4);

        entrenador1.viajar("Madrid");

        entrenador1.planificarEntrenamiento();

        jugador3.entrenar();

        jugador4.descansar();

        jugador1.calentar();

        jugador2.jugarPartido("Real Madird");

        masajista1.darMasaje(jugador1);

        entrenador1.viajar("Muchamiel");

        jugador2.descansar();

    }

}
