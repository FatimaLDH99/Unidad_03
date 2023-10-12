
import java.util.Scanner;


public class SerieFibonacci_f {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("-----Serie Fibonacci-----");
        System.out.println("Ingresa cuantos números quieres ver:");
        int fib = lectura.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        int suma = 1;
        
        for (int i = 1; i < fib; i++) {
             
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        
    }
    }
}
