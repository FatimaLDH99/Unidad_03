//programa que pida al usuario un numero entero y diga si es par o impar
package com.mycompany.tarea01;
import java.util.Scanner; 

public class Tarea01 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingresa un número entero: ");
        int num1 = lectura.nextInt();
        
        int num = 2;
        
        if (((num1)%2)==0)
            System.out.println("El número que ingresaste sí es par");
        
        else{
            System.out.println("El número que ingresaste no es par");
        }
        
    }
}
