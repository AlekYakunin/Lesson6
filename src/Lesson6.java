import sun.plugin.dom.css.Counter;

public class Lesson6 {

    public static void main(String[] args) {

        AnimalCounter counter = new AnimalCounter();

        Dog FirstDog = new Dog("Шарик", "Серый", 5, counter);
        Cat FirstCat = new Cat("Томас", "Черно-белый", 2, counter);
        Cat SecondCat = new Cat("Мурка", "Рыжий", 4, counter);

        FirstDog.run(600);
        FirstDog.swim(9);

        FirstCat.run(150);
        FirstCat.swim(5);
        SecondCat.run(250);
        SecondCat.swim(0);


        counter.ShowAnimals();

    }


}
