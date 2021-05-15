package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Stadium {

    public static void main(String[] args) {

        Random rand = new Random();

        Actions[] actions = new Actions[3];
        Barrier[] barriers = new Barrier[6];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Андрей", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("Бендер", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat1("Мурзик", distance, heigth);

        boolean isRoad = true;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            //isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Трасса " + i, distance);
                isRoad = false;
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
                isRoad = true;
            }
        }

        for (int i = 0; i < actions.length; i++) {
           boolean result = true;
           for (int j = 0; j < barriers.length; j++) {
               result = barriers[j].moving(actions[i]);
               if (!result) {
                   break;
               }
           }
           if (result) {
               System.out.println("Успех");
           } else {
               System.out.println("Не успешно");
           }
       }
    }
}
