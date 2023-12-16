package View;

import Presenter.Presenter;
import View.Menu.MainMenu;
import View.Menu.Menu;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Console implements View {
    private static final String DATE_FORMAT_INPUT = "yyyy.MM.dd";
    private Presenter presenter;
    private boolean work;
    private Scanner scanner;
    private Menu simple;

    public Console() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
        this.simple = new Menu(this) {
        };
        }


    @Override
    public void start() {
        enter();
        }

    public void finish() {
        System.out.println("GoodBye!");
        work = false;
    }
    public void save(){
        presenter.save();
    }
    public void showZoo(){
        System.out.println(presenter.showToys());
    }
    public void addCommand(){
        System.out.println("Enter the name of the animal:");
        String ans = scanner.nextLine();
        System.out.println("Enter the command for the animal:");
        String lol = scanner.nextLine();
        presenter.addCommand(ans, lol);
    }
    public void sortByAge(){
        presenter.sortByAge();
    }

    public void addAnimal() {
        System.out.println("Enter the name of the animal:");
        String ans = scanner.nextLine();
        System.out.println("Enter the type(from pets or from pack_animals) of the animal:");
        String and = scanner.nextLine();
        System.out.println("Enter the birthdate(yyyy.MM.dd) of the animal:");
        String uyu = scanner.nextLine();
        LocalDate simple = LocalDate.parse(uyu, DateTimeFormatter.ofPattern(DATE_FORMAT_INPUT));
        presenter.addAnimal(ans, and, simple);
    }
    public void enter(){
            while(work){
                System.out.println(simple.menu());
                String option = scanner.nextLine();
                int numOp = Integer.parseInt(option);
                simple.execute(numOp);
        }
    }


}
