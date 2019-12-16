import java.util.Scanner;

public class Calcomania {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int autos=0;
        int amarillo=0;
        int rosa=0;
        int roja=0;
        int verde=0;
        int azul=0;
        int digito=0;
        System.out.println("¿Cuántos autos hay?");
        autos=leer.nextInt();
        int i=0;
        while(i<autos){
            System.out.println("¿Cuál es el último dígito del auto#"+(i+1)+"?");
            digito=leer.nextInt();
            if (digito==1||digito==2){
                amarillo+=1;
            }
            else if(digito==3||digito==4){
                rosa+=1;
            }
            else if(digito==5||digito==6){
                roja+=1;
            }
            else if(digito==7||digito==8){
                verde+=1;
            }
            else if(digito==9||digito==0){
                azul+=1;
            }
            i++;
        }
        System.out.println("Los autos con las calcomanías del color son "
                + "los siguientes:");
        System.out.println("Amarillo: "+amarillo);
        System.out.println("Rosa: "+rosa);
        System.out.println("Roja: "+roja);
        System.out.println("Verde: "+verde);
        System.out.println("Azul: "+azul);
    }
    
}
