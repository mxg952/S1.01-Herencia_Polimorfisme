package nivell2.devices;

public class Telefon {

    String marca;
    String model;

    public Telefon(String marca, String model ){
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numeroTelefon) {

        System.out.println("\nS'esta trucant al número " + numeroTelefon + "....");
    }

}
