/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1_2019;

/**
 *
 * @author david
 */
public class Boletin10_1_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Juego_contra_jugador jue1 =new Juego_contra_jugador("PARTIDA 1");
        Jugador_contra_maquina jue2 = new Jugador_contra_maquina("Partida2");
        
        //jue1.empezar_juego();
        jue2.empezar_juego();
        
        
        
    }
    
}
