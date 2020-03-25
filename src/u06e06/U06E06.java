
package u06e06;


import java.util.Scanner;

public class U06E06 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int i, a, largo, num;
        boolean flag=false;
        System.out.print("Ingrese el largo del array: ");
        largo=entrada.nextInt();
        int[] datos = new int[largo];
        for(i=0; i<datos.length; i++){
            System.out.print("Ingrese el dato nro "+(i+1)+" del array: ");
            datos[i]=entrada.nextInt();
        }
        System.out.print("Ingrese el dato a buscar en el array: ");
        num=entrada.nextInt();
        for(i=0; i<datos.length; i++){
            if(num==datos[i]){
                System.out.println("El numero "+num+" esta en la posicion "+(i+1));
                flag=true;
            }
        }
        if (flag!=true){
                System.out.print("El numero no esta en el array");
        }
    }
}