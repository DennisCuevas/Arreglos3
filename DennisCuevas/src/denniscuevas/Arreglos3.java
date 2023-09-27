package denniscuevas;
import java.util.Scanner;
public class Arreglos3 {
public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
int d, a;
int [] num = new int[10];
for(d=0;d<=8;d++){
  System.out.print("Ingresa numero: ");
  num [d]= leer.nextInt();
    } for(a=0;a<=9;a++){
        System.out.println("Numeros Ingresados: "+num[d]);
    }
    
}
}
