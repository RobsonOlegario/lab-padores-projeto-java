package one.digital.innovattion.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("movendo-se Defensivamente...");
    }
}
