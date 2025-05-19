package nivell3.app;

import nivell3.manager.MenuManager;
import nivell3.manager.NoticiesManager;
import nivell3.manager.RedactorManager;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        RedactorManager redactorManager = new RedactorManager();
        NoticiesManager noticiesManager = new NoticiesManager();
        MenuManager menuManager = new MenuManager(redactorManager, noticiesManager);

        menuManager.mostrarMenu();

    }

}
