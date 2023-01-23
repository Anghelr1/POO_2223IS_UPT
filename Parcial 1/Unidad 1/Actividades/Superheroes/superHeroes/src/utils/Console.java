package utils;

import java.util.Scanner;

public class Console {

    static Scanner lector = new Scanner(System.in);

    // TRIMS
    public static void cls(){
        System.out.println("cls");
    }

    public static void pressKey() {
        String proceed;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Presiona una tecla para continuar...");
        try {
            proceed = keyboard.nextLine();
        } catch (Exception e) {
        }
    }

    // VISUALS
    public static void separator(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("➖");
        }
        System.out.println();
    }


    /**
     * Displays the progress bar
     *
     * @param speed
     * @param size
     * @param iterator
     * @param total
     */
    // Default Values (200 10 10 200 )
    public static void progressBar(int speed, int size, int iterator, int total) {
        for (int i = 0; i <= total; i = i + iterator) {
            progressPercentage(i, total, size);
            try {
                Thread.sleep(speed);
            } catch (Exception e) {
            }
        }
    }

    /**
     * Repeats and replaces characters simulating a progression
     *
     * @param done
     * @param total
     * @param size
     */
    public static void progressPercentage(int done, int total, int size) {
        String iconLeftBoundary = "[";
        String iconDone = "\uD83D\uDFE9";
        String iconRemain = "\uD83D\uDD33";
        String iconRightBoundary = "]";

        if (done > total) {
            throw new IllegalArgumentException();
        }
        int donePercents = (100 * done) / total;
        int doneLength = size * donePercents / 100;

        StringBuilder bar = new StringBuilder(iconLeftBoundary);
        for (int i = 0; i < size; i++) {
            if (i < doneLength) {
                bar.append(iconDone);
            } else {
                bar.append(iconRemain);
            }
        }
        bar.append(iconRightBoundary);

        System.out.print("\r" + bar + " " + donePercents + "%");

        if (done == total) {
            System.out.print("\n");
        }
    }


    // Data Request
    /**
     * Requests the text to be displayed when requesting data
     *
     * @param requestText
     * @return returns the value entered by the user
     */
    public static String requestStringData(String requestText) {
        System.out.print(requestText);
        String dataReceived = lector.next();
        return dataReceived;
    }

    /**
     * Requests the text to be displayed when requesting data
     *
     * @param requestText
     * @return returns the value entered by the user
     */
    public static int requestIntData(String requestText) {
        System.out.print(requestText);
        int dataReceived = lector.nextInt();
        return dataReceived;
    }

    /**
     * Requests the text to be displayed when requesting data
     *
     * @param requestText
     * @return returns the value entered by the user
     */
    public static double requestDoubleData(String requestText) {
        System.out.print(requestText);
        double dataReceived = lector.nextDouble();
        return dataReceived;
    }


}
