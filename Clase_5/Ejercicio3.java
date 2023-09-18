package Clase_5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio original del producto");
        Scanner Ingreso_precio = new Scanner(System.in);
        int precio = Ingreso_precio.nextInt();
        System.out.println("Ingrese el porcentaje de descuento");
        Scanner Ingreso_descuento = new Scanner(System.in);
        int descuento = Ingreso_descuento.nextInt();

        int precio_final = precio-(precio*descuento/100);
        System.out.println("El precio con descuento sera de : "+ precio_final);
    }
}
