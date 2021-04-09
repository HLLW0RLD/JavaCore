package lesson5;

public class Worker {
    String name;
    String position;
    String email;
    double number;
    double money;
    double age;

    Worker(String _name, String _position, String _email, int _number, int _money, int _age){
        name = _name;
        position = _position;
        email = _email;
        number = _number;
        money = _money;
        age = _age;
    }

    public void print(){
        System.out.println("\nИмя: " + name +"\nДолжность: "+ position +"\nemail: "+ email +"\nТелефон: "
                + number +"\nЗарплата: " + money +"\nВозраст: "+ age + "\n");
    }

}
