package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        double num = entrada.nextInt();
        
        azar(num);
        
    }
    
    static void azar(double x){
        
        int y; double s;
        
        s = x - 1;
        y = (int) (Math.random()*s+1);
        
        System.out.println("Numero aleatorio: " + y);
        
    }
    
}
