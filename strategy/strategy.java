import Patinho;
import Ganso;
import Marreco;
import Duck;

class Strategy {
    public static void main(String[] args) {
        FlyNoWay flyNoWay = new FlyNoWay();
        FlyWithWings flyWithWings = new FlyWithWings();
        Quack quack = new Quack();
        Squack squack = new Squack();
        MuteQuack muteQuack = new MuteQuack();

        Patinho patinho = new Patinho(flyNoWay, muteQuack);
        Ganso ganso = new Ganso(flyNoWay, squack);
        Marreco marreco = new Marreco(flyWithWings, quack);
        
        System.out.println("Criei um pato. Vamos ver informações sobre ele");
        patinho.display();
        patinho.performQuack();
        patinho.performFly();

        System.out.println("Criei o segundo pato. Vamos ver informações sobre ele");
        ganso.display();
        ganso.performQuack();
        ganso.performFly();

        System.out.println("Criei o terceiro pato. Vamos ver informações sobre ele");
        marreco.display();
        marreco.performQuack();
        marreco.performFly();

    }
}