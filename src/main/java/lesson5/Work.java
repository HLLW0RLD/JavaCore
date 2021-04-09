package lesson5;

public class Work {
    public static void main(String[] args) {

        Worker[] wrkrArr = new Worker[5];
        wrkrArr[0] = new Worker("Misha", "dentist", "michael82@mail.com", 8905327,
                90000, 30);
        wrkrArr[1] = new Worker("Andrew", "manager", "superandrew@gmail.com", 8910777,
                30000, 20);
        wrkrArr[2] = new Worker("Nikita", "builder", "nicotin@mail.ru", 8915467,
                50000, 45);
        wrkrArr[3] = new Worker("Sasha", "engineer", "alex@bing.com", 8999675,
                70000, 50);
        wrkrArr[4] = new Worker("Alina", "seller", "alina7945@gmail.com", 8977432,
                60000, 26);

        for (int i=0; i < wrkrArr.length; i++)
            if (wrkrArr[i].age > 40) {
                wrkrArr[i].print();
            }
    }
}
