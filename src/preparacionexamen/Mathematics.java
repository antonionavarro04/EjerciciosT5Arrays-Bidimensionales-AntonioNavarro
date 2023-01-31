package preparacionexamen;

/**
 * Esta clase contiene Métodos útiles para la aplicación rápida de calculos matemáticos.
 * Más adelante se implementarán los métodos esPrimo() y esPar().
 * @author Antonio Navarro
 * @version Alpha 1.0
 * @see java.lang.Math
 */
public class Mathematics {
    /**
     * Constructor por Defecto
     */
    public Mathematics () {
        // // Default constructor
    }

    /**
     * Método que devuelve un número entre 0 y x inclusive
     * @param max Número Máximo a Generar
     * @return Número (int) aleatorio
     */
    public static int rng(int max) {
        return (int) (Math.random() * (max + 0.5d));
    }

    /**
     * Método que devuelve un número entre x e y inclusive
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Número (int) aleatorio
     */
    public static int rng(int max, int min) {
        return (int) (Math.random() * (max - min) + (min += 0.5d));
    }

    /**
     * Método que devuelve un número entre 0 y x inclusive
     * @param max Número Máximo a Generar
     * @return Número (long) aleatorio
     */
    public static long rng(long max) {
        return (long) (Math.random() * (max + 0.5d));
    }
    
    /**
     * Método que devuelve un número entre x e y inclusive
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Número (long) aleatorio
     */
    public static long rng(long max, long min) {
        return (long) (Math.random() * (max - min) + (min += 0.5d));
    }

    public static boolean esPrimo(int n) {
        boolean state = true;
        if (n <= 1) {
            state = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    state = false;
                    break;
                }
            }
        } return state;
    }
}
