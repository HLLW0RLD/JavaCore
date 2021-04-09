package lesson6;

public class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    @Override
    void run(int a) {
        if (a > 0 && a < 500){
            System.out.println(getName() + " пробежал " + a + " метров");
        }else {
            System.out.println(getName() + " не может пробежать " + a + " метров");
        }
    }

    @Override
    void swim(int b) {
        if (b > 0 && b < 10){
            System.out.println(getName() + " проплыла " + b + "метров");
        }else {
            System.out.println(getName() + " не может плыть " + b + " метров");
        }
    }
}
