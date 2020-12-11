import java.util.Random;

public class Cat extends Animal{
    private final int RUN_DISTANCE;
    private final double JUMP_HEIGHT;
    private final int SWIM_DISTANCE = 0;
    private final Random rnd;

    public Cat() {
        rnd = new Random();
        this.RUN_DISTANCE = rnd.nextInt(150) + 100;
        this.JUMP_HEIGHT = (double)(rnd.nextInt(2) + 1) / 10;
    }

    @Override
    void run(int distance) {
        if (distance > RUN_DISTANCE) {
            System.out.printf("%s run (%d): false%n", this, distance);
        } else {
            System.out.printf("%s run (%d): true%n", this, distance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.println(this + " swim (" + distance + ") Я не умею плавать.");
    }

    @Override
    void jump(double height) {
        if (height > JUMP_HEIGHT) {
            System.out.printf("%s jump (%.1f): false%n", this, height);
        } else {
            System.out.printf("%s jump (%.1f): true%n", this, height);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
