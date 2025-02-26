package com.mcl;

import com.mcl.Clases.Jugador;
import com.mcl.Clases.MutxamelFC;
import com.mcl.Enums.Equipos;
import com.mcl.Enums.Posiciones;

import java.util.Scanner;

public class AppMutxamelFC {

    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);

        System.out.println("=== App de mantenimiento del MutxamelFC ===");
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("    Dentro podremos añadir jugadores, modificar datos, y añadir acompañantes (solo seniors)");
        System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("    Dentro podemos añadir entrenadores y modificar sus datos");
        System.out.println("[3]. Mantenimiento de masajistas (añadir-modificar-salir) ");
        System.out.println("    Dentro podemos añadir masajistas y modificar sus datos");
        System.out.println("[4]. Consultar equipos");
        System.out.println("    Dentro deben listar los tipos de equipos del club y elegir uno ");
        System.out.println("[X]. Salir");
        String opcion = entrada.next();

        switch (opcion){
            case "1":
                System.out.println("===Mantenimiento de jugadores===");
                System.out.println("[1].Añadir nuevo jugador");
                System.out.println("[2].Modificar datos de jugador existente");
                System.out.println("[3].Crear acompañantes (sólo seniors)");
                System.out.println("[X].Salir");
                String opcionJugadores = entrada.next();
                switch (opcionJugadores){
                    case "1" :
                        System.out.println("Dime su nombre");
                        String nombre = entrada.next();
                        System.out.println("Dime su edad");
                        int edad = entrada.nextInt();
                        System.out.println("Dime que posicion juega [Portero, Defensa, Centrocampìsta, Delantero]");
                        String posicion = entrada.next();
                        System.out.println("Dime su dorsal");
                        int dorsal = entrada.nextInt();
                        Jugador jugador = new Jugador(nombre,edad, Posiciones.valueOf(posicion),dorsal, Equipos.Senior);
                        jugador.anadirJugador(jugador);
                        break;
                    case "2" :
                        
                        break;
                    case "3":
                        break;
                    case "X" :
                        break;

                }
                break;
            case "2" :

                break;
            case "3" :

                break;
            case "4" :
                break;
            case "X" :
                break;
        }

    }

}
