package View.Menu;

import View.Console;

public class ShowZoo extends MainMenu {

    public ShowZoo(Console console) {
        super(console, "show zoo");

    }

    public void execute() {
        console.showZoo();
    }
}
