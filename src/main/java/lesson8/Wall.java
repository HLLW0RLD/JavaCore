package lesson8;

public class Wall extends Barrier{

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " высотой: " + this.height);

        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("Перепрыгнул");

            return true;
        } else {
            System.out.println("Не смог перепрыгнуть");

            return false;
        }
    }
}
