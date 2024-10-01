package src;
import java.util.Scanner;

public class tabla_multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el numero");
        int numero=scanner.nextInt(); 

        for(int i = 0; i<=10; i++){
            int resultado = numero*i;
            System.out.println(numero+"*"+i+ "="+resultado);
        }
        scanner.close();
    }
}
