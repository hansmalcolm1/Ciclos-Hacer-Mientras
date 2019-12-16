import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad = 0;
        int hombres = 0;
        int mujeres = 0;
        int alumnos = 0;
        int prom_hombres = 0;
        int prom_mujeres = 0;
        int prom_alumnos = 0;
        System.out.println("¿Cuántos alumnos hay en el salón?");
        alumnos=leer.nextInt();
        System.out.println("¿Cuántos hombres hay en el salón?");
        hombres=leer.nextInt();
        mujeres=alumnos-hombres;
        int i=0;
        while (i<hombres){
            System.out.println("¿Cuántos años tiene el hombre#"+(i+1)+"?");
            edad=leer.nextInt();
            prom_hombres+=edad;
            prom_alumnos+=edad;
            i++;
        }
        i=0;
        while (i<mujeres){
            System.out.println("¿Cuántos años tiene la mujer#"+(i+1)+"?");
            edad=leer.nextInt();
            prom_mujeres+=edad;
            prom_alumnos+=edad;
            i++;
        }
        prom_hombres/=hombres;
        prom_mujeres/=mujeres;
        prom_alumnos/=alumnos;
        System.out.println("El promedio de edad de los hombres es de "
                + ""+prom_hombres);
        System.out.println("El promedio de edad de las mujeres es de "
                + ""+prom_mujeres);
        System.out.println("El promedio de edad de los alumnos es de "
                + ""+prom_alumnos);
    }
    
}
