
package ciclos.hacer.mientras;

import java.util.Scanner;

public class Promedio_alumnos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grupos=0;
        int alumnos=0;
        int materias=0;
        int calificacion=0;
        int prom_calificaciones=0;
        int prom_materia=0;
        int prom_grupos=0;
        System.out.println("¿Cuantos grupos hay en el colegio?");
        grupos=leer.nextInt();
        int[] prom_grupo = new int[grupos];
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        while(i<grupos){
            System.out.println("¿Cuántos alumnos hay en el grupo#"+(i+1)+"?");
            alumnos=leer.nextInt();
            System.out.println("¿Cuántas materian ven en el grupo#"+(i+1)+"?");
            materias=leer.nextInt();
            int[][][] alumno_1=new int [grupos][alumnos][materias];
            int[][] alumno_2=new int [grupos][alumnos];
            int[] alumno_3=new int [grupos];
            while(j<alumnos){
                while(k<materias){
                    while(l<3){
                        System.out.println("¿Cuanto sacó el alumno#"+(j+1)+" "
                                + "en la calificación#"+(l+1)+" de la materia"
                                + "#"+(k+1)+"?");
                        calificacion=leer.nextInt();
                        prom_calificaciones+=calificacion;
                    }
                    prom_calificaciones/=3;
                    alumno_1[i][j][k]=prom_calificaciones;
                }
            }
        }
        i=0;
        j=0;
        k=0;
        while(i<grupos){
            while(j<alumnos){
                while(k<materias){
                    
                }
            }
        }
        
    }
    
}
