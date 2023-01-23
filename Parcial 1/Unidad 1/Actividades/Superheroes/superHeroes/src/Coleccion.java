import utils.Console;

import java.util.ArrayList;

public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> figuras;


    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.figuras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public void añadirFigura(Figura figura){
       this.getFiguras().add(figura);
    }

    public void subirPrecioFigura(String id, double precio){
        boolean VFFigura = false;
        for (Figura figura : figuras) {
            if (figura.getCodigo().equals(id)){
                System.out.println("Alterando precio de la figura: " + figura.getHeroe().getNombre());
                System.out.println("Precio antiguo: " + figura.getPrecio());
                figura.setPrecio(figura.getPrecio() + precio);
                System.out.println( "Precio nuevo: "+figura.getPrecio());
                VFFigura = true;
            }
        }
        if (!VFFigura){
            System.out.println("No se encontro la figura");
        }
    }

    public void mostrarFiguras(){
        int i = 1;
        for (Figura figura : figuras) {
            System.out.println("Figura " + i);
            figura.figuraInfo();
            Console.separator(50);

            i++;
        }
    }

    public void conCapa(){
        for (Figura figura : figuras) {
            if (figura.getHeroe().isCapa()){
                System.out.println("El heroe " + figura.getHeroe().getNombre() + " tiene capa");
            } else {
                System.out.println("El heroe " + figura.getHeroe().getNombre() + " no tiene capa");
            }
        }
    }

    public void masValioso(){
        double precio = 0;
        String nombre = "";
        for (Figura figura : figuras) {
            if (figura.getPrecio() > precio){
                precio = figura.getPrecio();
                nombre = figura.getHeroe().getNombre();
            }
        }
        System.out.println("El heroe mas valioso es " + nombre + " con un precio de " + precio);
    }

    public void valorColeccion(){
        double precio = 0;
        for (Figura figura : figuras) {
            precio += figura.getPrecio();
        }
        System.out.println("El valor de la coleccion es " + precio);
    }

    public void volumenColeccion(){
        double volumen = 0;
        for (Figura figura : figuras) {
            volumen += figura.getDimesion().getVolumen();
        }
        volumen += 200;
        System.out.println("El volumen de la coleccion es " + volumen);
    }

}
