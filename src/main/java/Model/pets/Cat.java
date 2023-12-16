package Model.pets;

import Model.Animal.Animal;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cat implements Animal, Serializable {

    private String name;
    private LocalDate birthdate;
    private List<String> commands;

    public Cat(String name, LocalDate birthdate) {
        this.name = name;
        this.commands = new ArrayList<>();
        this.birthdate = birthdate;
    }
    @Override
    public Integer getAge() {
        LocalDate date = LocalDate.now();
        return Period.between(birthdate, date).getYears();
    }
    public String getName(){
        return name;
    }
    List<String> getCommands(){
        return commands;
    }
    @Override
    public void addCommand(String command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return name + ", " + "birthdate: " + birthdate + ", commands:" + commands;
    }
}
