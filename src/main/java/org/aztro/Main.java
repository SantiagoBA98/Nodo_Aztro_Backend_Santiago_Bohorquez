package org.aztro;

import org.aztro.domains.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner esc = new Scanner(System.in);
        String data = "";
        System.out.println("Ingrese la operación que desea realizar");
        char op = esc.next().charAt(0);

        try {
            String projectPath = System.getProperty("user.dir");
            File numbers = new File(projectPath + "\\src\\main\\resources\\numeros.txt");
            Scanner sc = new Scanner(numbers);
            while (sc.hasNextLine()) {
                System.out.println("Leyendo el archivo...");
                data += sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado " + e.getMessage());
        }

        try {
            double a = Integer.parseInt(data.split("")[0]);
            double b = Integer.parseInt(data.split("")[1]);
            switch (op) {
                case '+':
                    Sumar sumar = new Sumar(a, b);
                    sumar.Operacion();
                    sumar.imprimirResultado();
                    break;
                case '-':
                    Restar restar = new Restar(a, b);
                    restar.Operacion();
                    restar.imprimirResultado();
                    break;
                case '*':
                    Multiplicar multiplicar = new Multiplicar(a, b);
                    multiplicar.Operacion();
                    multiplicar.imprimirResultado();
                    break;
                case '^':
                    Potencia potencia = new Potencia(a, b);
                    potencia.Operacion();
                    potencia.imprimirResultado();
                case '/':
                    Dividir dividir = new Dividir(a, b);
                    dividir.Operacion();
                    dividir.imprimirResultado();
                    break;
                default:
                    System.out.println("La operación ingresada no es valida");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("El dato ingresado no es un numero " + e.getMessage());
        }
    }
}