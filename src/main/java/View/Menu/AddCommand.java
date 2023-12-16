package View.Menu;

import View.Console;

public class AddCommand extends MainMenu {

    public AddCommand(Console console) {
        super(console, "add command");

    }
    public void execute(){
        console.addCommand();
    }
}