package View.Menu;

import View.Console;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MainMenu> itemList;
    public Menu(Console console) {
        itemList = new ArrayList<>();
        itemList.add(new ShowZoo((console)));
        itemList.add(new AddAnimal(console));
        itemList.add(new AddCommand((console)));
        itemList.add(new SortByAge((console)));
        itemList.add(new Finish((console)));

    }
    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(itemList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int option){
        MainMenu mainItem = itemList.get(option-1);
        mainItem.execute();
    }
}
