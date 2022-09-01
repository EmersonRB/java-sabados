
package com.mycompany.clasessabados;

import static java.lang.Math.PI;
import java.util.Scanner;

public class ClasesSabados5 {
    public static void main(String[] agrs){
        Scanner sp = new Scanner(System.in);
        double r, l, a;
        System.out.println("ingrese el valor del radio");
        r = sp.nextDouble();
         l = 2*PI*r;
         a = PI * Math.pow(r, 2);
         System.out.println("longitud de la circunferencia =" + l);
         System.out.println(" area de la cincunferencia: " + a);
         
    }    
}
