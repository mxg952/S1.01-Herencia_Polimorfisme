package nivell1.ex1.domini.percussion;

import nivell1.ex1.domini.Instrument;

public class PercussionInstrument extends Instrument {

    static {

        System.out.println("PercussionInstrument class charged.");

    }

    {

        System.out.println ("New percussion instrument created.");

    }

    public PercussionInstrument(String name, int price) {

        super(name, price);
    }


    public void play() {

        System.out.println("There's a percussion instrument playing.");
    }

    public static void stockInstrument() {

        System.out.println("There's percussion instrument stock.");
    }


}
