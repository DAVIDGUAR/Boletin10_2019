/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Juego_contra_jugador {

    private int num_oculto, num_elegido, num_intentos;
    private String juego;
    private boolean a = true,b=true;
    private int vueltas = 1;

    public Juego_contra_jugador(String juego) {
        this.juego = juego;
    }

    public void empezar_juego() {
        
        
        while(b){
         JOptionPane.showConfirmDialog(null, "Jugador 1 estas preparado");
            num_oculto = Integer.parseInt(JOptionPane.showInputDialog("******** JUGADOR 1 ******  \nIntroduce un numero del 1-50 "));
            
            if(num_oculto > 0 && num_oculto < 51)
            
            num_intentos = Integer.parseInt(JOptionPane.showInputDialog("JUGADOR 1 \nIntroduce numero maximo de intentos "));
            
            b=false;
            
            
        }
        
        JOptionPane.showConfirmDialog(null, "Jugador 2 estas preparado");
        JOptionPane.showMessageDialog(null,"Tienes "+num_intentos+" intentos para hacertar");
        while (a) {

           

            
            num_elegido = Integer.parseInt(JOptionPane.showInputDialog("****** JUGADOR 2 ****** \nAdivina el numero \nRANGO entre(1-50) \n ambos incluidos "));

            if ( num_intentos!=vueltas ) {

                if (num_elegido > 0 && num_elegido < 51) {

                    if (num_oculto != num_elegido) {

                        if (num_oculto < num_elegido) {
                            System.out.println("El numero que buscas es mas pequeño");
                            vueltas++;

                        } else if (num_oculto > num_elegido) {
                            System.out.println("El numero que buscas es mas grande");
                            vueltas++;
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "****** CORRECTO ******");
                        a = false;

                    }

                } else {

                    System.out.println("Numero no valido");

                }

            } else {

                JOptionPane.showMessageDialog(null, "******GAME OVER******");
                System.out.println("Lo siento no lo as conseguido");
                a = false;

            }

        }
        
        
        System.out.println("Numero de intentos = " + vueltas);

    }

}
