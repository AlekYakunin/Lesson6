public class Dog extends Animals {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    Dog(String name, String color, int age, AnimalCounter counter) {
        super(name, color, age, counter);
        super.setDistance(MAX_RUN_DISTANCE);
        super.setSwimDistance(MAX_SWIM_DISTANCE);

        counter.AddDog();
        counter.AddAnimal();
    }


}
