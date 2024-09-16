package org.aztro;

import org.aztro.domains.Dividir;
import org.aztro.domains.Multiplicar;
import org.aztro.domains.Restar;
import org.aztro.domains.Sumar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numA = new Scanner(System.in);
        System.out.println("Ingrese los numeros que desea operar");
        System.out.println("-----------------------------");
        float a = numA.nextFloat();
        System.out.println("-----------------------------");
        float b = numA.nextFloat();
        System.out.println("-----------------------------");

        Sumar sumar = new Sumar(a, b);
        sumar.Operacion();

        Multiplicar multiplicar = new Multiplicar(a, b);
        multiplicar.Operacion();

        Restar restar = new Restar(a, b);
        restar.Operacion();

        Dividir dividir = new Dividir(a, b);
        dividir.Operacion();

    }
}