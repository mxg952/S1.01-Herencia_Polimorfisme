package nivell3.notice;

public class Tenis extends Noticia {

    public String tenistes;
    public String competicio;

    public Tenis(String titular,  String competicio, String tenistes) {
        super(titular);
        this.tenistes = tenistes;
        this.competicio = competicio;
    }

    @Override
    public int calcularPreuNoticia() {
        int preu = 150;

        if (this.tenistes.toLowerCase().contains("federer")) {
            preu += 100;
        }
        if (this.tenistes.toLowerCase().contains("nadal")) {
            preu += 100;
        }
        if (this.tenistes.toLowerCase().contains("djokovic")) {
            preu += 100;
        }

        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int puntuacio = 4;

        if (this.tenistes.toLowerCase().contains("fereder")) {
            puntuacio += 3;
        }
        if (this.tenistes.toLowerCase().contains("nadal")) {
            puntuacio += 3;
        }
        if (this.tenistes.toLowerCase().contains("djokovic")) {
            puntuacio += 3;
        }

        return puntuacio;

    }
}



