import java.util.Scanner;

public class Obrero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int obreros=0;
        int horas=0;
        System.out.println("¿Cuántos obreros hay?");
        obreros=leer.nextInt();
        int[] salario=new int[obreros];
        int i=0;
        while(i<obreros){
            System.out.println("¿Cuántas horas trabajó el obrero#"+(i+1)+"?");
            horas=leer.nextInt();
            if(horas<=40){
                salario[i]=20*horas;
            }
            if(horas>40){
                salario[i]=(40*20)+(25*(horas-40));
            }
            i++;
        }
        i=0;
        while(i<obreros){
            System.out.println("El obrero#"+(i+1)+" ganó "+salario[i]);
            i++;
        }
    }
    
}
