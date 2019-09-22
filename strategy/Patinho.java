public class Patinho extends Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Patinho(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public void display() {
        System.out.println("---------------------");
        System.out.println("Eu sou um patinhoooo");
        System.out.println("---------------------");

    }
}