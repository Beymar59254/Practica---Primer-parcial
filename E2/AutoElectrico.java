public class AutoElectrico extends Automovil {
    private double porcentajeCarga;
    private String tipoBateria;

    public AutoElectrico(String nchasis, String modelo, String marca, int anio, String color, double costo, double porcentajeCarga, String tipoBateria) {
        super(nchasis, modelo, marca, anio, color, costo);
        this.porcentajeCarga = porcentajeCarga;
        this.tipoBateria = tipoBateria;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo Bateria: " + tipoBateria);
        System.out.println("% Carga: " + porcentajeCarga + "%");
        System.out.println("---");
    }

    public void puedeRecorrer(double km) {
        double consumoNecesario = 0;
        for (double i = 0; i < km; i++) {
            consumoNecesario += 5.0;
        }
        if (porcentajeCarga >= consumoNecesario) {
            System.out.println("Si puede recorrer " + km + " km.");
        } else {
            double falta = consumoNecesario - porcentajeCarga;
            System.out.println("No alcanza para " + km + " km. Falta " + falta + "% de bateria.");
        }
    }
}
