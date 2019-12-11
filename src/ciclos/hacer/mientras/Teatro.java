
package ciclos.hacer.mientras;

import java.util.Scanner;

public class Teatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int clientes=0;
        int descuento=0;
        int precio=0;
        int total=0;
        int edad=0;
        System.out.println("¿Cuántos clientes ingresan al teatro?");
        clientes=leer.nextInt();
        int[] total_cliente=new int[clientes];
        System.out.println("¿Cuánto vale el tickete?");
        precio=leer.nextInt();
        int i=0;
        while(i<clientes){
            System.out.println("¿Cuántos años tiene el cliente#"+(i+1)+"?");
            edad=leer.nextInt();
            if(edad>=5&&edad<15){
                descuento=precio*1435/10000;
                total_cliente[i]=precio-descuento;
            }
            if(edad>=15&&edad<20){
                descuento=precio*1925/10000;
                total_cliente[i]=precio-descuento;
            }
            if(edad>=20&&edad<46){
                descuento=precio*4510/10000;
                total_cliente[i]=precio-descuento;
            }
            if(edad>=46&&edad<66){
                descuento=precio*6525/10000;
                total_cliente[i]=precio-descuento;
            }
            if(edad>=66){
                descuento=precio*35/100;
                total_cliente[i]=precio-descuento;
            }
            i++;
        }
        i=0;
        while(i<clientes){
            System.out.println("El cliente#"+(i+1)+" debe pagar "
                    +total_cliente[i]);
            total+=total_cliente[i];
            i++;
        }
        System.out.println("El total que recibe el teatro es de "+total);
    }
    
}
