public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(1, "Centro");
        caja.mostrar();
        caja.contarValidosInvalidos();
        caja.contarValor(50);
        caja.sumaInvalidos();
    }
}