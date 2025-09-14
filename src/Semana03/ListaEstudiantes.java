package Semana03;

import java.util.ArrayList;

public class ListaEstudiantes {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregamos al menos 5 nombres
        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("Luis");
        estudiantes.add("Marta");
        estudiantes.add("Sofía");

        // Mostramos la lista completa
        System.out.println("Lista completa:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }

        // Eliminamos el tercer nombre (índice 2)
        estudiantes.remove(2);

        // Mostramos la lista después de eliminar
        System.out.println("\nLista después de eliminar el tercer nombre:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }
    }
}
