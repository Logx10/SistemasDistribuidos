package q2a;

/**
 * Consome 20 caixas, esperando 'tempo' ms entre cada consumo.
 */
public class Consumidor extends Thread {
    private static final int TOTAL = 20;
    private static int contador = 0;
    private final Deposito deposito;
    private final int tempo;

    public Consumidor(Deposito deposito, int tempo) {
        super("Consumidor " + (++contador));
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= TOTAL; i++) {
            deposito.retirar();
            System.out.println(getName() + " retirou a caixa " + i
                    + " | itens no deposito: " + deposito.getNumItens());
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println(getName() + " terminou: consumiu " + TOTAL + " caixas");
    }
}
