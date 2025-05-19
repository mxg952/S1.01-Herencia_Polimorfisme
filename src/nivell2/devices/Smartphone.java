package nivell2.devices;

import nivell2.features.Camera;
import nivell2.features.Rellotge;

public class Smartphone extends Telefon implements Camera, Rellotge {

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {

        System.out.println("\nS'està fent una foto.");
    }

    @Override
    public void alarma() {

       System.out.println("\nEstà sonant l'alarma.");

    }
}
