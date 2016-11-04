/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio13;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class Unidad3Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un método milímetros para pasar una medida dada en metros, centímetros y milímetros a
        milímetros. A este método se le pasan tres parámetros: metros, centímetros y milímetros y
        convierte todo a milímetros.
        Utilízalo en un programa que pida una medida en metros, cm y mm (los tres datos por separado) e
        imprima el número total de milímetros.*/
        
        Scanner tc=new Scanner(System.in);
            double m,cm,mm;
            
            System.out.println("Introduce una medida");
            System.out.println("Metros");
            m=tc.nextDouble();
            
            System.out.println("Introduce una medida");
            System.out.println("Centimetros");
            cm=tc.nextDouble();
            
            System.out.println("Introduce una medida");
            System.out.println("Milimetros");
            mm=tc.nextDouble();
            
            System.out.println(milimetros(m,cm,mm));
            
            
        
        
    }
    /**
     * Conversion a milimetros
     * @param metros
     * @param cm
     * @param mm
     * @return 
     */
    public static double milimetros(double metros, double cm, double mm){
    
        return metros*1000+cm*10+mm;
    }
    
}
