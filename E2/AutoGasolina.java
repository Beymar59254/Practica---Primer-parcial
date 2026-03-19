public class AutoGasolina extends Automovil {
    private int volTanque;
    private double gasolinaLt;

    public AutoGasolina(String nchasis, String modelo, String marca, int anio, String color, double costo, int volTanque, double gasolinaLt) {
        super(nchasis, modelo, marca, anio, color, costo);
        this.volTanque = volTanque;
        this.gasolinaLt = gasolinaLt;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Vol. Tanque: " + volTanque + " L");
        System.out.println("Gasolina actual: " + gasolinaLt + " L");
        System.out.println("---");
    }

    public void costoLlenarTanque() {
        double faltante = volTanque - gasolinaLt;
        double costo = 0;
        for (int i = 0; i < faltante; i++) {
            costo += 6.96;
        }
        System.out.println("Costo para llenar tanque: Bs. " + costo);
    }
}
