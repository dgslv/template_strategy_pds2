public abstract class PratoDeMassa {

    abstract void preparaIngredientes();

    abstract void preparaMolho();

    abstract void finaliza();

    private void aqueceAgua() {
        System.out.println("Aquecendo agua");
    }

    private void cozinhaMassa(int tempo) {
        System.out.println("Cozinhando massa: " + tempo + "minutos");
    }

    final void preparaReceita(int tempo) {
        aqueceAgua();
        cozinhaMassa(tempo);
        preparaIngredientes();
        preparaMolho();
        finaliza();
    }
}