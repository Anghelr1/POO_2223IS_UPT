import utils.Console;
import utils.Data;
import utils.Logics;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    private static int numeroLibrosPrestados = 10;

    public static void main(String[] args) {

        // OBJETOS
        Data data = new Data();
        ArrayList<Estante> estantes = new ArrayList<Estante>();

        // CREANDO ESTANTES
        for (int i = 0; i < 3; i++) {
            estantes.add(new Estante("Estante " + (i + 1)));
        }

        //LLENANDO ESTANTES CON LIBROS
        estantes.forEach((n) -> {
            for (int i = 0; i < numeroLibrosPrestados; i++) {
                n.getLibros().add(new Libro(data.rndTitulo(), data.rndAutor(), data.rndPaginas(), data.isbn(), data.rndPrestado()));
            }
        });

        // MENU
        boolean estado = false;
        Console.cls();
        Console.separator(50);
//        barraProgreso();
        while (!estado){
            Console.cls();
            Console.separator(50);
            System.out.println("\uD83C\uDFEB Biblioteca \uD83C\uDFEB");
            Console.separator(50);
            System.out.println("1..... Solicitar libro \uD83D\uDCD6");
            System.out.println("2..... Estante mas solicitado \uD83D\uDDC4️");
            System.out.println("3..... Libros prestados \uD83D\uDCDA️");
            System.out.println("4..... Salir \uD83D\uDEAA️");
            int opcion = Logics.verifier("#️Introduce una opción: ", 1, 4);
            switch (opcion){
                case 1:{
                    prestarLibro(estantes);
                    break;
                }
                case 2:{
                    estanteMasSolicitado(estantes);
                    break;
                }
                case 3:{
                    librosPrestados(estantes);
                    break;
                }
                case 4:{
                    Console.cls();
                    Console.separator(50);
                    System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                    Console.separator(50);
                    estado = true;
                    break;
                }
            }
        }


    }

    private static void prestarLibro(ArrayList<Estante> estantes) {
        boolean estado = false;
        while (!estado) {
            Console.cls();
            Console.separator(50);
            System.out.println("\uD83D\uDC69\u200D\uD83C\uDFEB Servicio de préstamo de libros");
            Console.separator(50);
            System.out.println("\uD83D\uDD0D️ Buscar libro por: ");
            System.out.println("1..... Titulo \uD83D\uDCD6");
            System.out.println("2..... ISBN \uD83D\uDD16");
            System.out.println("3..... Titulos disponibles \uD83D\uDCDA️");
            System.out.println("4..... Salir \uD83D\uDEAA");
            int opcion = Logics.verifier("#️ Introduce una opción: ", 1, 4);

            switch (opcion) {
                case 1: {
                    Console.cls();
                    Console.separator(50);
                    System.out.println("\uD83D\uDC69\u200D\uD83C\uDFEB Prestar libro por titulo");
                    Console.separator(50);
                    String titulo = estantes.get((int) (Math.random() * estantes.size())).getLibros().get((int) (Math.random() * numeroLibrosPrestados)).getTitulo();
                    estantes.forEach((n) -> {
                        n.getLibros().forEach((m) -> {
                            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                                System.out.println("\uD83D\uDCD1 Informacion ingresada: " + titulo);
                                Console.separator(50);
                                estadoLibro(m);
                            }
                        });
                    });
                    break;
                }
                case 2: {
                    Console.cls();
                    Console.separator(50);
                    System.out.println("\uD83D\uDC69\u200D\uD83C\uDFEB Prestar libro por ISBN");
                    Console.separator(50);
                    String isbn = estantes.get((int) (Math.random() * estantes.size())).getLibros().get((int) (Math.random() * numeroLibrosPrestados)).getIsbn();
                    estantes.forEach((n) -> {
                        n.getLibros().forEach((m) -> {
                            if (m.getIsbn().equalsIgnoreCase(isbn)) {
                                System.out.println("\uD83D\uDCD1 Informacion ingresada: " + isbn);
                                Console.separator(50);
                                estadoLibro(m);
                            }
                        });
                    });
                    break;
                }
                case 3: {
                    Console.cls();
                    Console.separator(50);
                    System.out.println("Libros disponibles");
                    Console.separator(50);

                    estantes.forEach((n) -> {
                        n.getLibros().forEach((m) -> {
                            if (!m.isPrestado()) {
                                System.out.println("Titulo: " + m.getTitulo());
                                System.out.println("ISBN: " + m.getIsbn());
                            }
                        });
                    });
                    Console.pressKey();
                    break;
                }
                case 4: {
                    Console.cls();
                    Console.separator(50);
                    System.out.println("Gracias por usar el servicio");
                    barraProgreso();
                    Console.separator(50);
                    estado = true;
                    break;
                }
            }
        }
    }

    private static void estadoLibro(Libro m) {
        if (!m.isPrestado()) {
            System.out.println("\uD83D\uDCD7 Libro prestado: " + m.getTitulo());
            System.out.println("\uD83D\uDD16 ISBN: " + m.getIsbn());
            System.out.println("\uD83E\uDD35\u200D Autor: " + m.getAutor());
            System.out.println("\uD83D\uDCC3 Paginas: " + m.getPaginas());
            System.out.println("\uD83D\uDDC3 Estado prestado previo: " + m.isPrestado());
            m.setPrestado(true);
            System.out.println("\uD83D\uDCE6️ Estado prestado posterior: " + m.isPrestado());
            Console.pressKey();
        } else {
            System.out.println("\uD83D\uDE25 LIBRO PRESTADO");
            System.out.println("\uD83D\uDCD7 Titulo: " + m.getTitulo());
            System.out.println("\uD83D\uDD16 ISBN: " + m.getIsbn());
            Console.pressKey();
        }
    }

    private static void estanteMasSolicitado(ArrayList<Estante> estantes) {
        Console.cls();
        Console.separator(50);
        System.out.println("\uD83D\uDDC4️ ESTANTE MAS SOLICITADO \uD83D\uDDC4️");
        Console.separator(50);
        AtomicReference<String> estanteMasSolicitado = new AtomicReference<>("");
        AtomicInteger contador = new AtomicInteger();
        AtomicInteger nLibrosPrestados = new AtomicInteger();
        nLibrosPrestados.set(0);
        estantes.forEach((n) -> {
            nLibrosPrestados.set(n.getNumeroLibrosPrestados());
            if (nLibrosPrestados.get() > contador.get()) {
                contador.set(nLibrosPrestados.get());
                estanteMasSolicitado.set(n.getNombre());
            }
        });
        System.out.println("\uD83D\uDDC4️ Estante mas solicitado: ");
        System.out.println("\uD83D\uDDC4︎︎" + estanteMasSolicitado.get() + "\uD83D\uDDC4︎");
//        System.out.println("Numero de libros prestados: " + nLibrosPrestados.get());
        Console.separator(50);
        Console.pressKey();
    }

    private static void librosPrestados(ArrayList<Estante> estantes) {
        Console.cls();
        Console.separator(50);
        System.out.println("\uD83D\uDCDA️LIBROS PRESTADOS\uD83D\uDCDA️︎");
        Console.separator(50);
        estantes.forEach((n) -> {
            n.getLibros().forEach((m) -> {
                if (m.isPrestado()) {
                    System.out.println("\uD83D\uDCD7 Titulo: " + m.getTitulo());
                    System.out.println("\uD83D\uDD16 ISBN: " + m.getIsbn());
                    System.out.println("\uD83E\uDD35\u200D Autor: " + m.getAutor());
                    System.out.println("\uD83D\uDCC3 Paginas: " + m.getPaginas());
                    System.out.println("\uD83D\uDDC3 Estado prestado: " + m.isPrestado());
                    Console.separator(50);
                }
            });
        });
        Console.pressKey();
    }

    private static void barraProgreso(){
        Console.progressBar(15,10,1,200,"\uD83D\uDCD5","\uD83D\uDCD3");
    }
}

