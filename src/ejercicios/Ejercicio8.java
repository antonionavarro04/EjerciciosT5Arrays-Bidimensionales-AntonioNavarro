package ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ^ Definimos una matriz de 5x5
        int array[][] = new int[2][2];

        // ! Rellenamos la matriz con números aleatorios entre 1 y 10
        Methods.fillArrayRandom(array, 1, 10);

        // ! Comprobamos si la matriz es simétrica
        boolean simmetrical = Methods.simmetrical(array);

        Methods.printArray(array);
        System.out.println("Este array " + (simmetrical ? "es" : "no es") + " simétrico");
    }
} // € Hecho por Antonio Navarro
