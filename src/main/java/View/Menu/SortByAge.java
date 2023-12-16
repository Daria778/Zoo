package View.Menu;

import View.Console;

public class SortByAge extends MainMenu {

    public SortByAge(Console console) {
        super(console, "sort zoo by age");

    }
    public void execute(){
        console.sortByAge();
    }
}
