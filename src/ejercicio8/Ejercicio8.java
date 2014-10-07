/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {
   public static void main(String[] args) {
       float grados, valorF, valorK;
       Scanner sc = new Scanner (System.in);
       System.out.println ("Introduzca el grado:");
       grados = sc.nextFloat();
       valorK = grados+273;
       valorF = grados*1800+32;
       System.out.println ("Equivale a "+valorK+" grados Kelvin, y "+valorF+" grados Fahrenheit.");
    }
    
}
