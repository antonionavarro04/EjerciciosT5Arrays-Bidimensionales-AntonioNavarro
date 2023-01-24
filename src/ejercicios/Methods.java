package ejercicios;

public class Methods {
    // ! Print
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
                array[fila][columna] = (int) (Math.random() + 1);
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][], int max) { // * 0 a max
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() * max + 1);
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][], int max, int min) { // * min a max
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() * (max - min) + min + 1);
            }
        } return array;
    }
} // € Hecho por Antonio Navarro
