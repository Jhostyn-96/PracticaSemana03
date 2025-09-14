package Semana03;

public class SobrecargadeMetodos {

	    // Método que suma dos enteros
	    public int sumar(int a, int b) {
	        return a + b;
	    }

	    // Método que suma tres enteros
	    public int sumar(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Método que suma dos decimales
	    public double sumar(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	SobrecargadeMetodos calc = new SobrecargadeMetodos();

	        // Usamos los métodos sobrecargados
	        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 3));
	        System.out.println("Suma de 3 enteros: " + calc.sumar(5, 3, 2));
	        System.out.println("Suma de 2 decimales: " + calc.sumar(5.5, 3.2));
	    }
	}
