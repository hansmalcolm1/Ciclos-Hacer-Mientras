
package ciclos.hacer.mientras;

import java.util.Scanner;
import java.lang.Math;

public class Tienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cliente =0;
        int descuento=0;
        char tienda='s';
        double balota =0;
        int[] pago_compra = new int[1];
        int[] descuento_valor= new int[1];
        int i=0;
        while(tienda=='s'){
            cliente+=1;
            pago_compra = java.util.Arrays.copyOf(pago_compra, 
                    pago_compra.length+1);
            descuento_valor = java.util.Arrays.copyOf(descuento_valor, 
                    descuento_valor.length+1);
            System.out.println("¿Cuánto le toca pagar el cliente#"+(i+1)+"?");
            pago_compra[i]=leer.nextInt();
            
            balota=(Math.random()*4)+1;
            if (balota>1&&balota<2){
                descuento=0;
                descuento_valor[i]=0;
            }
            if (balota>2&&balota<3){
                descuento=pago_compra[i]*25/100;
                pago_compra[i]-=descuento;
                descuento_valor[i]=25;
            }
            if (balota>3&&balota<4){
                descuento=pago_compra[i]*40/100;
                pago_compra[i]-=descuento;
                descuento_valor[i]=40;
            }
            System.out.println("¿La tienda sigue abierta (s o n)?");
            tienda=leer.next().toLowerCase().charAt(0);
            i++;
        }
        i=0;
        while(i<cliente){
            System.out.println("El cliente#"+(i+1)+" le toca pagar "
                    + ""+pago_compra[i]+" con el descuento del "
                    + ""+descuento_valor[i]+"%");
            i++;
        }
        
    }
    
}
