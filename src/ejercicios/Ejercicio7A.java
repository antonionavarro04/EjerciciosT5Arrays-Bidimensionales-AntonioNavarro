package ejercicios;

public class Ejercicio7A {
    public static void main(String[] args) {
        // ^ Definimos un array de 4x4
        int array[][] = new int[4][4];

        // ! Rellenamos el array con números del 1 al 16
        Methods.fillArray(array, 1, 1);

        // ! Definimos un array de las mismas posiciones
        int aux[][] = new int[array.length][array[0].length];
        
        // ! Llamamos al método creado para tranponer números, la idea es copiar así: final[j][i] = principal[i][j]
        Methods.transponerArray(array, aux);

        // ? Mostramos el array transpuesto
        Methods.printArray(aux);
    }
} // € Hecho por Antonio Navarro
