package ejercicios;

// ? Importamos la Clase Arrays
import java.util.Arrays;

public class Methods {
    public static void printArray(int array[][]) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            } System.out.println();
        }
    }
} // € Hecho por Antonio Navarro
