import java.util.Scanner;
import util.numero;

public class ultimoejercisio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos a generar: ");
        int cantidadTerminos = sc.nextInt();
        sc.close();

        System.out.println("\nTérminos de la serie:");
        for (int n = 1; n <= cantidadTerminos; n++) {
            // Obtener el Fibonacci y el primo correspondientes
            int fibonacciAnterior = numero.fibonacci(n - 1);
            int primoActual = numero.nEsimoPrimo(n);

            // Generar el término según la fórmula
            String signo = (((n - 1) / 2) % 2 == 0) ? "+" : "-";
            System.out.printf("%s (%d / %d)^%d\n", signo, fibonacciAnterior, primoActual, 2 * n);
        }
    }
}

