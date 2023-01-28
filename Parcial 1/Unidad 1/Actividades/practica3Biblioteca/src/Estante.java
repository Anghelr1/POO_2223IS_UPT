import utils.Console;
import utils.Logics;

import java.util.ArrayList;

public class Estante extends Libro {
    private String nombre;
    private ArrayList<Libro> libros;
    private int numeroLibrosPrestados;

    public Estante(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<Libro>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public int getNumeroLibrosPrestados() {

        libros.forEach((n) -> {
            if (n.isPrestado()) {
                numeroLibrosPrestados++;
            }
        });

        return numeroLibrosPrestados;
    }

    public String getNombre() {
        return nombre;
    }
}
