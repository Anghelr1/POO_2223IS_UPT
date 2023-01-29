import utils.Console;
import utils.Data;
import utils.Logics;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    private static int numeroLibrosPrestados = 10;
    private static String iconLibrary = "\uD83C\uDFEB";
    private static String  iconExit = "🚪";
    private static String iconBooks = "📚";
    private static String iconStands = "📊";
    private static String iconBook = "📖";
    private static String iconLibrarian = "🧑‍🏫";
    private static String iconMagnifyingGlass = "🔍";
    private static String iconISBN = "🔖";
    private static String iconNum = "#️";
    private static String iconInfo = "📑";
    private static String iconAuthor = "🤵‍";
    private static String iconPages = "📄";
    private static String iconState1 = "🗃";
    private static String iconState2 = "📦️";
    private static String iconSadFace = "😥";
    private static String iconStands2 = "\uD83D\uDDC4️";
//    private static String icon

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
            System.out.println(iconLibrary +  " Biblioteca " + iconLibrary);
            Console.separator(50);
            System.out.println("1..... Solicitar libro " + iconBook);
            System.out.println("2..... Estante mas solicitado " + iconStands);
            System.out.println("3..... Libros prestados ️" + iconBooks);
            System.out.println("4..... Salir " + iconExit);
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
                    barraProgreso();
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
            System.out.println( iconLibrarian + " Servicio de préstamo de libros");
            Console.separator(50);
            System.out.println( iconMagnifyingGlass + "️ Buscar libro por: ");
            System.out.println("1..... Titulo " + iconBook);
            System.out.println("2..... ISBN " + iconISBN);
            System.out.println("3..... Titulos disponibles " + iconBooks);
            System.out.println("4..... Salir " + iconExit);
            int opcion = Logics.verifier(( iconNum + "Introduce una opción: "), 1, 4);

            switch (opcion) {
                case 1: {
                    Console.cls();
                    Console.separator(50);
                    System.out.println( iconLibrarian + " Prestar libro por titulo");
                    Console.separator(50);
                    String titulo = estantes.get((int) (Math.random() * estantes.size())).getLibros().get((int) (Math.random() * numeroLibrosPrestados)).getTitulo();
                    estantes.forEach((n) -> {
                        n.getLibros().forEach((m) -> {
                            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                                System.out.println( iconInfo + " Informacion ingresada: " + titulo);
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
                    System.out.println( iconLibrarian + " Prestar libro por ISBN");
                    Console.separator(50);
                    String isbn = estantes.get((int) (Math.random() * estantes.size())).getLibros().get((int) (Math.random() * numeroLibrosPrestados)).getIsbn();
                    estantes.forEach((n) -> {
                        n.getLibros().forEach((m) -> {
                            if (m.getIsbn().equalsIgnoreCase(isbn)) {
                                System.out.println( iconInfo +  " Informacion ingresada: " + isbn);
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
                    System.out.println( iconBooks + " Libros disponibles " + iconBooks);
                    Console.separator(50);

                    estantes.forEach((n) -> {
                        n.getLibros().forEach((m) -> {
                            if (!m.isPrestado()) {
                                System.out.println( iconBook + "Titulo: " + m.getTitulo());
                                System.out.println(iconISBN + "ISBN: " + m.getIsbn());
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
            System.out.println(iconBook +  " Libro prestado: " + m.getTitulo());
            System.out.println(iconISBN + " ISBN: " + m.getIsbn());
            System.out.println(iconAuthor + " Autor: " + m.getAutor());
            System.out.println(iconPages + " Paginas: " + m.getPaginas());
            System.out.println(iconState1 + " Estado prestado previo: " + m.isPrestado());
            m.setPrestado(true);
            System.out.println(iconState2 + " Estado prestado posterior: " + m.isPrestado());
            Console.pressKey();
        } else {
            System.out.println(iconSadFace + " LIBRO PRESTADO");
            System.out.println(iconBook + " Titulo: " + m.getTitulo());
            System.out.println(iconISBN + " ISBN: " + m.getIsbn());
            Console.pressKey();
        }
    }

    private static void estanteMasSolicitado(ArrayList<Estante> estantes) {
        Console.cls();
        Console.separator(50);
        System.out.println(iconStands2 + " ESTANTE MAS SOLICITADO ️" + iconStands2);
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
        System.out.println(iconStands2 + "️ Estante mas solicitado: ");
        System.out.println(iconStands + estanteMasSolicitado.get() + iconStands);
//        System.out.println("Numero de libros prestados: " + nLibrosPrestados.get());
        Console.separator(50);
        Console.pressKey();
    }

    private static void librosPrestados(ArrayList<Estante> estantes) {
        Console.cls();
        Console.separator(50);
        System.out.println(iconBooks + "LIBROS PRESTADOS" + iconBooks);
        Console.separator(50);
        estantes.forEach((n) -> {
            n.getLibros().forEach((m) -> {
                if (m.isPrestado()) {
                    System.out.println(iconBook + " Titulo: " + m.getTitulo());
                    System.out.println(iconISBN + " ISBN: " + m.getIsbn());
                    System.out.println(iconAuthor + " Autor: " + m.getAutor());
                    System.out.println(iconPages + " Paginas: " + m.getPaginas());
                    System.out.println(iconState2 + " Estado prestado: " + m.isPrestado());
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

