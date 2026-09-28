package q1e;

/**
 * Questão 1e - Define prioridades diferentes para os racers.
 * Racer 10 recebe a prioridade máxima (10), Racer 1 a mínima (1)
 * e os demais recebem prioridade igual ao seu identificador.
 */
public class Race {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(new Racer(i));
            t.setPriority(i); // Thread.MIN_PRIORITY = 1 ... Thread.MAX_PRIORITY = 10
            t.start();
        }
    }
}
