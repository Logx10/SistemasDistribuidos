package q2c;

/**
 * Produz 100 caixas, esperando 'tempo' ms entre cada produção.
 */
public class Produtor extends Thread {
    private static final int TOTAL = 100;
    private final Deposito deposito;
    private final int tempo;

    public Produtor(Deposito deposito, int tempo) {
        super("Produtor");
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= TOTAL; i++) {
            deposito.colocar();
            System.out.println(getName() + " colocou a caixa " + i
                    + " | itens no deposito: " + deposito.getNumItens());
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println(getName() + " terminou: produziu " + TOTAL + " caixas");
    }
}
