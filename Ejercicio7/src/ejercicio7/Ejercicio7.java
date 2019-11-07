package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese cantidad de numeros: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        System.out.println("Ingrese caracter que desea repetir: ");
        Scanner teclado = new Scanner(System.in);
        char carac = teclado.next().charAt(0);
        
        imprimirSimbolo(num,carac);
        
    }
    
    static void imprimirSimbolo(int x, char c){
        
        
        for (int i = 0; i < x; i++) {
            
            System.out.print(c);
            
        }
        
        System.out.println(" ");
        
    }
}
