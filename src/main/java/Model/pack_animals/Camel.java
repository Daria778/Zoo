package Model.pack_animals;
import Model.Animal.Animal;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Camel implements Animal, Serializable {
    private List<String> commands;
    private String name;
    private LocalDate birthdate;

    public Camel(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.commands = new ArrayList<>();
    }


    @Override
    public String toString() {
        return name + ", " + "birthdate: " + birthdate + ", commands:" + commands;
    }

    @Override
    public void addCommand(String command) {
        commands.add(command);
    }
    public String getName(){
        return name;
    }

    @Override
    public Integer getAge() {
        LocalDate date = LocalDate.now();
        return Period.between(birthdate, date).getYears();
    }

    public List<String> getCommands(){
        return commands;
    }

}
