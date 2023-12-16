package Presenter;

import Model.Service.Service;
import View.View;

import java.time.LocalDate;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }

    public void addAnimal(String name, String type, LocalDate birthdate){
        service.addAnimal(name, type, birthdate);
    }
    public String showToys(){
        return service.showZoo();
    }
    public void addCommand(String name, String command){
        service.addCommand(name, command);
    }

    public void sortByAge(){
        service.sortByAge();
    }


}
