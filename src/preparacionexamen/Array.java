package preparacionexamen;

/**
 * Clase para efectuar pruebas, se eliminará al terminar las demás clases
 * @author Antonio Navarro
 * @version Dev
 */
public class Array {
    public static void main(String[] args) {
        char array[] = new char[20];

        array = PerArrays.fillArrayRandom(array);

        PerArrays.printArray(array);
    }
}
