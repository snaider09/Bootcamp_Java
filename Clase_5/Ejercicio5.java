package Clase_5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para adivinar");
        Scanner Ingreso_numero = new Scanner(System.in);
        double numero = Ingreso_numero.nextDouble();
        double aleatorio = Math.random()*10;

        if(numero == aleatorio){
            System.out.println("Adivinaste el numero es correcto");
        }else{
            System.out.println("Fallaste intentalo de nuevo");
        }
    }
}
