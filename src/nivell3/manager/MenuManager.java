package nivell3.manager;

import nivell3.Redactor;
import nivell3.notice.Noticia;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {

    private Scanner scanner;
    private RedactorManager redactorManager;
    private NoticiesManager noticiesManager;
    private ArrayList<Redactor> redactors;
    private ArrayList<Noticia> noticies;

    public MenuManager(RedactorManager redactorManager, NoticiesManager noticiesManager ) {
        this.scanner = new Scanner(System.in);
        this.redactorManager = redactorManager;
        this.noticiesManager = noticiesManager;
        this.redactors = new ArrayList<>();
        this.noticies = new ArrayList<>();
    }
    public void mostrarMenu(){
        int opcio;
        do {
            menu();
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticies();
                    break;
                case 6:
                    calcularPuntuacio();
                    break;
                case 7:
                    calcularPreu();
                    break;
                case 0:
                    System.out.println("Sortint del menú...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }

        } while (opcio != 0);

    }

    public void menu(){
        System.out.println("\nMENÚ PRINCIPAL");
        System.out.println("1. Introduir redactor");
        System.out.println("2. Eliminar redactor");
        System.out.println("3. Introduir notícia a un redactor");
        System.out.println("4. Eliminar notícia (demana redactor i titular)");
        System.out.println("5. Mostrar totes les notícies per redactor");
        System.out.println("6. Calcular puntuació de la notícia");
        System.out.println("7. Calcular preu de la notícia");
        System.out.println("0. Sortir");
        System.out.print("Escull una opció: ");

    }

    private void introduirRedactor(){
        Redactor redactor = redactorManager.createEditor();
        redactors.add(redactor);

        System.out.println("L'editor: " + redactor + ", ha sigut creat correctament.");
    }

    private void eliminarRedactor(){
        System.out.println("Introduiu el DNI del editor:");
        String dni = scanner.nextLine();

        if (redactors.removeIf(e -> e.getDNI().equals(dni))){
            System.out.println("Redactor eliminat.");
        } else {
            System.out.println("No s'ha trobat un redactor amb aquest dni.");
        }
    }

    private void introduirNoticia() {
        if (redactors.isEmpty()) {
            System.out.println("No hi han editors. Afegeix-ne.");
            return;
        }

        System.out.println("Escull un editor: ");
        for (int i = 0; i < redactors.size(); i++) {
            System.out.println((i + 1) + ". " + redactors.get(i).getNom());
        }

        int redactorIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (redactorIndex >= 0 && redactorIndex < redactors.size()) {
            Noticia noticia = noticiesManager.introduirNoticia();
            noticies.add(noticia);
            redactors.get(redactorIndex).afegirNoticia(noticia);
            System.out.println("Noticia afegida: " + noticia);
        } else {
            System.out.println("Error, torna a intentar-ho.");
        }
    }

    private void eliminarNoticia() {
        System.out.println("Introdueixi el titular de la noticia a eliminar:");
        String titular = scanner.nextLine();
        if (noticies.removeIf(n -> n.getTitular().equals(titular))) {
            System.out.println("Noticia eliminada.");
        } else {
            System.out.println("No s'ha trobat cap noticia amb aquest titular.");
        }
    }

    private void mostrarNoticies(){
        String titulars = "";

        if (noticies.isEmpty()) {
            System.out.println("No hi ha noticies disponibles.");
        } else {
                for (Noticia n : noticies) {
                    titulars += "\nNoticia: " + n.getTitular();
                }
            System.out.println(titulars);
        }
    }

    private void calcularPuntuacio(){
        if (noticies.isEmpty()) {
            System.out.println("No hi ha noticies disponibles per calcular la puntuació.");
        } else {
            System.out.println("Puntuació de les noticies:");
            noticies.forEach(n -> System.out.println(n.getTitular() + ": " + n.calcularPuntuacio()));
        }
    }

    private void calcularPreu(){
        if (noticies.isEmpty()) {
            System.out.println("No hi ha noticies disponibles per calcular el preu.");
        } else {
            System.out.println("Preu de les noticies:");
            noticies.forEach(n -> System.out.println(n.getTitular() + ": " + n.calcularPreuNoticia()));
        }
    }

}
