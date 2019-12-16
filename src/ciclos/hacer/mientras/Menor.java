import java.util.Scanner;

public class Menor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros=0;
        int menor=0;
        int numero=0;
        System.out.println("¿Cuántos números desea ingresar?");
        numeros=leer.nextInt();
        int i=0;
        while (i<numeros){
            System.out.println("¿Cuál número desea ingresar?");
            numero=leer.nextInt();
            if(i==0){
                menor=numero;
            }
            if(numero<menor){
                menor=numero;
            }
            i++;
        }
        System.out.println("El número menor es "+menor);
    }
    
}
