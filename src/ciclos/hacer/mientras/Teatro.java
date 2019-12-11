
package ciclos.hacer.mientras;

import java.util.Scanner;

public class Teatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int clientes=0;
        int descuento=0;
        int precio=0;
        int total_cliente=0;
        int total
        int edad=0;
        System.out.println("¿Cuántos clientes ingresan al teatro?");
        clientes=leer.nextInt();
        int total_cliente=0;
        System.out.println("¿Cuánto vale el tickete?");
        precio=leer.nextInt();
        int i=0;
        while(i<clientes){
            System.out.println("¿Cuántos años tiene el cliente#"+(i+1)+"?");
            edad=leer.nextInt();
            if(edad>=5&&edad<15){
                descuento=precio*1435/10000;
                
            }
        }
    }
    
}
