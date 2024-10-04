package src;
import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creamos el scanner
        System.out.println("ingrese el numero que decea saber si es primo"); //le pedimos al usuario que ingrese un numero que desea vemrificar
        int number = input.nextInt();
        boolean prime = true;//decimos que no es primo
        //un for para que divida el numero por todos los numeros que son 
        for(int i = 2; i < number; i++){
            //si se divide por otro numero que no sea
            if (number % i == 0) {
                prime=false;                
            }
        }
        //imprimimos si es primo o no
        if(prime == true){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
        input.close();//cerramos el scanner
        //calculamos los numeros primos
        for(int i = 1 ; i <= 100; i++){
            prime = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0) {
                    prime=false;                
                }                
            }
            //imprimimos solo los primos
            if(prime == true){
                System.out.println(i);
            }
        }

    }

}
