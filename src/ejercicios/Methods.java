package ejercicios;

public class Methods {
    // ! Print
    // = 1d
    public static void printArray(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    // = 2d
    public static void printArray(String array[][]) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            } System.out.println();
        }
    } public static void printArray(int array[][]) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            } System.out.println();
        }
    }

    // ! Fill
    public static int[][] fillArray(int array[][], int number) { // * número fijo
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = number;
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][]) { // * 0 o 1
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() + 0.5d);
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][], int max) { // * 0 a max
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() * max + 0.5d);
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][], int max, int min) { // * min a max
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() * (max - min) + min + 0.5d);
            }
        } return array;
    }
} // € Hecho por Antonio Navarro
