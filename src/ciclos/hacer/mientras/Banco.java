import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float ganancia=0;
        float interes=0;
        System.out.println("¿Cuánto dinero gana la persona?");
        ganancia=leer.nextFloat();
        int i=0;
        while(i<12){
            interes=ganancia*2/100;
            ganancia+=interes;
            i++;
        }
        System.out.printf("La ganancia de la persona es de %.2f\n",ganancia);
    }
    
}
