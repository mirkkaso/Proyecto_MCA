/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mirko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("Jugadores.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Equipos.txt"));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String line = br.readLine();
        String line2 = br2.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());

            String[] dada = line.split(";");
            Jugador jugador = new Jugador(dada[0], Integer.parseInt(dada[1]));

            line = br.readLine();
        }
        while (line2 != null) {

            sb.append(line2);
            sb.append(System.lineSeparator());

            String[] dada2 = line2.split(";");
            Equipo equipos = new Equipo() //Leer Jugadores
            
        }
    }

}
