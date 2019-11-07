package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

  
    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        
        esPar(num);
        
        
    }
    
    static void esPar(int x){
        
        
        if(x%2 == 0){
            
            System.out.println(true);
            
            
        }else{
            
            System.out.println(false);
            
        } 
            
        
        
    }
    
}
