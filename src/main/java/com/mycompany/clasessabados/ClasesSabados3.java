package com.mycompany.clasessabados;

import java.util.Scanner;


public class ClasesSabados3 {
       public static void main(String[] args) {
          Scanner sp = new Scanner(System.in);
          int numero_entero;
          int numero_doble;
          int numero_triple;
          System.out.println("ingrese un numero para obener su doble y su triple");
          
          numero_entero = sp.nextInt();
          
          numero_doble = numero_entero *2;
          numero_triple = numero_entero *3;
          System.out.println("el doble de" + numero_entero + "=" + numero_doble);        
          System.out.println("el doble de" + numero_entero + "=" + numero_triple);
          
       }

}
