package View.Menu;

import View.Console;

public class Save extends MainMenu {

    public Save(Console console) {
        super(console, "save animals");
    }

    public void execute(){
        console.save();
    }
}
