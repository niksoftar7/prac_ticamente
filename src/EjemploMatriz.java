package src;
public class EjemploMatriz {
    public static void main(String[] args) {
        // Declarar e inicializar una matriz de 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir todos los elementos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
                String[] frutas = {"manzana", "naranja", "banana", "fresa"};  
        
                // Uso del bucle foreach para iterar sobre el arreglo de frutas  
                for (String i : frutas) {  
                    System.out.println(i);  
                }  
            

            int[] numeros = {10, 20, 30, 40, 50} ;

            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
            
}
}