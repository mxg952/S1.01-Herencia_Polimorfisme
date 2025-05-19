package nivell3.manager;

import nivell3.Redactor;

import java.util.Scanner;

public class RedactorManager {

    private Scanner scanner;

    public RedactorManager() {
        this.scanner = new Scanner (System.in);
    }

    public Redactor createEditor(){
        System.out.print("\nIntrodueix el nom del redactor: ");
        String nom = scanner.nextLine();

        System.out.print("\nIntrodueix el DNI del redactor: ");
        String dni = scanner.nextLine();

        return new Redactor(nom, dni);
    }

    @Override
    public String toString() {
        return "RedactorManager{" +
                "scanner=" + scanner +
                '}';
    }
}
