package util;

public class factura {
    private Zona zonaFactura; 
    private int minutosHablados; 

    public factura(Zona zona, int minutos) {
        zonaFactura = zona; 
        minutosHablados = minutos;
    }

    public double calcularCosto() {
        return zonaFactura.getPrecioPorMinuto() * minutosHablados;
    }

    public Zona getZona() {
        return zonaFactura;
    }

    public int getMinutos() {
        return minutosHablados;
    }
}