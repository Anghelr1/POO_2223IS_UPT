import com.sun.tools.jconsole.JConsoleContext;
import utils.Console;


public class Main {
    public static void main(String[] args) {
        HeroesData data = new HeroesData();

        Coleccion coleccion = new Coleccion("Coleccion de SuperHeroes");

        SuperHeroe heroe1 = new SuperHeroe(data.rndNombre());
        heroe1.setDescripcion(data.rndDescripcion());
        heroe1.setCapa(data.rndCapa());
        SuperHeroe heroe2 = new SuperHeroe(data.rndNombre());
        heroe2.setDescripcion(data.rndDescripcion());
        heroe2.setCapa(data.rndCapa());
        SuperHeroe heroe3 = new SuperHeroe(data.rndNombre());
        heroe3.setDescripcion(data.rndDescripcion());
        heroe3.setCapa(data.rndCapa());
        SuperHeroe heroe4 = new SuperHeroe(data.rndNombre());
        heroe4.setDescripcion(data.rndDescripcion());
        heroe4.setCapa(data.rndCapa());
        SuperHeroe heroe5 = new SuperHeroe(data.rndNombre());
        heroe5.setDescripcion(data.rndDescripcion());
        heroe5.setCapa(data.rndCapa());
        SuperHeroe heroe6 = new SuperHeroe(data.rndNombre());
        heroe6.setDescripcion(data.rndDescripcion());
        heroe6.setCapa(data.rndCapa());
        SuperHeroe heroe7 = new SuperHeroe(data.rndNombre());
        heroe7.setDescripcion(data.rndDescripcion());
        heroe7.setCapa(data.rndCapa());
        SuperHeroe heroe8 = new SuperHeroe(data.rndNombre());
        heroe8.setDescripcion(data.rndDescripcion());
        heroe8.setCapa(data.rndCapa());

        Dimension dimension1 = new Dimension(data.rndAlto(), data.rndAncho(), data.rndProfundidad());
        Figura figura1 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe1);
        Figura figura2 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe2);
        Figura figura3 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe3);
        Figura figura4 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe4);
        Figura figura5 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe5);
        Figura figura6 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe6);
        Figura figura7 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe7);
        Figura figura8 = new Figura(data.rndCodigo(), data.rndPrecio(), dimension1, heroe8);

        coleccion.añadirFigura(figura1);
        coleccion.añadirFigura(figura2);
        coleccion.añadirFigura(figura3);
        coleccion.añadirFigura(figura4);
        coleccion.añadirFigura(figura5);
        coleccion.añadirFigura(figura6);
        coleccion.añadirFigura(figura7);
        coleccion.añadirFigura(figura8);

        Console.cls();
        Console.separator(50);
        System.out.println("Cargando programa...");
        Console.progressBar(200,10,10,200);

        Console.cls();
        Console.separator(50);
        System.out.println("Informacion figura 1");
        figura1.figuraInfo();
        Console.separator(50);
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Informacion todas las figuras");
        coleccion.mostrarFiguras();
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Subiendo precio directamente a la figura 1");
        System.out.println("El precio de la figura " + figura1.getHeroe().getNombre() + " es: " + figura1.getPrecio());
        figura1.subirPrecio(Console.requestDoubleData("Introduce la cantidad de aumento: "));
        Console.separator(50);
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Subir precio figura mediante coleccion 1");
        Console.separator(50);
        System.out.println("Caso 1 Codigo correcto:");
        coleccion.subirPrecioFigura(figura1.getCodigo(), Console.requestDoubleData("Introduce la cantidad de aumento: "));
        Console.separator(50);
        System.out.println("Caso 2 Codigo incorrecto:");
        coleccion.subirPrecioFigura("codigoIncorrecto", Console.requestDoubleData("Introduce la cantidad de aumento: "));
        Console.separator(50);
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Mostrando heroes con capa");
        coleccion.conCapa();
        Console.separator(50);
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Mostrando la figura mas costosa");
        coleccion.masValioso();
        Console.separator(50);
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Mostrando el valor de la coleccion completa");
        coleccion.valorColeccion();
        Console.separator(50);
        Console.pressKey();

        Console.cls();
        Console.separator(50);
        System.out.println("Mostrando el volumen de la coleccion completa");
        coleccion.volumenColeccion();
        Console.separator(50);
        Console.pressKey();
    }
}
