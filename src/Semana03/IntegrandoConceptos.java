package Semana03;

import java.util.ArrayList;

public class IntegrandoConceptos {




	    // Clase Producto
	    static class Producto {
	        String nombre;
	        double precio;
	        int cantidad;

	        public Producto(String nombre) {
	            this(nombre, 0.0, 0);
	        }

	        public Producto(String nombre, double precio) {
	            this(nombre, precio, 0);
	        }

	        public Producto(String nombre, double precio, int cantidad) {
	            if (precio < 0 || cantidad < 0) {
	                throw new IllegalArgumentException("Precio o cantidad no pueden ser negativos");
	            }
	            this.nombre = nombre;
	            this.precio = precio;
	            this.cantidad = cantidad;
	        }

	        @Override
	        public String toString() {
	            return nombre + " - Precio: " + precio + " - Cantidad: " + cantidad;
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList<Producto> inventario = new ArrayList<>();

	        // Probando sobrecarga
	        inventario.add(new Producto("Lapicero"));
	        inventario.add(new Producto("Cuaderno", 5.50));
	        inventario.add(new Producto("Mochila", 120.0, 10));

	        for (Producto p : inventario) {
	            System.out.println(p);
	        }
	    }
	}