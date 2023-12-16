package Model.Zoo;

import Model.Animal.Animal;
import Model.Animal.ComparatorAge;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Animal {
    public List<Animal> animals;



    public Zoo() {
        animals = new ArrayList<>();
    }

    public Object get(int i){
        return animals.get(i);
    }
    public void addCommand(String name, String command){
        for (Animal animal: animals) {
            if(animal.getName().equals(name)){
                animal.addCommand(command);
            }
        }
    }
    public void sortAge() {
        animals.sort(new ComparatorAge<>());

    }

    public void add(Animal animal){
        animals.add(animal);
    }

    public String showZoo() {
        StringBuilder lol = new StringBuilder();
        if (animals.isEmpty()){
            lol.append("There are no animals");
        }
        else{
            lol.append("There are animals:\n");
            for (int i = 0; i < animals.size(); i++) {
                lol.append(i);
                lol.append(". ");
                lol.append(animals.get(i));
                lol.append("\n");
            }

        }
        return lol.toString();
    }

    @Override
    public void addCommand(String command) {

    }

    @Override
    public String getName() {
        return "d";
    }

    @Override
    public Integer getAge() {
        return null;
    }
}
