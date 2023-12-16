package View.Menu;

import View.Console;

public abstract class MainMenu {
    Console console;
    private String description;

    public MainMenu(Console console, String description) {
        this.console = console;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public abstract void execute();
}
