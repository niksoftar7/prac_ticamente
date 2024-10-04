package src;
public class fizzbuzz {  
    
    public static void main(String[] args) {  
        
        // Bucle para iterar desde 1 hasta 100 
        for (int i = 1; i <= 100; i++) {  
            
            // Comprueba si 'i' es divisible por 3 y 5 al mismo tiempo  
            if (i % 3 == 0 && i % 5 == 0) {  
                // Si es divisible por ambos, imprime "fizzbuzz"  
                System.out.println("fizzbuzz");  
            }  
            // Si el número 'i' es divisible solo por 3  
            else if (i % 3 == 0) {  
                // Imprime "fizz"  
                System.out.println("fizz");  
            }  
            // Si el número 'i' es divisible solo por 5  
            else if (i % 5 == 0) {  
                // Imprime "buzz"  
                System.out.println("buzz");  
            }  
            // Si 'i' no es divisible ni por 3 ni por 5  
            else {  
                // Imprime el número 'i' mismo  
                System.out.println(i);  
            }  
        }  
    }  
}