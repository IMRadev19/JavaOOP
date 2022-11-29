public class Cat extends Mammal {
    public Cat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void test() {
        System.out.println("Testing...");
    }
}