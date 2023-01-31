package preparacionexamen;

/**
 * Clase para efectuar pruebas, se eliminará al terminar las demás clases
 * @author Antonio Navarro
 * @version Dev
 */
public class AuxiliaryMain {
    public static void main(String[] args) {
        char array[] = new char[500];

        PerArrays.fillArray(array, '!', 1);

        PerArrays.printArray(array);
    }
}
