package util;

public class Agua {
    double consumo;
    boolean terceraEdad;
    boolean tieneDiscapacidad;
    double porcentajeDiscapacidad;

    public Agua(double consumo, boolean esTerceraEdad, boolean tieneDiscapacidad, double porcentajeDiscapacidad) {
        this.consumo = consumo; 
        this.terceraEdad = esTerceraEdad;
        this.tieneDiscapacidad = tieneDiscapacidad;
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }

    public double calcularCostoAgua() {
        double costo = 0.0;

        if (consumo <= 15) {
            costo = 3.00;
        } else if (consumo <= 25) {
            costo = 3.00 + (consumo - 15) * 0.10;
        } else if (consumo <= 40) {
            costo = 3.00 + (10 * 0.10) + (consumo - 25) * 0.20;
        } else if (consumo <= 60) {
            costo = 3.00 + (10 * 0.10) + (15 * 0.20) + (consumo - 40) * 0.30;
        } else {
            costo = 3.00 + (10 * 0.10) + (15 * 0.20) + (20 * 0.30) + (consumo - 60) * 0.35;
        }

        if (terceraEdad && consumo <= 15) {
            costo *= 0.50;
        } else if (terceraEdad) {
            double baseDescuento = 3.00;
            baseDescuento *= 0.50;
            costo = baseDescuento + (costo - 3.00) * 0.70;
        }

        if (tieneDiscapacidad) {
            costo -= (porcentajeDiscapacidad / 100.0) * 3.00;
        }

        return costo;
    }

    public double calcularImpuestoAlcantarillado(double costoAgua) {
        return costoAgua * 0.35;
    }

    public double calcularTasaRecoleccionBasura() {
        return 0.75;
    }

    public double calcularTasaProcesamientoDatos() {
        return 0.50;
    }
}
    

