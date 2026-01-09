package proyecto_final_carlos_hidalgo;

import java.util.Scanner;

public class Proyecto_Final_Carlos_Hidalgo {

    public static void main(String[] args) {
        String cliente;
        double compra1,compra2,compra3,tc,pc;
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresar nombre del cliente: ");
        cliente=lectura.next();
        System.out.print("1era compra: ");
        compra1=lectura.nextDouble();
        System.out.print("2da compra: ");
        compra2=lectura.nextDouble();
        System.out.print("3era compra: ");
        compra3=lectura.nextDouble();
        tc=compra1+compra2+compra3;
        pc=tc/3;
        
        System.out.println("Las compras realizadas por el cliente "+ cliente +" suman: "+tc);
        System.out.println("El promedio de las compras realizadas por el cliente "+ cliente + " es: "+pc);
        
    }
    
}
