package lesson6;

public class Cat extends Animal{

    Cat(String name){
        super(name);
}

    @Override
    void run(int a) {
        if (a > 0 && a < 200){
            System.out.println(getName() + " пробежал " + a + " метров");
        }else {
            System.out.println(getName() + " не может пробежать " + a + " метров");
        }
    }

    @Override
    void swim(int b) {
        System.out.println(getName() + " не умеет плавать");
    }

}
