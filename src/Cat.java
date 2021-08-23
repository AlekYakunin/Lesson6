public class Cat extends Animals {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;

    Cat(String name, String color, int age, AnimalCounter counter) {
        super(name, color, age, counter);
        super.setDistance(MAX_RUN_DISTANCE);
        super.setSwimDistance(MAX_SWIM_DISTANCE);

        counter.AddCat();
        counter.AddAnimal();
    }
}
