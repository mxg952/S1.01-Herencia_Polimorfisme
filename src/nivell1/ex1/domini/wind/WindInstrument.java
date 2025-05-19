package nivell1.ex1.domini.wind;

import nivell1.ex1.domini.Instrument;

public class WindInstrument extends Instrument {

    static {
        System.out.println("WindInstrument class charged.");

    }

    {
        System.out.println ("New percussion instrument created.");
    }


    public WindInstrument(String name, int price) {

        super(name, price);
    }

    public void play() {
        System.out.println( "There's a wind instrument playing.");
    }
    public static void stockInstrument() {

        System.out.println("There's wind instrument stock.");
    }
}
