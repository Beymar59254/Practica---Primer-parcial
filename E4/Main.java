public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular("001", "Usuario1", "123456789");
        Celular c2 = new Celular("002", "Usuario2", "987654321");

        c1.mostrar();
        c2.mostrar();

        c1.agregar("Nuevo", "77777777");
        c1.eliminar("77548412");
        c1.editar("Juan", "11111111");
        c1.buscarNum("70583512");
        c1.contar112();
    }
}
