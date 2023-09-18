package Clase_5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese la edad en numero ");
        Scanner Ingreso_edad = new Scanner(System.in);
        int edad = Ingreso_edad.nextInt();
        System.out.println("Su edad en perros es "+ edad*7 + " años");


    }
}
