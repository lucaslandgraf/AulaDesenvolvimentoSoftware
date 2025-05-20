import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Totó", 2, true);
        Cat cat1 = new Cat("Black", 4, true);

        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(dog1);
        listAnimals.add(cat1);

        for (Animal item : listAnimals) {
            System.out.println(item.toString());
            item.som();
            item.mover();
        }
		
	}
}
