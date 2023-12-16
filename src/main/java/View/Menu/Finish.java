package View.Menu;


import View.Console;


public class Finish extends MainMenu {

    public Finish(Console console) {
        super(console, "exit");

    }
    public void execute(){
        console.finish();
    }
}