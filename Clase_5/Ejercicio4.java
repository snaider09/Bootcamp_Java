package Clase_5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor Total de la cuenta");
        Scanner Ingreso_precio = new Scanner(System.in);
        int valor_cuenta = Ingreso_precio.nextInt();
        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        Scanner Ingreso_propina = new Scanner(System.in);
        double porcentaje_propina = Ingreso_propina.nextDouble();

        double propina =valor_cuenta*(porcentaje_propina/100);
        System.out.println("El valor de la propina sera de : "+ propina);
    }
}
