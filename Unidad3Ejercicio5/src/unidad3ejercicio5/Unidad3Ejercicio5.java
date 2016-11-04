/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int deseo /*sino,*/ ;
        
            Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("*****************");
            System.out.println("Calculadora");
            System.out.println("*****************");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.println("");

            System.out.print("Introduce la opcion deseada: ");
            deseo = teclado.nextInt();
            

            if (deseo != 5 && deseo >0 && deseo <5)
  
            switch (deseo) {
                case 1:
                    System.out.println("El resultado es "+suma(0,0));
                    break;
                case 2:
                    System.out.println("El resultado de "+resta(0,0));
                    break;
                case 3:
                    System.out.println("El resultado de "+producto(0,0));
                    break;
                case 4:
                    System.out.println("El resultado de "+division(0,0));
                    break;
                case 5:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Numero introducido no valido... Reiniciando programa");
                    break;
            }
        } while (deseo != 5/* && sino == 1*/);
  
    }
    public static double suma(double n1, double n2){
    
        Scanner ts=new Scanner(System.in);
        
            System.out.println("Introduce un numero positivo");
            n1=ts.nextDouble();
            
            System.out.println("Introduce otro numero positivo");
            n2=ts.nextDouble();
        
            return n1+n2; 
    }
      public static double resta(double n1, double n2){
    
        Scanner ts=new Scanner(System.in);
        
            System.out.println("Introduce un numero positivo");
            n1=ts.nextDouble();
            
            System.out.println("Introduce otro numero positivo");
            n2=ts.nextDouble();
        
            return n1-n2; 
    }
       public static double producto(double n1, double n2){
    
        Scanner ts=new Scanner(System.in);
        
            System.out.println("Introduce un numero positivo");
            n1=ts.nextDouble();
            
            System.out.println("Introduce otro numero positivo");
            n2=ts.nextDouble();
        
            return n1*n2; 
    }
        public static double division(double n1, double n2){
    
        Scanner ts=new Scanner(System.in);
        
            System.out.println("Introduce un numero positivo");
            n1=ts.nextDouble();
            
            System.out.println("Introduce otro numero positivo");
            n2=ts.nextDouble();
        
            return n1/n2; 
    }
}