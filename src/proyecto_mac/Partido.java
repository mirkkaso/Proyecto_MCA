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
public class Partido {

    private String[] equipos;
    private int[] resultado;

    public Partido(String local, String visitante, int golesLocal, int golesVisitante) {
        resultado = new int[2];
        equipos= new String[2];
        
        resultado[0] = golesLocal;
        resultado[1] = golesVisitante;
        
        equipos[0]=local;
        equipos[1]=visitante;
    }
    
    

}
