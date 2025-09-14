package Semana03;

import java.util.Scanner;

public class ManejodeErrores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo (entero): ");
            int a = sc.nextInt();

            System.out.print("Ingrese el divisor (entero): ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero no permitida.");
        } catch (Exception e) {
            System.out.println("Error: entrada inválida.");
        } finally {
            sc.close();
        }
    }
}
