package lesson6;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        cat.run(150);
        cat.swim(40);
        Dog dog = new Dog("Rex");
        dog.run(250);
        dog.swim(7);
    }
}
