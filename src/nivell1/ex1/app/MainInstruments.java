package nivell1.ex1.app;

import nivell1.ex1.domini.percussion.PercussionInstrument;
import nivell1.ex1.domini.string.StringInstrument;
import nivell1.ex1.domini.wind.WindInstrument;

public class MainInstruments {

    public static void main(String[] args) {

        System.out.println("\nCharging class through access static method:");

        PercussionInstrument.stockInstrument();
        StringInstrument.stockInstrument();
        WindInstrument.stockInstrument();


        System.out.println("\nCharging class through instance:");

        StringInstrument violin = new StringInstrument("Violin", 500);
        PercussionInstrument bongo = new PercussionInstrument("Bongos", 250);
        WindInstrument trombone =  new WindInstrument("Trombone", 600);

        System.out.println("\nAccess to instance method:");

        violin.play();
        bongo.play();
        trombone.play();
    }
    }


