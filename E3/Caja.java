public class Caja {
    private int nroCaja;
    private String sucursal;
    private String[] numSerieBilletes;
    private int nBilletes;

    public Caja(int nroCaja, String sucursal) {
        this.nroCaja = nroCaja;
        this.sucursal = sucursal;
        nBilletes = 30;
        numSerieBilletes = new String[30];
        for (int i = 0; i < 30; i++) {
            int num = 67000000 + i * 1000000;
            numSerieBilletes[i] = "B" + num;
        }
    }

    public void mostrar() {
        System.out.println("Nro Caja: " + nroCaja);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Billetes:");
        for (int i = 0; i < nBilletes; i++) {
            System.out.println(numSerieBilletes[i]);
        }
        System.out.println("---");
    }

    public void contarValidosInvalidos() {
        int val = 0;
        int inv = 0;
        for (int i = 0; i < nBilletes; i++) {
            String s = numSerieBilletes[i];
            int num = Integer.parseInt(s.substring(1));
            if (num >= 67250001 && num <= 67700000 || num >= 87280145 && num <= 91646549 || num >= 77100001 && num <= 77550000) {
                inv++;
            } else {
                val++;
            }
        }
        System.out.println("Validos: " + val + ", Invalidos: " + inv);
    }

    public void contarValor(int x) {
        int con = 0;
        for (int i = 0; i < nBilletes; i++) {
            String s = numSerieBilletes[i];
            int num = Integer.parseInt(s.substring(1));
            boolean inv = (num >= 67250001 && num <= 67700000 || num >= 87280145 && num <= 91646549 || num >= 77100001 && num <= 77550000);
            int v = 50; // default
            if (num >= 67250001 && num <= 67700000) v = 50;
            else if (num >= 87280145 && num <= 91646549) v = 20;
            else if (num >= 77100001 && num <= 77550000) v = 10;
            if (v == x && !inv) con++;
        }
        System.out.println("Validos de Bs" + x + ": " + con);
    }

    public void sumaInvalidos() {
        int suma = 0;
        for (int i = 0; i < nBilletes; i++) {
            String s = numSerieBilletes[i];
            int num = Integer.parseInt(s.substring(1));
            int v = 50;
            if (num >= 67250001 && num <= 67700000) v = 50;
            else if (num >= 87280145 && num <= 91646549) v = 20;
            else if (num >= 77100001 && num <= 77550000) v = 10;
            boolean inv = (num >= 67250001 && num <= 67700000 || num >= 87280145 && num <= 91646549 || num >= 77100001 && num <= 77550000);
            if (inv) suma += v;
        }
        System.out.println("Suma invalidos: Bs " + suma);
    }
}