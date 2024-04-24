import java.util.Scanner;

public class PascalTriangle {

    // Función recursiva para calcular el valor en la posición (i, j) del triángulo de Pascal
    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1; // Los valores en los bordes del triángulo de Pascal son siempre 1
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j); // Suma de los valores superiores izquierdo y derecho
        }
    }

    // Función recursiva para imprimir el nivel especificado del triángulo de Pascal
    public static void printPascalRow(int rowNumber, int currentRow, int column) {
        if (currentRow > rowNumber) {
            return;
        }
        System.out.print(pascal(rowNumber, column) + " ");
        printPascalRow(rowNumber, currentRow + 1, column + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de fila del triángulo de Pascal que desea mostrar: ");
        int rowNumber = scanner.nextInt();

        // Imprimir el nivel especificado del triángulo de Pascal
        printPascalRow(rowNumber, 0, 0);
    }
}
