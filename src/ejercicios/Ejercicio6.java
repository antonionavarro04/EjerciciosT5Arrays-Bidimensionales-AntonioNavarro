package ejercicios;

public class Ejercicio6 {
    public static void printCords(int[] array) { // * Modificado para este ejercicio, ORIGINAL: void printArray(int[] array)
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                }
                System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    public static void main(String[] args) {
        // ^ Definimos un array entero de 6x10
        int array[][] = new int[6][10];

        // ! Rellenamos el array con valores aleatorios entre 0 y 1000
        Methods.fillArrayRandom(array, 1000);

        // ^ Definimos 2 variables, numeroMaximo-Minimo
        int numeroMaximo = array[0][0], numeroMinimo = array[0][0];

        // ^ Definimos 2 arrays de 2 posiciones cada uno, uno para el max y otra para el minimo
        int posicionesMaximo[] = new int[2];
        int posicionesMinimo[] = new int[2];

        // ! Recorremos el array en busca del número máximo y mínimo
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = filas;
                    posicionesMaximo[1] = columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = filas;
                    posicionesMinimo[1] = columnas;
                }
            }
        }

        // ? Mostramos la tabla y las posiciones
        Methods.printArray(array);
        System.out.print("Coordenadas del número máximo: "); printCords(posicionesMaximo);
        System.out.print("Coordenadas del número mínimo: "); printCords(posicionesMinimo);
    }
}
