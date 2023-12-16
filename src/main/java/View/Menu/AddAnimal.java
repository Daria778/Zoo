package View.Menu;
import View.Console;


public class AddAnimal extends MainMenu {

    public AddAnimal(Console console) {
        super(console, "add animal");

    }
    public void execute(){
        console.addAnimal();
    }
}