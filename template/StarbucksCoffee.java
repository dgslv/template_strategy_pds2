public abstract class StarbucksCoffee {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Fervendo a água :D");
    }

    void pourInCup() {
        System.out.println("Servindo seu produto...");
    }
}