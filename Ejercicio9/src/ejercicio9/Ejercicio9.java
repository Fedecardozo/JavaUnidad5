package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese una letra: ");
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.next().charAt(0);
        
        esVocal(letra);
        
    }
    
    static void esVocal(char c){
        
        switch(c){
            
            case 'a':
                System.out.println(true);
                break;
            case 'e':
                System.out.println(true);
                break;
            case 'i':
                System.out.println(true);
                break;
            case 'o':
                System.out.println(true);
                break;
            case 'u':
                System.out.println(true);
                break;    
            case 'A':
                System.out.println(true);
                break;
            case 'E':
                System.out.println(true);
                break;
            case 'I':
                System.out.println(true);
                break;
            case 'O':
                System.out.println(true);
                break;
            case 'U':
                System.out.println(true);
                break;  
            default:
                System.out.println(false);
                break;
        }
        
        
    }
    
}
