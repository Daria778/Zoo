package Model.pack_animals;

import Model.Animal.Animal;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donkey implements Animal, Serializable {
    private String name;
    private List<String> commands;
    private LocalDate birthdate;

    public Donkey(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.commands = new ArrayList<>();
    }
    @Override
    public Integer getAge() {
        LocalDate date = LocalDate.now();
        return Period.between(birthdate, date).getYears();
    }
    @Override
    public void addCommand(String command) {
        commands.add(command);
    }
    public String getName(){
        return name;
    }
    List<String> getCommands(){
        return commands;
    }
    @Override
    public String toString() {
        return name + ", " + "birthdate: " + birthdate + ", commands:" + commands;
    }
}
