public class Automovil {
    private String nchasis;
    private String modelo;
    private String marca;
    private int anio;
    private String color;
    private double costo;

    public Automovil(String nchasis, String modelo, String marca, int anio, String color, double costo) {
        this.nchasis = nchasis;
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.costo = costo;
    }

    public void mostrar() {
        System.out.println("N Chasis: " + nchasis);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Costo inicial: Bs. " + costo);
        System.out.println("---");
    }

    public int calcularAnos() {
        int anioActual = 2026;
        return anioActual - anio;
    }

    public double calcularCostoActual() {
        int anos = calcularAnos();
        double costoActual = costo;
        for (int i = 0; i < anos; i++) {
            costoActual = costoActual * 0.9;
        }
        return costoActual;
    }

    public int getAnio() {
        return anio;
    }
}