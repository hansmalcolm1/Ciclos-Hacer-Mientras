import java.util.Scanner;

public class Peso {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int miembros=5;
        int basculas=10;
        int peso=0;
        int[] peso_ant=new int[miembros];
        int[] prom_peso=new int[miembros];
        int[] total_peso=new int[miembros];
        int i=0;
        int j=0;
        while(i<miembros){
            System.out.println("¿Cuánto pesó la persona#"+(i+1)+"?");
            peso_ant[i]=leer.nextInt();
            i++;
        }
        i=0;
        while(i<miembros){
            j=0;
            while(j<basculas){
            System.out.println("¿Cuánto se pesó la persona#"+(i+1)+" en la "
                    + "báscula#"+(j+1));
            peso=leer.nextInt();
            prom_peso[i]+=peso;
            j++;
            }
            prom_peso[i]/=10;
            total_peso[i]=prom_peso[i]-peso_ant[i];
            i++;
        }
        i=0;
        while(i<miembros){
            if(prom_peso[i]>peso_ant[i]){
                System.out.println("La persona#"+(i+1)+" SUBIO de peso en "
                        + ""+total_peso[i]);
            }
            else if(prom_peso[i]<peso_ant[i]){
                System.out.println("La persona#"+(i+1)+" BAJO de peso en "
                        + ""+total_peso[i]);
            }
            i++;
        }
        }
    
}
