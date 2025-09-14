package Semana03;

	import java.util.Scanner;

	// Excepción personalizada
	class NumeroNegativoException extends Exception {
	    public NumeroNegativoException(String mensaje) {
	        super(mensaje);
	    }
	}

	public class ManejoMultiplesExcepciones {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Ingrese un número entero: ");
	            String input = sc.nextLine();

	            int numero = Integer.parseInt(input);

	            if (numero < 0) {
	                throw new NumeroNegativoException("Error: el número no puede ser negativo");
	            }

	            System.out.println("Número ingresado: " + numero);

	        } catch (NumberFormatException e) {
	            System.out.println("Error: debe ingresar un valor numérico entero");
	        } catch (NumeroNegativoException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}