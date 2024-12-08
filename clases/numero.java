package util;

public class numero {
   // Método para calcular el n-ésimo número de Fibonacci
   public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    int a = 0, b = 1, c;
    for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}

// Método para verificar si un número es primo
public static boolean esPrimo(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

// Método para obtener el n-ésimo número primo
public static int nEsimoPrimo(int n) {
    int count = 0;
    int num = 2;
    while (true) {
        if (esPrimo(num)) {
            count++;
            if (count == n) {
                return num;
            }
        }
        num++;
    }
}
  }



