public class Marreco extends Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Marreco(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);

        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("---------------------");
        System.out.println("Eu sou um marrecooo");
        System.out.println("---------------------");
    }
}