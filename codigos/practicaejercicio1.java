import java.util.Scanner;
import util.Empleado; 

public class practicaejercicio1 {

    public static void main(String[] args) {
        generarInformeEmpleado();
    }

    public static void generarInformeEmpleado() { 
        Scanner sc = new Scanner(System.in); 
        Empleado empleadoController = new Empleado(); 

        System.out.print("Ingrese el valor del automóvil vendido: ");
        double valorAuto = sc.nextDouble();
        empleadoController.registrarVenta(valorAuto); 
        
        // aqui imprime el informe 
        System.out.println("Total de autos vendidos: " + empleadoController.getTotalAutosVendidos());
        System.out.println("Valor total de ventas: $" + empleadoController.getValorTotalVentas());
        System.out.println("Sueldo base: $" + empleadoController.getSueldoBase());
        System.out.println("Comisión total: $" + empleadoController.getTotalComision());
        System.out.println("Utilidad por ventas: $" + empleadoController.calcularUtilidad());
        System.out.println("Sueldo total: $" + empleadoController.calcularSueldoTotal());
    }
}
