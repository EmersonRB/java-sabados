
package com.mycompany.clasessabados;

import java.util.Scanner;

public class ClasesSabados4 {
     public static void main(String[] args) {
         Scanner sp = new Scanner(System.in);
         double F, C;
         System.out.println("ingrese la cantidad de grados centigrados");
         C = sp.nextDouble();
         
         F = 32 + ( 9 * C/5);
          System.out.println(C +"grados centigrados son " + F + "grados fahrenheit");
           
         
         
     }
}
