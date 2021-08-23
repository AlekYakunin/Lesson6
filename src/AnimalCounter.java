public class AnimalCounter {
    int animalCounter;
    int dogCounter;
    int catCounter;

    public void AnimalCounter() {

        animalCounter = 0;
        dogCounter = 0;
        catCounter = 0;
    }

    public void AddAnimal() {
        animalCounter++;
    }

    public void AddDog() {
        dogCounter++;
    }

    public void AddCat() {
        catCounter++;
    }

    public void ShowAnimals() {
        System.out.println("Всего животных: " + animalCounter);
        System.out.println("Собак: " + dogCounter);
        System.out.println("Котов: " + catCounter);
    }
}
