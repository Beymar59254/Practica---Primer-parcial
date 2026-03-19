public class Main {
    public static void main(String[] args) {
        System.out.println("AUTO ELECTRICO");
        AutoElectrico electrico = new AutoElectrico("ELC001", "Model 3", "Tesla", 2024, "Blanco", 50000.0, 80.0, "Litio");
        electrico.mostrar();
        electrico.puedeRecorrer(10);

        System.out.println("\nAUTO GASOLINA");
        AutoGasolina gasolina = new AutoGasolina("GAS001", "Corolla", "Toyota", 2023, "Rojo", 30000.0, 50, 20.0);
        gasolina.mostrar();
        gasolina.costoLlenarTanque();

        System.out.println("\nCOSTO ACTUAL");
        System.out.println("Electrico costo actual: Bs. " + electrico.calcularCostoActual());
        System.out.println("Gasolina costo actual: Bs. " + gasolina.calcularCostoActual());
    }
}
