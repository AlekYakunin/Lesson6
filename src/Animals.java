public class Animals {

    String name;
    String color;
    int age;
    int distance;
    int swimDistance;

    Animals(String name, String color, int age, AnimalCounter counter) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public void run(int distance) {
        if (distance <= this.distance) {
            System.out.println(this.name + " пробежал " + distance + " м ");
        } else {

            System.out.println(this.name + " не может пробежать " + distance + " м ");
        }
    }

    void swim(int swimDistance) {
        if (this.swimDistance == 0) {
            System.out.println(this.name + " не умеет плавать ");
        } else {
            if (swimDistance <= this.swimDistance) {
                System.out.println(this.name + " проплыл " + swimDistance + " м ");
            } else {

                System.out.println(this.name + " не может проплыть " + swimDistance + " м ");
            }
        }
    }

}
