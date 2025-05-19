package nivell1.ex2.app;

import nivell1.ex2.domini.Cotxe;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nInvocant mètode estàtic:");

        Cotxe.frenar();

        System.out.println("\nInvocant mètode no estàtic:");

        Cotxe mercedes = new Cotxe("Vito",300);

        mercedes.accelerar();
    }

}
