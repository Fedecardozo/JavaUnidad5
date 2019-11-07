package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int num,num2;
        char letra;
        
        System.out.println("Ingrese 2 numeros: ");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt(); num2 = teclado.nextInt();
        
        letra = inicio();
        suma_resta(letra,num,num2);
        
        
    }
    
    static char inicio(){
        
        char c;
        
        System.out.println("Ingrese 'R' para resta o 'S' para suma:");
        Scanner entrada = new Scanner(System.in);
        c = entrada.next().charAt(0);
        
        return c;
        
    }
    
    static void suma_resta(char c ,int x, int y){
        
        int s,r;
        
        switch(c){
        
        case 'S':
     
            s = x + y;
            System.out.println("La suma es: " + s);    
            break;
        case 'R':
            
            r = x - y;
            System.out.println("La resta es: " + r);
            break;
    
        }
        
    }
    
}
