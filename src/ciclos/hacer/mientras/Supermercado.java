import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int precio_articulo=0;
        int articulos=0;
        int total=0;
        int clientes=0;
        System.out.println("¿Cuántos clientes son?");
        clientes=leer.nextInt();
        int[] total_cliente=new int[clientes];
        int i=0;
        int j=0;
        while(i<clientes){
            System.out.println("¿Cuántos artículos va a comprar el cliente#"+(i+1)+"?");
            articulos=leer.nextInt();
            j=0;
            while(j<articulos){
                System.out.println("¿Cuánto valió el articulo#"+(j+1)+"?");
                precio_articulo=leer.nextInt();
                total_cliente[i]+=precio_articulo;
                j++;
            }
            i++;
        }
        i=0;
        while(i<clientes){
            total+=total_cliente[i];
            i++;
        }
        i=0;
        while(i<clientes){
            System.out.println("El cliente#"+(i+1)+" tiene que pagar "
                    + ""+total_cliente[i]);
            i++;
        }
        System.out.println("El total que recibe el supermercado es de "+total);
    }
    
}
