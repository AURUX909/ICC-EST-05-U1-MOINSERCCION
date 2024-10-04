import java.util.Arrays;

public class Metodos {
    public int[] insertionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            System.out.println("Pasada número " + i);
            int valorActual = arreglo[i];
            int j = i - 1;
            
            System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            
            // Desplazar elementos mayores al valor actual hacia la derecha
            while (j >= 0 && arreglo[j] > valorActual) {
                System.out.println("\t\tComparamos " + valorActual + " con " + arreglo[j]);
                arreglo[j + 1] = arreglo[j];
                j--;
                System.out.println("\t\t--------" + Arrays.toString(arreglo));
            }
            // Insertar el valor actual en su posición correcta
            arreglo[j + 1] = valorActual;
            
            System.out.println("\t--------" + Arrays.toString(arreglo));
        }
        return arreglo;
    }

    // Método para imprimir el arreglo de enteros
    public void printArreglo(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
}