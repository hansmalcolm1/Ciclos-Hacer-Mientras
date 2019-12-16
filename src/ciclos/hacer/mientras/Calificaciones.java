import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int alumnos=0;
        int nota=0;
        float promedio=0;
        System.out.println("¿Cuántos alumnos hay?");
        alumnos=leer.nextInt();
        int i=0;
        while(i<alumnos){
            System.out.println("¿Cuánto sacó el alumno#"+(i+1)+"?");
            nota=leer.nextInt();
            promedio+=nota;
            i++;
        }
        promedio/=alumnos;
        System.out.printf("El promedio de los alumnos es de %.2f\n",promedio);
    }
    
}
