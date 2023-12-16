package Model.Service;
import Model.FileSystem.FileHandler;
import Model.FileSystem.Workable;
import Model.Zoo.Zoo;
import Model.pack_animals.Camel;
import Model.pack_animals.Donkey;
import Model.pack_animals.Horse;
import Model.pets.Cat;
import Model.pets.Dog;
import Model.pets.Hamster;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Service {
    private Zoo zoo;
    private Workable<Object> file;



    public Service() {
        this.zoo = new Zoo();
        this.file = new FileHandler<>();
    }

    public void save() {
        try {
            file.fileWDToys(zoo);
            System.out.println("The animals have been added");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String showZoo(){
        try{
            zoo = file.fileRToys();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return zoo.showZoo();
    }


    public void addAnimal(String name, String type, LocalDate birthdate){
        if(type == "camel"){
            Camel camel = new Camel(name, birthdate);
            zoo.add(camel);
        }
        if(type == "horse"){
            Horse horse = new Horse(name, birthdate);
            zoo.add(horse);
        }
        if(type == "donkey"){
        Donkey donkey = new Donkey(name, birthdate);
                zoo.add(donkey);
        }
        if(type == "cat"){
            Cat cat = new Cat(name, birthdate);
            zoo.add(cat);
        }
        if(type == "dog"){
            Dog dog = new Dog(name, birthdate);
            zoo.add(dog);
        }
        if(type == "hamster"){
            Hamster hamster = new Hamster(name, birthdate);
            zoo.add(hamster);
        }
    }

    public void addCommand(String name, String command){
        zoo.addCommand(name, command);

    }
    public void sortByAge(){
        zoo.sortAge();
    }


}
