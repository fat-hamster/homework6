import java.util.Random;

public class Dog extends Animal {
    private final int RUN_DISTANCE;
    private final double JUMP_HEIGHT;
    private final Random rnd;

    public Dog() {
        rnd = new Random();
        this.RUN_DISTANCE = rnd.nextInt(300) + 200;
        this.JUMP_HEIGHT = (double)(rnd.nextInt(1) + 4) / 10;
        this.SWIM_DISTANCE = rnd.nextInt(5) + 5;
    }

    private final int SWIM_DISTANCE;

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
        if (distance > SWIM_DISTANCE) {
            System.out.printf("%s swim (%d): false%n", this, distance);
        } else {
            System.out.printf("%s swim (%d): true%n", this, distance);
        }
    }

    @Override
    void jump(double height) {
        if (height > JUMP_HEIGHT) {
            System.out.printf("%s jump (%.1f): false%n", this, height);
        } else {
            System.out.printf("%s jump (%.1f): true%n", this, height);
        }
    }

    public void dogInfo() {
        System.out.printf("Собака%nБег: %d%nПрыжок: %.1f%nПлавание: %d%n", RUN_DISTANCE, JUMP_HEIGHT, SWIM_DISTANCE);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
