package lesson7;

class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 400;
        System.out.println("В миску добавили 400 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}
