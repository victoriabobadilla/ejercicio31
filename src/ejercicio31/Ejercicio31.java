/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe el radio: ");
        int number1 = Integer.parseInt(reader.nextLine());                
        
        double cir = 2 * Math.PI * number1;
        String toPrint = "\nLa Circunferencia del circulo es: " + cir;
        System.out.println(toPrint);
    }
    
}
