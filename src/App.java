public class App {
    public static void main(String[] args) {
        Metodos metodosOrdenamiento = new Metodos();

        // Arreglo inicial
        int[] arreglo = {5, 2, 4, 6, 1, 3};

        System.out.println("Arreglo original:");
        metodosOrdenamiento.printArreglo(arreglo);

        System.out.println("\nProceso de ordenamiento por inserción:");
        int[] arregloOrdenado = metodosOrdenamiento.insertionSort(arreglo);

        System.out.println("\nArreglo ordenado:");
        metodosOrdenamiento.printArreglo(arregloOrdenado);
    }
}