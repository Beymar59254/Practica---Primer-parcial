public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("ABC123", "Civic", "Honda", 2020, "Rojo", 25000.0);
        Automovil auto2 = new Automovil("DEF456", "Corolla", "Toyota", 2018, "Azul", 22000.0);
        Automovil auto3 = new Automovil("GHI789", "Focus", "Ford", 2022, "Negro", 28000.0);
        Automovil auto4 = new Automovil("JKL012", "Sentra", "Nissan", 2019, "Blanco", 21000.0);
        Automovil auto5 = new Automovil("MNO345", "Kicks", "Nissan", 2021, "Gris", 24000.0);

        System.out.println("=== MOSTRANDO 5 AUTOMOVILES ===");
        auto1.mostrar();
        auto2.mostrar();
        auto3.mostrar();
        auto4.mostrar();
        auto5.mostrar();

        System.out.println("=== EDAD Y COSTO ACTUAL ===");
        System.out.println("Auto1: " + auto1.calcularAnos() + " años, Costo actual: Bs. " + auto1.calcularCostoActual());
        System.out.println("Auto2: " + auto2.calcularAnos() + " años, Costo actual: Bs. " + auto2.calcularCostoActual());
        System.out.println("Auto3: " + auto3.calcularAnos() + " años, Costo actual: Bs. " + auto3.calcularCostoActual());

        System.out.println("=== AUTOMOVIL MAS NUEVO DE LOS 3 PRIMEROS ===");
        Automovil masNuevo = auto1;
        if (auto2.getAnio() > masNuevo.getAnio()) {
            masNuevo = auto2;
        }
        if (auto3.getAnio() > masNuevo.getAnio()) {
            masNuevo = auto3;
        }
        masNuevo.mostrar();
    }
}