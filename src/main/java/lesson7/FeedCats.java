package lesson7;

import lesson6.Cat;

public class FeedCats {

    private static int TIME = 0;

    public static void main(String[] args) {

        Cats[] cat = new Cats[3];
        cat[0] = new Cats("Дымок", 150, 3);
        cat[1] = new Cats("Василий", 100, 4);
        cat[2] = new Cats("Пушок", 30, 1);
        Plate plate = new Plate(700);
        System.out.println("У Вас есть три кота: " + cat[0].getName() + ", " +
                cat[1].getName() + ", " + cat[2].getName() + ", которые хотят есть каждые " +
                cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " +
                cat[2].getSatietyTime() + " час(а) соответственно.");
        System.out.println("Сейчас в миске " +
                plate.getFood() + " грамм кошачьего корма.\n");

        do {
            for (Cats i : cat) {
                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " +
                    TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 24);
    }
}

