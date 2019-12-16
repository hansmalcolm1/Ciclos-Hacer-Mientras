import java.util.Scanner;

public class Vendedores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vendedores=0;
        int sueldo=0;
        System.out.println("¿Cuántos vendedores son?");
        vendedores=leer.nextInt();
        int[] venta_1=new int[vendedores];
        int[] venta_2=new int[vendedores];
        int[] venta_3=new int[vendedores];
        int[] comision=new int[vendedores];
        int[] total=new int[vendedores];
        int i=0;
        System.out.println("¿Cuánto es el sueldo base?");
        sueldo=leer.nextInt();
        while(i<vendedores){
            System.out.println("¿Cuánto ganó el vendedor#"+(i+1)
                    + " en la venta 1?");
            venta_1[i]=leer.nextInt();
            System.out.println("¿Cuánto ganó el vendedor#"+(i+1)
                    + " en la venta 2?");
            venta_2[i]=leer.nextInt();
            System.out.println("¿Cuánto ganó el vendedor#"+(i+1)
                    + " en la venta 3?");
            venta_3[i]=leer.nextInt();
            comision[i]=(10/100)*(venta_1[i]+venta_2[i]+venta_3[i]);
            total[i]=comision[i]+venta_1[i]+venta_2[i]+venta_3[i]+sueldo;
            i++;
        }
        i=0;
        while(i<vendedores){
            System.out.println("El vendedor#"+(i+1)+" ganó "
                    + ""+comision[i]+" por comisión");
            i++;
        }
        i=0;
        while(i<vendedores){
            System.out.println("El total que gana el vendendor#"
                    + ""+(i+1)+" es de "+total[i]);
            i++;
        }
    }
    
}
