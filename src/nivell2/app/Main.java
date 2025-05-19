package nivell2.app;

import nivell2.devices.Smartphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Smartphone samsung = new Smartphone("Samsung","Galaxy4536");

        samsung.trucar("6548920304");
        samsung.fotografiar();
        samsung.alarma();
    }
}