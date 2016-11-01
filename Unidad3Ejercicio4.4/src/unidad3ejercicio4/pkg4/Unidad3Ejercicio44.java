/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio4.pkg4;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad3Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseña un método esPrimo() que reciba como parámetro un entero y devuelva si ese número es
        primo o no. Utilízalo en un programa que solicite un número, N, y genere los N primeros números
        primos.*/
        
        Scanner tc = new Scanner(System.in);

        System.out.println("Dame el numero");
        int numero = tc.nextInt();
        int n1;
        for (n1 = 1; n1 >= numero; n1++) {
            System.out.println(esPrimo(numero));
        }
    }

    /**
     * Que numeros son primos
     *
     * @param num
     * @return respuesta
     */
    public static boolean esPrimo(int num) {

        boolean primo;
        if (num == (num / num) && num == (num / 1)) {
            primo = true;
        } else {
            primo = false;
        }
        return primo;
    }
}
