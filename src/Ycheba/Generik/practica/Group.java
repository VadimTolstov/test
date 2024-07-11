package Ycheba.Generik.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Group<T extends Animal> {

    private String name;

    private List<T> animalList = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addNewAnimal(T animal) {
        animalList.add(animal);
        System.out.println("В группу " + name + " добавили новое животное вида " + animal.getView() + " его имя " + animal.getName() + " ему " +
                           animal.getAge() + " лет");
    }

    public void informationAboutTheGroup(Group<T> animalList) {
        System.out.println("Это группа " + name + " и в ней: ");
        for (T s : animalList.getAnimalList()) {
            System.out.println("Имя члена группы " + s.getName() + " и его возраст " + s.getAge());
        }
    }

    public void playWith(Group<T> group) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = group.name;
        }
        System.out.println("Группа " + winnerName + " сильнее другой группы");
    }

    public List<T> getAnimalList() {
        return animalList;
    }
}
