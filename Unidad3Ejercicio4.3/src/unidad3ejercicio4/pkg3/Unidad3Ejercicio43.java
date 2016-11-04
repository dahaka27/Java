/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio4.pkg3;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class Unidad3Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int bas,alt;
        Scanner tc=new Scanner(System.in);
            System.out.println("Introduce las base");
        bas=tc.nextInt();
        
            System.out.println("Introduce la altura");
        alt=tc.nextInt();
        
        System.out.println("El area es "+area(bas,alt)+" La longitud es "+longitud(bas,alt));   
}
    public static int area(int b,int a){
        System.out.println("Este metodo area es un INT");
        return b*a;
    }
    public static double area(double b, double a){
        System.out.println("Este metodo area es un DOUBLE");
        return b*a;
    }
    public static int longitud(int b,int a){
        System.out.println("Este metodo longitud es un INT");
        return 2*(b+a);
    }
    public static double longitud(double b, double a){
        System.out.println("Este metodo es longitud un DOUBLE");
        return 2*(b+a);
    }
}
