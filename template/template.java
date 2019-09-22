import StarbucksCoffee;
import PratoDeMassa;

// exercicio 1


class MassaCarbonara extends PratoDeMassa {
    public void preparaIngredientes() {
        System.out.println("Cortar 200g bacon, bater 2 ovos, ralar 100g de queijo pecorino, pimento do reino à gosto");
    }

    public void preparaMolho() {
        System.out.println("fritar o bacon e misturar ao ovo batido, pimenta e queijo.");
    }

    public void finaliza() {
        System.out.println("Retirar a água da massa, misturar o molho e misturar.");
    }
}

class TunaPasta extends PratoDeMassa {
    public void preparaIngredientes() {
        System.out.println(
                "Separar uma lata de atum e um creme de leite. Cortar 6 tomates e 1 cebola grande. Pimenta do reino à gosto");
    }

    public void preparaMolho() {
        System.out.println(
                "Frita cebola e depois colocar os tomates até virarem molho. Acrescentar atum, creme de leite e adicionar pimenta.");
    }

    public void finaliza() {
        System.out.println("Mistura o molho com a massa");
    }
}

class Tea extends StarbucksCoffee {
    public void brew() {
        System.out.println("Preparando o cházinho! :-)");
    }

    public void addCondiments() {
        System.out.println("Adicionando um limãozinho no chá...");
    }
}

class Americano extends StarbucksCoffee {
    public void brew() {
        System.out.println("A máquina já está preparando seu americano! :p");
    }

    public void addCondiments() {
        System.out.println("Fechando seu copo..");
    }
}


class Test {
    public static void main(String [] args) {
        TunaPasta tunapasta = new TunaPasta();
        MassaCarbonara carbonara = new MassaCarbonara();

        Tea tea = new Tea();
        Americano coffee = new Americano();
        System.out.println("------------------------------------------------");
        System.out.println("PROCESSO DE PREPARO DO CHÁ");
        System.out.println("------------------------------------------------");
        tea.prepareRecipe();
        System.out.println("------------------------------------------------");
        System.out.println("PROCESSO DE PREPARO DO CAFÉ");
        System.out.println("------------------------------------------------");
        coffee.prepareRecipe();
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("PROCESSO DE PREPARO DO CARBONARA");
        System.out.println("------------------------------------------------");
        carbonara.preparaReceita(10);
        System.out.println("------------------------------------------------");
        System.out.println("PROCESSO DE PREPARO DA TUNAPASTA");
        System.out.println("------------------------------------------------");
        tunapasta.preparaReceita(10);
        System.out.println("------------------------------------------------");
    
    }
}