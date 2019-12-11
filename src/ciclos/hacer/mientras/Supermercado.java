
package ciclos.hacer.mientras;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tomar='s';
        int cont_articulo=1;
        int cant_articulo=0;
        char mismo_articulo='s';
        String[] articulo=new String[1];
        int[] precio_articulo=new int[1];
        int[] total_articulo=new int[1];
        int total=0;
        int i=0;
        int j=0;
        while(tomar=='s'){
            if(j>0){
                System.out.println("¿Es el mismo articulo (s o n)?");
                mismo_articulo=leer.next().toLowerCase().charAt(0);
                if(mismo_articulo=='n'){
                    j=0;
                    articulo = java.util.Arrays.copyOf(articulo, 
                    articulo.length+1);
                    precio_articulo = java.util.Arrays.copyOf(precio_articulo, 
                    precio_articulo.length+1);
                    total_articulo = java.util.Arrays.copyOf(total_articulo, 
                    total_articulo.length+1);
                    total_articulo[i]=precio_articulo[i]*cant_articulo;
                    cant_articulo=0;
                    cont_articulo+=1;
                    i++;
                }
            }
            
            if(j==0){
                System.out.println("Ingrese el nombre del artículo");
                articulo[i]=leer.next().toLowerCase().substring(0);
                System.out.println("Ingrese el precio del articulo");
                precio_articulo[i]=leer.nextInt();
            }
            cant_articulo+=1;
            System.out.println("Artículo acumulado: "+articulo[i]+" "
                    +cant_articulo);
            System.out.println("¿Desea seguir comprando artículos (s o n)?");
            tomar=leer.next().toLowerCase().charAt(0);
            j++;
        }
        total_articulo[i]=precio_articulo[i]*cant_articulo;
        i=0;
        System.out.println("Los artículos que la señora compró son los "
                + "siguientes:");
        while(i<cont_articulo){
            System.out.println(articulo[i]+": "+total_articulo[i]);
            total+=total_articulo[i];
            i++;
        }
        System.out.println("El total de las compras es de "+total);
    }
    
}
