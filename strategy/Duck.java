public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior)  {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly () {
        flyBehavior.fly();
    }
    public void performQuack () {
        quackBehavior.quack();
    }

    public void swim () {
        System.out.println("Todos os patos boiam heheh");
    }
}