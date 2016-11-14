/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mac;

import java.util.ArrayList;

/**
 *
 * @author Mirko
 */
public class Equipo {
    private ArrayList<Jugador> jugadores;
    private String nombre;
    private int puntos;

    public Equipo(ArrayList<Jugador> jugadores, String nombre, int puntos) {
       jugadores.add(new Jugador("MirkoPllas",5));
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    
}
