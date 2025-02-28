package com.mcl;

import com.mcl.Clases.Jugador;
import com.mcl.Clases.MutxamelFC;
import com.mcl.Enums.Equipos;
import com.mcl.Enums.Posiciones;

import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class AppMutxamelFC {

    private static final ArrayList<Jugador> listaJugadores = new ArrayList<>(); //lista de jugadores

    public static void main(String[] args) {

        //creamos los jugadores y los añadimos a la lista
        listaJugadores.add(new Jugador("Juan", 21, Posiciones.Delantero, 10, Equipos.Senior));
        listaJugadores.add(new Jugador("Pepe", 25, Posiciones.Centrocampìsta, 6, Equipos.Senior));
        listaJugadores.add(new Jugador("Alex", 30, Posiciones.Defensa, 4, Equipos.Senior));

        Scanner entrada = new Scanner(System.in);
        while (true) {//bucle infinito hasta que pongan x

            //menu
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

            if (opcion.equals("X")) { //si es x sale si no entra a submenu
                break;
            } else {
                subMenu(opcion);
            }

        }
    }


    private static void subMenu(String opcion) {
        Scanner entrada = new Scanner(System.in);

        while (true) { // bulce para el swich case
            switch (opcion) {
                case "1":
                    System.out.println("===Mantenimiento de jugadores===");
                    System.out.println("[1].Añadir nuevo jugador");
                    System.out.println("[2].Modificar datos de jugador existente");
                    System.out.println("[3].Crear acompañantes (sólo seniors)");
                    System.out.println("[X].Salir");
                    String opcionJugadores = entrada.next();
                    switch (opcionJugadores) {//opcion elejida del menu
                        case "1": //pedimos al usuario los datos
                            System.out.println("Dime su nombre");
                            String nombre = entrada.next();
                            System.out.println("Dime su edad");
                            int edad = entrada.nextInt();
                            System.out.println("Dime que posicion juega [Portero, Defensa, Centrocampìsta, Delantero]");
                            String posicion = entrada.next();
                            System.out.println("Dime su dorsal");
                            int dorsal = entrada.nextInt();
                            listaJugadores.add(new Jugador(nombre, edad, Posiciones.valueOf(posicion), dorsal, Equipos.Senior)); //creamos y añadimos jugador
                            break;
                        case "2":
                            System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugadores existente ===");
                            System.out.println();
                            System.out.println("¿De que jugador quieres hacer cambios?");
                            System.out.println();

                            for (int i = 0; i < listaJugadores.size(); i++) { //mostramos los jugadores

                                System.out.println("[" + i + " " + listaJugadores.get(i) + "]") ;
                            }
                            System.out.println();
                            System.out.println("===========================================");
                            System.out.println("Selecciona una opción ");
                            int jugador_elegido = entrada.nextInt();
                            break;
                        case "3":
                            break;
                        case "X": //vuelve al menu principal
                            return;
                    }
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    break;
                default:
                    return;
            }

        }
    }
}
