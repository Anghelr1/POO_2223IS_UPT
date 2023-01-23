package utils;

import java.util.Scanner;

public class Logics {
    static Scanner lector = new Scanner(System.in);

    /**
     * Verify that the number is valid between the minimum and maximum entered.
     *
     * @param text Value to display when requesting data
     * @param min  Minimum number to use
     * @param max  Maximum number to be compared
     * @return Value processed and verified
     */
    public static int verifier(String text, int min, int max) {
        System.out.print(text);
        int opcion = lector.nextInt();
        boolean VF = false;
        while (!VF) {
            if (opcion < min || opcion > max) {
                System.out.print("❌Opción inválida, intenta de nuevo: ");
                opcion = lector.nextInt();
            } else {
                VF = true;
            }
        }
        return opcion;
    }


}
