package lesson8;

public class Road extends Barrier{

    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " длинной: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Пробежал");
            return true;
        } else {
            System.out.println("Не смог пробежать");
            return false;
        }
    }
}
