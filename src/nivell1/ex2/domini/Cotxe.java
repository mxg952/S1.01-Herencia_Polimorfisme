package nivell1.ex2.domini;

public class Cotxe {

    static final String MARCA = "Mercedes";
    static String model;
    final int POTENCIA;

    public Cotxe (String model, int potencia) {
       Cotxe.model = model;
       this.POTENCIA = potencia;
    }

    public static String getMarca() {
        return MARCA;
    }

    public static String getModel() {
        return model;
    }

    public int getPotencia() {
        return POTENCIA;
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant.");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant.");
    }

}
