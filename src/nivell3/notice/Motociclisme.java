package nivell3.notice;

public class Motociclisme extends Noticia{

    public String equip;

    public Motociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 100;

        if (this.equip.toLowerCase().contains("honda")) {
            preu += 50;
        }
        if (this.equip.toLowerCase().contains("yamaha")) {
            preu += 50;
        }

        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        String titularMinus = this.titular.toLowerCase();
        int puntuacio = 3;

        if (this.equip.toLowerCase().contains("honda")) {
            puntuacio += 3;
        }
        if (this.equip.toLowerCase().contains("yamaha")) {
            puntuacio += 3;
        }

        return puntuacio;

    }

}
