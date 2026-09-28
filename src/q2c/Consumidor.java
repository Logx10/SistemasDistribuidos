package q2c;

/**
 * Faz 20 tentativas de consumo, esperando 'tempo' ms entre elas.
 * Se o depósito estiver vazio, a tentativa falha (abordagem safety first).
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
        int consumidas = 0;
        for (int i = 1; i <= TOTAL; i++) {
            if (deposito.retirar()) {
                consumidas++;
                System.out.println(getName() + " retirou uma caixa"
                        + " | itens no deposito: " + deposito.getNumItens());
            } else {
                System.out.println(getName() + " NAO conseguiu retirar: deposito vazio");
            }
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println(getName() + " terminou: consumiu " + consumidas + " de " + TOTAL + " caixas");
    }
}
