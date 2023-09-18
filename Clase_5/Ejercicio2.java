package Clase_5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese la distancia en millas ");
        Scanner Ingreso_distancia = new Scanner(System.in);
        double millas = Ingreso_distancia.nextDouble();
        double kilometros = millas*1.60934;
        System.out.println("La distacia en kilomtros es: "+ kilometros);
    }
}
