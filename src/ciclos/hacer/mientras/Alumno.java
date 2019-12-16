import java.util.Scanner;

public class Alumno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char sexo= ' ';
        int alumnos=0;
        int hombres=0;
        int mujeres=0;
        System.out.println("¿Cuántos alumnos hay?");
        alumnos=leer.nextInt();
        int i=0;
        while(i<alumnos){
            System.out.println("¿El alumno es hombre o mujer [h o m]?");
            sexo=leer.next().toLowerCase().charAt(0);
            if (sexo=='h'){
                hombres+=1;
            }
            else if(sexo=='m'){
                mujeres+=1;
            }
            i++;
        }
        System.out.println("Hay "+hombres+" hombres y "+mujeres+" mujeres.");
    }
}
