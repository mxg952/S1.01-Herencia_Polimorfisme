package nivell3;

import nivell3.notice.Noticia;

import java.util.ArrayList;

public class Redactor {

    public String nom;
    public String DNI;
    static double sou = 1500;
    ArrayList<Noticia> noticies;

    public Redactor(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
        this.noticies = new ArrayList<Noticia>();
    }

    public String getNom() {

        return this.nom;
    }

    public String getDNI() {

        return this.DNI;
    }

    public void afegirNoticia(Noticia noticia){

        noticies.add(noticia);
    }

    public String toString(){
        return "\nRedactor: " + this.nom + "\nDNI: " + this.DNI + "\nSou: " + Redactor.sou;
    }

}

