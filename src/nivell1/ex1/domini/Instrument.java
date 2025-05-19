package nivell1.ex1.domini;

public abstract class Instrument {

    public String name;
    public int price;


    public Instrument (String name, int preu) {
        this.name = name;
        this.price = preu;

    }


    public abstract void play();
}
