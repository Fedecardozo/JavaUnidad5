package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        
        cubo(num);
        
    }
    
    static void cubo(int x){
        
        int r;
        
        r = x*x*x;
        
        System.out.println("El numero " + x + " elevado al cubo es igual a: " + r);
        
        
    }
    
}
