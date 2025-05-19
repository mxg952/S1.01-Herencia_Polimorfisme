package nivell1.ex1.domini.string;

import nivell1.ex1.domini.Instrument;

public class StringInstrument extends Instrument {

    static {
        System.out.println("StringInstrument class charged.");

    }

    {
        System.out.println ("New string instrument created.");
    }

    public StringInstrument(String name, int price) {

        super(name, price);
    }

    public void play() {
        System.out.println ("There's a string instrument playing.");
    }

    public static void stockInstrument() {

        System.out.println("There's string instrument stock.");
    }

    }
