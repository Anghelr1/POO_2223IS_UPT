import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Caja caja1 = new Caja();

        System.out.print("Ingresa altura: ");
        float altura = lector.nextFloat();
        caja1.setAltura(altura);

        System.out.print("Ingresa base: ");
        float base = lector.nextFloat();
        caja1.setBase(base);

        System.out.print("Ingresa profundidad: ");
        float profundidad = lector.nextFloat();
        caja1.setProfundidad(profundidad);

        caja1.volumen();




    }
}
