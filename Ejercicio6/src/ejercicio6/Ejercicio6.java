package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        int num,num2,num3;
        
        System.out.println("Ingrese 3 numeros: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt(); num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        
        mayorDeTres(num,num2,num3);

    }
    
    static void mayorDeTres(int x, int y, int z){
        
        int m=0;
        
        if(x > y){
            
            m = x;
            
        }else if(y > x){
            
            m = y;
            
        }
        if(z > m){
            
            m = z;
            
        }
        
        System.out.println("El numero maximo es: " + m);
        
    }
    
}
