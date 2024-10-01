package src;
public class cintador_pares {
    public static void main(String[] args) {
        int container =0;
        for(int i=0; i<100; i++){
            if ((i %2)==0){
                container=container+1;
            } else{
                container=container+0;
            }
        }
        System.out.println("la cantidad de numeros pares es: "+container);
    }
}
