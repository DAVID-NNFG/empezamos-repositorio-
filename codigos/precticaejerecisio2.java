import java.util.Scanner;
import util.Zona;
import util.factura;

public class precticaejerecisio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la clave de la zona: ");
        int clave = sc.nextInt();

        Zona zona = new Zona(clave);
        if (zona.getPrecioPorMinuto() == 0.0) {
            System.out.println("Clave de zona no válida.");
            return; 
        }

        System.out.print("Ingrese la cantidad de minutos hablados: ");
        int minutos = sc.nextInt();

        factura factura = new factura(zona, minutos);

        System.out.println("Zona: " + zona.getNombre());
        System.out.printf("Precio por minuto: $%.2f\n", zona.getPrecioPorMinuto());
        System.out.println("Minutos hablados: " + factura.getMinutos());
        System.out.printf("Costo total de la llamada: $%.2f\n", factura.calcularCosto());
    }
}
