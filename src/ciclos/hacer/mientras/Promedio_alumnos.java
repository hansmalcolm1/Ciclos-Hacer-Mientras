
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
        int[][] alumno_2=new int [grupos][alumnos];
        while(i<grupos){
            System.out.println("¿Cuántos alumnos hay en el grupo#"+(i+1)+"?");
            alumnos=leer.nextInt();
            System.out.println("¿Cuántas materian ven en el grupo#"+(i+1)+"?");
            materias=leer.nextInt();
            int[][][] alumno_1=new int [grupos][alumnos][materias];
            
            while(j<alumnos){
                while(k<materias){
                    while(l<3){
                        System.out.println("¿Cuanto sacó el alumno#"+(j+1)+" "
                                + "en la calificación#"+(l+1)+" de la materia"
                                + "#"+(k+1)+"?");
                        calificacion=leer.nextInt();
                        prom_calificaciones+=calificacion;
                        l++;
                    }
                    prom_calificaciones/=3;
                    alumno_1[i][j][k]=prom_calificaciones;
                    alumno_2[i][j]+=alumno_1[i][j][k];
                    k++;
                }
                alumno_2[i][j]/=materias;
                prom_grupo[i]+=alumno_2[i][j];
                prom_grupos+=prom_grupo[i];
                j++;
            }
            prom_grupos/=grupos;
            i++;
        }
        i=0;
        j=0;
        k=0;
        System.out.println("El promedio de todos los grupos es de "+prom_grupos);
        while(i<grupos){
            System.out.println("El promedio del grupo#"+(i+1)+" es de "+prom_grupo[i]);
            while(j<alumnos){
                System.out.println("El promedio del alumno#"+(i+1)+" es de "+alumno_2[i][j]);
                while(k<materias){
                    
                }
            }
        }
        
    }
    
}
