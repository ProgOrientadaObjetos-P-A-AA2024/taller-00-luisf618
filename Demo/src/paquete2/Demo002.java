/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena1 = Mensaje.obtenerMensaje();
        String cadenaFinal;
        int habitantes = Informacion.obtenerHabitantes();
        int opcion;
        // usar printf;
        cadenaFinal = String.format("%s con %d\n", cadena1, habitantes);
        System.out.println("Ingrese un numero para imprimir la cadena");
        opcion = entrada.nextInt();
        if (opcion >= 1 && opcion <= 5) {
            System.out.printf("%s", cadenaFinal);
        } else {
            System.out.printf("%s", cadenaFinal.toUpperCase());
        }

    }

}