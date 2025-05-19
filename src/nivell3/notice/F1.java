package nivell3.notice;

public class F1 extends Noticia{

    public String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 100;

        if (this.escuderia.toLowerCase().contains("ferrari")) {
            preu += 50;
        }
        if (this.escuderia.toLowerCase().contains("mercedes")) {
            preu += 50;
        }

        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4;

        if (this.escuderia.toLowerCase().contains("madrid")) {
            puntuacio += 2;
        }
        if (this.escuderia.toLowerCase().contains("barça")) {
            puntuacio+= 2;
        }

        return puntuacio;

    }

}










