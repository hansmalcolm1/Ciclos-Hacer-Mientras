
package ciclos.hacer.mientras;

import java.util.Scanner;

public class Masa_de_aire {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vehiculos=0;
        int presion=0;
        int volumen=0;
        int temperatura=0;
        int motocicleta=0;
        int automovil=0;
        int prom_motocicleta=0;
        int prom_automovil=0;
        int prom_masa=0;
        System.out.println("¿Cuántos vehículos están en servicio de "
                + "alineación?");
        vehiculos=leer.nextInt();
        double[] masa_de_aire = new double [vehiculos];
        int[] tipo_vehiculo = new int [vehiculos];
        int i=0;
        while(i<vehiculos){
            System.out.println("¿Qué tipo de vehículo es el #"+(i+1)
                    + " (motocicleta=1, automovil=2) ?");
            tipo_vehiculo[i]=leer.nextInt();
            while(tipo_vehiculo[i]<1||tipo_vehiculo[i]>2){
            System.out.println("¿Qué tipo de vehículo es el #"+(i+1)
                    + " (motocicleta=1, automovil=2) ?");
            tipo_vehiculo[i]=leer.nextInt();
            }
            if(tipo_vehiculo[i]==1){
                motocicleta+=1;
            }
            else if(tipo_vehiculo[i]==2){
                automovil+=1;
            }
            i++;
        }
        i=0;
        while(i<motocicleta){
            System.out.println("¿Cuánto es la presión de la motocicleta#"
                    +(i+1)+"?");
            presion=leer.nextInt();
            System.out.println("¿Cuánto es el volumen de la motocicleta#"
                    +(i+1)+"?");
            volumen=leer.nextInt();
            System.out.println("¿Cuánto es la temperatura de la motocicleta#"
                    +(i+1)+"?");
            temperatura=leer.nextInt();
            masa_de_aire[i]=(presion*volumen)/(0.37*(temperatura+460));
            prom_motocicleta+=masa_de_aire[i];
            prom_masa+=masa_de_aire[i];
            i++;
        }
        while((i-motocicleta)<automovil){
            System.out.println("¿Cuánto es la presión del automovil#"
                    +(i+1)+"?");
            presion=leer.nextInt();
            System.out.println("¿Cuánto es el volumen del automovil#"
                    +(i+1)+"?");
            volumen=leer.nextInt();
            System.out.println("¿Cuánto es la temperatura del automovil#"
                    +(i+1)+"?");
            temperatura=leer.nextInt();
            masa_de_aire[i]=(presion*volumen)/(0.37*(temperatura+460));
            prom_automovil+=masa_de_aire[i];
            prom_masa+=masa_de_aire[i];
            i++;
        }
        prom_motocicleta/=motocicleta;
        prom_automovil/=automovil;
        prom_masa/=vehiculos;
        System.out.println("El promedio de la masa de aire de las "
                + "motocicletas es de: "+prom_motocicleta);
        System.out.println("El promedio de la masa de aire de los "
                + "automoviles es de: "+prom_automovil);
        System.out.println("El promedio de la masa de aire de los "
                + "vehículos es de: "+prom_masa);
    }
    
}
