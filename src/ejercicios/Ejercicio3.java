package ejercicios;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void printArray(String array[][]) { // * Modificado para este caso
        for (int fila = 0; fila < array.length; fila++) {
            if (fila == 0) {
                System.out.print("Alumno:\t");
            } else {
                System.out.print("Nota:\t");
            }
            for (int columna = 0; columna < array[0].length; columna++) {
                if (fila == 0) {
                    System.out.print(array[fila][columna] + "\t");
                } else {
                    System.out.print(array[fila][columna] + "\t\t");
                }
            } System.out.println();
        }
    }

    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // ^ Definimos un array de 2x4
        String array[][] = new String[2][4];

        // ! Rellenamos la primera fila del Array con los nombres
        for (int pos = 0; pos < array[0].length; pos++) {
            String s = String.valueOf(pos + 1);
            array[0][pos] = "Alumno " + s;
        } 
        
        // ! Rellenamos la segunda fila del Array con las notas, preguntándole estas al usuario#
        System.out.println("Introduce las notas de los Alumnos:");
        for (int pos = 0; pos < array[1].length; pos++) {
            String s = String.valueOf(pos + 1);
            System.out.print("Alumno " + s + " >>> ");
            array[1][pos] = read.nextLine();
        }
        
        // ? Salto de Línea Triple
        System.out.println("\n-------------------------------------------------------------------\n");

        // ? Mostramos las notas
        printArray(array);
        
        // ! Sacamos la nota mínima, máxima y media de las calificaciones, para facilitar esta tarea vamos a sacar las notas a un array entero
        int aux[] = new int[4];
        for (int pos = 0; pos < aux.length; pos++) {
            aux[pos] = Integer.parseInt(array[1][pos]);
        }

        // ! Tanto para la nota mínima como la máxima vamos a recorrerlas con un foreach buscando estas notas
        // ! Para la media vamos a recorrer el array e ir sumando los numeros en una variable media, al final lo dividiremos entre la longitud del array
        // ! Todas las variables la inicializaremos con el primer valor del array y al recorrerlo empezaremos desde el segundo
        int notaMinima = aux[0], notaMaxima = aux[0], notaMedia = aux[0];
        for (int pos = 1; pos < aux.length; pos++) {
            notaMedia += aux[pos]; // * Sumamos las notas
            if (aux[pos] > notaMaxima) { // * Comprobamos si esta nota es mayor a la anterior
                notaMaxima = aux[pos];
            } if (aux[pos] < notaMinima) { // * Comprobamos si esta nota es menor a la anterior
                notaMinima = aux[pos];
            }
        }

        // ! Dividimos la media entre la longitud del array
        notaMedia /= aux.length;

        // ? Mostramos las notas máximas, mínimas y la media
        System.out.println("La nota mínima fue " + notaMinima);
        System.out.println("La nota máxima fue " + notaMaxima);
        System.out.println("La nota media fue " + notaMedia);
    }
} // € Hecho por Antonio Navarro
