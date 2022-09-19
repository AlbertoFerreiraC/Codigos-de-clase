package clases;

/**
 *
 * @author falberto
 */
public class ESD_5_4 {

    static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        // Primero hacer la suma
        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                int numeroMatriz1 = matriz1[y][x];
                int numeroMatriz2 = matriz2[y][x];
                int suma = numeroMatriz1 + numeroMatriz2;
                matrizSuma[y][x] = suma;
            }
        }
        // Después imprimir los encabezados
        System.out.println("\t\t1\t\t2\t\tSuma");
        for (int x = 0; x < 62; x++) {
            System.out.print("_");
        }
        System.out.println();
        // Finalmente imprimir los resultados
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                System.out.printf("%5d ", matriz1[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matriz2[y].length; x++) {
                System.out.printf("%5d ", matriz2[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matrizSuma[y].length; x++) {
                System.out.printf("%5d ", matrizSuma[y][x]);
            }
            System.out.print(" | ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz1 = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18},};
        int[][] matriz2 = {
            {15, 14, 13},
            {12, 11, 10},
            {9, 8, 7},};
        sumarMatrices(matriz1, matriz2);
    }
}
