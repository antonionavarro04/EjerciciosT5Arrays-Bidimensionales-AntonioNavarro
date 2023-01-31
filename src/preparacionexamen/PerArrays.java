package preparacionexamen;

// ? Imports
import java.util.Arrays;

/**
 * Esta clase contiene todos los métodos para el manejo sencillo de Arrays, en el se pueden encontrar métodos de impresión, rellenado, copia, inserción y eliminación
 * @author Antonio Navarro
 * @version Alpha 1.1
 * @see java.lang.System
 * @see java.util.Arrays
 * @see java.lang.Math
 * @see java.lang.String
 * @see Mathematics
 */
public class PerArrays {
    /**
     * Constructor por Defecto
     */
    public PerArrays () {
        // // Default Constructor
    }

    // ! Print
    // = 1d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(double[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(String[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(float[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(long[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(char[] a) {
        System.out.print("[");
        if (a.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.println("]");
    }

    // = 2d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(long a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(float a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
    
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(double a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }

    // = 3d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int a[][][]) {
        for (int p = 0; p < a.length; p++) {
            System.out.printf("Capa %s:\n", p);
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a[0][0].length; j++) {
                    System.out.print(a[p][i][j] + " ");
                }
                System.out.println();
            } System.out.println();
        }
    }

    // = 4d
    /**
     * Método que imprime un array sin devolver una String
     * @param a Array para imprimir
     */
    public static void printArray(int a[][][][]) {
        for (int m = 0; m < a.length; m++) {
            System.out.printf("Momento %s:\n", m);
            for (int p = 0; p < a[0].length; p++) {
                System.out.printf("Capa %s:\n", p);
                for (int i = 0; i < a[0][0].length; i++) {
                    for (int j = 0; j < a[0][0][0].length; j++) {
                        System.out.print(a[m][p][i][j] + " ");
                    }
                    System.out.println();
                } System.out.println();
            } System.out.println();
        }
    }

    // ! Fill
    // = 1d
    // * Fixed
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param s Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static String[] fillArray(String a[], String s) {
        for (int i = 0; i < a.length; i++) {
            a[i] = s;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param c Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static char[] fillArray(char a[], char c) {
        for (int i = 0; i < a.length; i++) {
            a[i] = c;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static int[] fillArray(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static double[] fillArray(double a[], double n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static long[] fillArray(long a[], long n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }
    
    /**
     * Método que rellena un array con el mismo elemento
     * @param a Array a rellenar
     * @param n Elemento con el que rellenar
     * @return Array ya rellenado
     */
    public static float[] fillArray(float a[], float n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
        } return a;
    }

    // * Incremental
    /**
     * Método que rellena un array con caracteres de forma incremental, estos caracteres no podrán ser ni mayores a 127 ni menores a 33
     * @param a Array a rellenar
     * @param c Elemento base
     * @param in Incremento para el elemento
     * @throws IllegalArgumentException Lanza una excepción en caso de que el incremento sea mayor a 128, ya que los caracteres usan la tabla ASCII de códigos
     * @return Array ya rellenado
     */
    public static char[] fillArray(char a[], char c, int in) {
        if (in > 127) {
            throw new IllegalArgumentException("Increment must be less than 128");
        } if (c <= 32) {
            c = 33;
        } for (int i = 0; i < a.length; i++) {
            a[i] = c;
            c += in;
            if (c > 128) {
                c = 33;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static int[] fillArray(int a[], int n, int in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static float[] fillArray(float a[], float n, float in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static double[] fillArray(double a[], double n, double in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }
    
    /**
     * Método que rellena un array numérico de forma incremental
     * @param a Array a rellenar
     * @param n Elemento base
     * @param in Incremento para el elemento
     * @return Array ya rellenado
     */
    public static long[] fillArray(long a[], long n, long in) {
        for (int i = 0; i < a.length; i++) {
            a[i] = n;
            n += in;
        } return a;
    }

    // * Random
    /**
     * Método que rellena un array de caracteres con caracteres comprendidos entre el 33 y el 128
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static char[] fillArrayRandom(char a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (Mathematics.rng(128, 33));
        } return a;
    }
    
    /**
     * Método que rellena un array con 0 y 1
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static int[] fillArrayRandom(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (Mathematics.rng(1, 0));
        } return a;
    }

    /**
     * Método que rellena un array con 0 y 1
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static long[] fillArrayRandom(long a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (Mathematics.rng(1L, 0L));
        } return a;
    }

    /**
     * Método que rellena un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static int[] fillArrayRandom(int a[], int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * max + 0.5d);
        } return a;
    }

    /**
     * Método que rellena un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static long[] fillArrayRandom(long a[], long max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (long) (Math.random() * max + 0.5d);
        } return a;
    }

    /**
     * Método que rellena un array con valores entre x y y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static int[] fillArrayRandom(int a[], int max, int min) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min) + (min + 0.5d));
        } return a;
    }

    /**
     * Método que rellena un array con valores entre x y y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static long[] fillArrayRandom(long a[], long max, long min) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (long) (Math.random() * (max - min) + (min + 0.5d));
        } return a;
    }

    // = 2d
    // * Fixed
    /**
     * Método que rellena un array con una cadena fija
     * @param a Array a rellenar
     * @param s Cadena con la que rellenar
     * @return Array ya rellenado
     */
    public static String[][] fillArray(String a[][], String s) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = s;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con un caracter fijo
     * @param a Array a rellenar
     * @param c Caracter con el que rellenar
     * @return Array ya rellenado
     */
    public static char[][] fillArray(char a[][], char c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = c;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static int[][] fillArray(int a[][], int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }

    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static double[][] fillArray(double a[][], double n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static long[][] fillArray(long a[][], long n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array con valores numéricos
     * @param a Array a rellenar
     * @param n Número con el que rellenar
     * @return Array ya rellenado
     */
    public static float[][] fillArray(float a[][], float n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }

    // * Incremental
    /**
     * Método que rellena un array con caracteres de manera incremetal
     * @param a Array a rellenar
     * @param c Caracter base
     * @param in Incremento para el caracter base
     * @throws IllegalArgumentException Lanza una excepción en caso de que el incremento sea mayor a 128, ya que los caracteres usan la tabla ASCII de códigos
     * @return Array ya rellenado
     */
    public static char[][] fillArray(char a[][], char c, int in) {
        if (in >= 127) {
            throw new IllegalArgumentException("Increment must be less than 127");
        } if (c <= 32) {
            c = 33;
        } for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = c;
                c += in;
                if (c > 128) {
                    c = 33;
                }
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static int[][] fillArray(int a[][], int n, int in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static long[][] fillArray(long a[][], long n, long in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static double[][] fillArray(double a[][], double n, double in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }
    
    /**
     * Método que rellena un array de manera incremental con valores numéricos
     * @param a Array a rellenar
     * @param n Número base
     * @param in Incremento con el que incrementar el número base
     * @return Array ya rellenado
     */
    public static float[][] fillArray(float a[][], float n, float in) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = n;
            }
        } return a;
    }

    // * Random
    /**
     * Método que rellena un array con caracteres aleatorios
     * @param a Array a rellenar
     * @return Array ya rellenado
     */
    public static char[][] fillArrayRandom(char a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (char) (Mathematics.rng(128, 33));
            }
        } return a;
    }

    /**
     * Método que rellena un array con 0 y 1
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static long[][] fillArrayRandom(long a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Mathematics.rng(1, 0);
            }
        } return a;
    }

    /**
     * Método que rellena un array con 0 y 1
     * @param a Array a rellenar
     * @return Array ya relleno
     */
    public static int[][] fillArrayRandom(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Mathematics.rng(1, 0);
            }
        } return a;
    }

    /**
     * Método que rellenar un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static int[][] fillArrayRandom(int a[][], int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * (max + 0.5d));
            }
        } return a;
    }
    
    /**
     * Método que rellenar un array con valores entre x e y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static int[][] fillArrayRandom(int a[][], int max, int min) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * (max - min) + (min + 0.5d));;
            }
        } return a;
    }

    /**
     * Método que rellenar un array con valores entre 0 y x inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @return Array ya relleno
     */
    public static long[][] fillArrayRandom(long a[][], long max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (long) (Math.random() * (max + 0.5d));
            }
        } return a;
    }
    
    /**
     * Método que rellenar un array con valores entre x e y inclusive
     * @param a Array a rellenar
     * @param max Número máximo a generar
     * @param min Número mínimo a generar
     * @return Array ya relleno
     */
    public static long[][] fillArrayRandom(long a[][], long max, long min) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (long) (Math.random() * (max - min) + (min + 0.5d));;
            }
        } return a;
    }
} // € By: Antonio Navarro
    