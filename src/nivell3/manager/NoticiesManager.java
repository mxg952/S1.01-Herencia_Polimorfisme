package nivell3.manager;

import nivell3.notice.*;

import java.util.Scanner;

public class NoticiesManager {

    private final Scanner scanner;

    public NoticiesManager() {
        this.scanner = new Scanner(System.in);
    }

    public Noticia introduirNoticia(){
        System.out.println("\nIntrodueix el tipus de noticia: " +
                        "\n1.Futbol." +
                        "\n2.Basquet." +
                        "\n3.Tenis" +
                        "\n4.F1" +
                        "\n5.Motociclisme");
        int tipus = scanner.nextInt();
        scanner.nextLine();

        switch (tipus){
            case 1:
                return noticiaFutbol();
            case 2:
                return noticiaBasquet();
            case 3:
                return tenisNoticia();
            case 4:
                return f1Noticia();
            case 5:
                return motoNoticia();
            default:
                System.out.println("Opción no valida. Noticia no creada");
                return null;
        }

    }
    private Futbol noticiaFutbol(){
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();

        System.out.print("Competició: ");
        String competicio = scanner.nextLine();

        System.out.print("Club: ");
        String club = scanner.nextLine();

        System.out.print("Jugador: ");
        String jugador = scanner.nextLine();

        return new Futbol(titular,competicio,club,jugador);
    }

    private Basquet noticiaBasquet(){
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();

        System.out.print("Competició: ");
        String competicio = scanner.nextLine();

        System.out.print("Club: ");
        String club = scanner.nextLine();

        return new Basquet(titular, competicio, club);
    }

    private Tenis tenisNoticia(){
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();

        System.out.print("Competició: ");
        String competicio = scanner.nextLine();

        System.out.print("Tenista: ");
        String tenista = scanner.nextLine();

        return new Tenis(titular, competicio, tenista);
    }

    private F1 f1Noticia(){
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();

        System.out.print("Escuderia: ");
        String escuderia = scanner.nextLine();

        return new F1(titular, escuderia);
    }

    private Motociclisme motoNoticia(){
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();

        System.out.print("Equip: ");
        String equip = scanner.nextLine();

        return new Motociclisme(titular, equip);
    }
}
