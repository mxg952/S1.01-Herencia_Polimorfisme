package nivell3.notice;

public abstract class Noticia {

    public String titular;
    public String text;
    public int puntuacio;
    public double preu;

    {
        this.text = "";
    }

    public Noticia(String titular) {
        this.titular = titular;

    }

    public String getTitular() {

        return this.titular;
    }

    public abstract int calcularPreuNoticia();

    public abstract int calcularPuntuacio();

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + this.titular + '\'' +
                ", text='" + this.text + '\'' +
                ", puntuacio=" + this.puntuacio +
                ", preu=" + this.preu +
                '}';
    }
}

