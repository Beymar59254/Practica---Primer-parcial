public class Celular {
    String codUsuario;
    String nombrePropietario;
    String imei;
    String[][] contactos = new String[2][20];

    int nContactos = 0;

    public Celular(String cod, String nom, String im) {
        codUsuario = cod;
        nombrePropietario = nom;
        imei = im;
        nContactos = 12;
        String[] nombres = {"Rolo", "Juan", "Sol", "Maria1", "Gio", "Fer", "Andy", "Juan2", "Nery", "Fer2", "Rony", "Pedro"};
        String[] nums = {"77548412", "70583512", "60586112", "60985631", "74582311", "70583541", "72396541", "60187451", "70198541", "79584112", "77596112", "12345678"};
        for (int i = 0; i < nContactos; i++) {
            contactos[0][i] = nombres[i];
            contactos[1][i] = nums[i];
        }
    }

    public void mostrar() {
        System.out.println("Cod Usuario: " + codUsuario);
        System.out.println("Propietario: " + nombrePropietario);
        System.out.println("IMEI: " + imei);
        System.out.println("Contactos:");
        for (int i = 0; i < nContactos; i++) {
            System.out.println(contactos[0][i] + " - " + contactos[1][i]);
        }
        System.out.println("---");
    }

    public void agregar(String nom, String num) {
        if (nContactos < 20) {
            contactos[0][nContactos] = nom;
            contactos[1][nContactos] = num;
            nContactos++;
        }
        mostrar();
    }

    public void eliminar(String x) {
        for (int i = 0; i < nContactos; i++) {
            if (contactos[1][i].equals(x)) {
                for (int j = i; j < nContactos - 1; j++) {
                    contactos[0][j] = contactos[0][j + 1];
                    contactos[1][j] = contactos[1][j + 1];
                }
                nContactos--;
                break;
            }
        }
        mostrar();
    }

    public void editar(String y, String xnew) {
        for (int i = 0; i < nContactos; i++) {
            if (contactos[0][i].equals(y)) {
                contactos[1][i] = xnew;
                break;
            }
        }
        mostrar();
    }

    public void buscarNum(String x) {
        for (int i = 0; i < nContactos; i++) {
            if (contactos[1][i].equals(x)) {
                System.out.println("Nombre: " + contactos[0][i]);
                return;
            }
        }
        System.out.println("No encontrado");
    }

    public void contar112() {
        int c = 0;
        for (int i = 0; i < nContactos; i++) {
            if (contactos[1][i].endsWith("112")) c++;
        }
        System.out.println("Contactos terminan 112: " + c);
    }
}

