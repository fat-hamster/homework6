public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.catInfo();
        cat1.jump(1.5);
        cat1.swim(10);
        cat1.run(90);

        dog1.dogInfo();
        dog1.jump(0.5);
        dog1.swim(7);
        dog1.run(120);
    }
}
