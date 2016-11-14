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
public class Temporada {

    private static int AUTO_INT = 1;
    private int id;
    private ArrayList<Partido> partidos;

    public Temporada() {
        this.id=AUTO_INT;
        AUTO_INT++;
        this.partidos.add(new Partido("Madri","Barcelona",3,4));
    }
    

}
