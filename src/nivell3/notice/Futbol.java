package nivell3.notice;

public class Futbol extends Noticia{
    public String competicio;
    public String club;
    public String jugador;

    public Futbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 300;

        if (this.competicio.toLowerCase().contains("lliga de campions")) {
            preu += 100;
        }
        if (this.club.toLowerCase().contains("madrid")) {
            preu += 100;
        }
        if (this.club.toLowerCase().contains("barça")) {
            preu+= 100;
        }
        if (this.jugador.toLowerCase().contains("ferran torres")) {
            preu += 50;
        }
        if (this.jugador.toLowerCase().contains("benzema")) {
            preu += 50;
        }
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 5;

        if (this.competicio.toLowerCase().contains("lliga de campions")) {
            puntuacio += 3;
        }
        if (this.competicio.toLowerCase().contains("lliga de campions")) {
            puntuacio += 1;
        }
        if (this.club.toLowerCase().contains("madrid")) {
            puntuacio += 1;
        }
        if (this.club.toLowerCase().contains("barça")) {
            puntuacio+= 1;
        }
        if (this.jugador.toLowerCase().contains("ferran torres")) {
            puntuacio += 1;
        }
        if (this.jugador.toLowerCase().contains("benzema")) {
            puntuacio += 1;
        }
        return puntuacio;

    }

}
