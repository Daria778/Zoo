package Model.Animal;

import java.util.Comparator;

public class ComparatorAge<E extends Animal > implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getAge() - o2.getAge();
    }
}