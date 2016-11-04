/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio12;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class Unidad3ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un método cifras para determinar cuántas cifras posee un número entero. A este método
        se le pasa un número y devuelve el número de cifras que contiene.
        Utilízalo en un programa que pida por teclado números hasta que se teclee un 0 e indique la
        cantidad de cifras de cada número introducido.*/
        
        Scanner tc=new Scanner(System.in);
        int num1;
        System.out.println("Introduce un numero");
        num1 = tc.nextInt();
        
        while (num1 !=0){
        if  (num1>=1 && num1 <=9999){
            System.out.println("El numero"+num1+"Tiene"+cifras(num1));
        }else{
            System.out.println("Fuera de rango");
        }
    }
}
    public static int cifras(int num){
    
        int numCifras;
        
        if (num>=1000){
            numCifras=4;
        }else if (num>=100){
            numCifras=3;
        }
        
        /*int cont=0;
        
        while (num != 0);
        num = num / 10;
        cont++;
        return cont;*/
        return numCifras;
    }
    
}