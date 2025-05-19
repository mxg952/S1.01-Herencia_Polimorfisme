package nivell3.notice;

public class Basquet extends Noticia {

    public String competicio;
    public String club;

    public Basquet(String titular, String competicio, String club ) {
        super(titular);
        this.competicio = competicio;
        this.club = club;

    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 250;

        if (this.competicio.toLowerCase().contains("euroliga")) {
            preu += 75;
        }

        if (this.club.toLowerCase().contains("madrid")) {
            preu += 75;
        }
        if (this.club.toLowerCase().contains("barça")) {
            preu += 75;
        }

        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4;

        if (this.competicio.toLowerCase().contains("euroliga")) {
            puntuacio += 3;
        }
        if (this.competicio.toLowerCase().contains("acb")) {
            puntuacio += 2;
        }
        if (this.club.toLowerCase().contains("madrid")) {
            puntuacio += 1;
        }
        if (this.club.toLowerCase().contains("barça")) {
            puntuacio+= 1;
        }

        return puntuacio;

    }


}
