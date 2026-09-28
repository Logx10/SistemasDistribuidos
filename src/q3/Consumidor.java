package q3;

/**
 * Questão 3a - Abordagem otimista (liveness first): se não conseguir retirar,
 * espera 200 ms e tenta novamente, até consumir as 20 caixas.
 */
public class Consumidor extends Thread {
    private static final int TOTAL = 20;
    private static final int ESPERA_NOVA_TENTATIVA = 200;
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
        try {
            for (int i = 1; i <= TOTAL; i++) {
                while (!deposito.retirar()) {
                    System.out.println(getName() + " encontrou o deposito vazio. Tentando de novo em "
                            + ESPERA_NOVA_TENTATIVA + " ms");
                    Thread.sleep(ESPERA_NOVA_TENTATIVA);
                }
                System.out.println(getName() + " retirou a caixa " + i
                        + " | itens no deposito: " + deposito.getNumItens());
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            return;
        }
        System.out.println(getName() + " terminou: consumiu " + TOTAL + " caixas");
    }
}
