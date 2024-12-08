package util;

public class Zona {
    private String nombre;
    private double precioPorMinuto;

    public Zona(int clave) {
        switch (clave) {
            case 12 -> {
                nombre = "América del Norte";
                precioPorMinuto = 2.75;
            }
            case 15 -> {
                nombre = "América Central";
                precioPorMinuto = 1.89;
            }
            case 18 -> {
                nombre = "América del Sur";
                precioPorMinuto = 1.60;
            }
            case 19 -> {
                nombre = "Europa";
                precioPorMinuto = 3.50;
            }
            case 23 -> {
                nombre = "Asia";
                precioPorMinuto = 4.50;
            }
            case 25 -> {
                nombre = "África";
                precioPorMinuto = 3.10;
            }
            case 29 -> {
                nombre = "Oceanía";
                precioPorMinuto = 3.00;
            }
            case 31 -> {
                nombre = "Resto del Mundo";
                precioPorMinuto = 6.00;
            }
            default -> {
                nombre = "Clave no válida";
                precioPorMinuto = 0.0;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPorMinuto() {
        return precioPorMinuto;
    } 
}

