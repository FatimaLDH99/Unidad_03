
package com.mycompany.cajeroautomatico;
import java.util.Scanner;

public class Cajeroautomatico {

    public static void main(String[] args) {
 
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("--------Bienvenido al Cajero Automático--------");
            System.out.println("a. Consultar Saldo.");
            System.out.println("b. Depositar efectivo.");
            System.out.println("c. Retirar efectivo.");
            
            int opc = lectura.nextInt();
            double saldo = 26000; 
            
            if ((opc)c >= saldo
            System.out.println ("Retiro existoso");
            }
            else
                System.out.println ("fondos insuficientes.");   
                    
    switch (opc)
    {
        case 1:
            System.out.println ("Cunsulta de saldo: ");
            break;
        case 2:
             System.out.println ("Depositar efectivo: ");
        case 3:  
            System.out.println ("Retirar efectivo: ");            
            break;
        default:
             System.out.println ("Opción no valida. Por Favor seleccione otra opcion.");
    }
    }
}
