package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        cantidadDeDivisores(num);
        
    }
    
    static void cantidadDeDivisores(int x){
        
        int j=0;
        
        for (int i = 1; i <= x; i++) {
            
            if(x % i == 0){
                
                j++;
                
            }
            
        }
        
        System.out.println("La cantidad de divisores es: " + j);
        
        return j;
        
    }
    
    
}
