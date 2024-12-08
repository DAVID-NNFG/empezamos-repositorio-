import java.util.Scanner;
import util.Agua;

public class practicaejercicio3 {
     public static void main(String[] args) {
        Scanner agua = new Scanner(System.in);

        System.out.print("Ingrese el consumo: ");
        double consumo = agua.nextDouble();

        System.out.print("¿Es tercera edad?: ");
        boolean esTerceraEdad = agua.nextBoolean();

        System.out.print("¿Tiene discapacidad?: ");
        boolean tieneDiscapacidad = agua.nextBoolean();

        double porcentajeDiscapacidad = 0;
        if (tieneDiscapacidad) {
            System.out.print("Si tiene discapacidad, ingrese porcentaje de discapacidad (0-100): ");
            porcentajeDiscapacidad = agua.nextDouble();
        }

        Agua calculo = new Agua(consumo, esTerceraEdad, tieneDiscapacidad, porcentajeDiscapacidad);

        double costoAgua = calculo.calcularCostoAgua();
        double impuestoAlcantarillado = calculo.calcularImpuestoAlcantarillado(costoAgua);
        double tasaRecoleccionBasura = calculo.calcularTasaRecoleccionBasura();
        double tasaProcesamientoDatos = calculo.calcularTasaProcesamientoDatos();
        double totalPagar = costoAgua + impuestoAlcantarillado + tasaRecoleccionBasura + tasaProcesamientoDatos;

        System.out.printf("Costo por agua potable: $%.2f%n", costoAgua);
        System.out.printf("Impuesto de alcantarillado: $%.2f%n", impuestoAlcantarillado);
        System.out.printf("Tasa de recolección de basura: $%.2f%n", tasaRecoleccionBasura);
        System.out.printf("Tasa de procesamiento de datos: $%.2f%n", tasaProcesamientoDatos);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
    }
}
