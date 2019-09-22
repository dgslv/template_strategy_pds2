public class Ganso extends Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Ganso(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public void display() {
        System.out.println("---------------------");
        System.out.println("GANSAAAADAAAA");
        System.out.println("---------------------");
    }
}