package util;

public class Empleado {
    private static final double SUELDO_BASE = 2500.00;  
    private static final double COMISION_POR_AUTO = 250.00;  
    private static final double PORCENTAJE_UTILIDADES = 0.05;  

    private int totalAutosVendidos = 0;  
    private double valorTotalVentas = 0.0; 
    private double totalComision = 0.0;  

    // Método para registrar la venta de un automóvil
    public void registrarVenta(double valorAuto) {
        totalAutosVendidos++; 
        valorTotalVentas += valorAuto;  

        // Si el valor del automóvil es mayor a 10,000 se registra una comisión
        if (valorAuto > 10000.00) {
            totalComision += COMISION_POR_AUTO;
        }
    }

    // Método para calcular la utilidad (5% de las ventas)
    public double calcularUtilidad() {
        return valorTotalVentas * PORCENTAJE_UTILIDADES;
    }

    // Método para calcular el sueldo total (Sueldo base + comisiones + utilidades)
    public double calcularSueldoTotal() {
        return SUELDO_BASE + totalComision + calcularUtilidad();
    }

    // Métodos para obtener los datos
    public int getTotalAutosVendidos() {
        return totalAutosVendidos;
    }

    public double getValorTotalVentas() {
        return valorTotalVentas;
    }

    public double getTotalComision() {
        return totalComision;
    }

    public double getSueldoBase() {
        return SUELDO_BASE;
    }
}
