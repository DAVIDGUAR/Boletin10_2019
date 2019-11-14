/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1_2019;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Jugador_contra_maquina {

    private int num_oculto, num_elegido, num_intentos;
    private String juegom;
    private boolean a = true;
    private int vueltas = 1;

    public Jugador_contra_maquina(String juegom) {
        this.juegom = juegom;
    }

    public void empezar_juego() {

        Random aleatorio = new Random();

        num_oculto = aleatorio.nextInt(51);
        
        //System.out.println(num_oculto);    //para comprobar que el juego funciona mostrandome el numero aculto antes de empezar a jugar

        JOptionPane.showConfirmDialog(null, "Jugador 1 estas preparado");

        while (a) {

            num_elegido = Integer.parseInt(JOptionPane.showInputDialog("****** JUGADOR 1 ****** \nAdivina el numero \nRANGO entre(1-50) \n ambos incluidos "));

            if (num_elegido < 0) {

                    System.out.println("Numero no valido");

                }
            
            
            if (num_elegido > 0 && num_elegido < 51) {

                int operacion = num_oculto - num_elegido;
                if (operacion<0){
                    
                    operacion=operacion*(-1);
                    
                }
                

                if (num_oculto != num_elegido) {

                    if (operacion <= 5) {
                        System.out.println("El numero que buscas esta muy cerca");
                        vueltas++;

                    } else if (operacion > 5 && operacion < 10) {
                        System.out.println("El numero que buscas esta cerca");
                        vueltas++;
                    } else if (operacion >= 10 && operacion <= 20) {
                        System.out.println("El numero que buscas esta lejos");
                        vueltas++;

                    } else if (operacion > 20) {
                        System.out.println("El numero que buscas esta muy lejos");
                        vueltas++;

                    } 

                } else{

                        JOptionPane.showMessageDialog(null, "****** CORRECTO ******");
                        a = false;

                    }
            }
        }

        System.out.println("Numero de intentos = " + vueltas);

    }

}
