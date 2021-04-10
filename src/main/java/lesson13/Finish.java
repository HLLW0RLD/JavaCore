package lesson13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Finish extends Stage{

    private static final Lock b;

    static {
        b = Main.b;
    }

    @Override
    public void go(Car c) {

        b.lock();
        System.out.println(c.getName() + " финишировал!");

    }
}
