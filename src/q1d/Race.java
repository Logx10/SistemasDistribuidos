package q1d;

/**
 * Questão 1d - Racers com tempo de espera (sleep) de 100 ms.
 */
public class Race {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Racer(i, 100)).start();
        }
    }
}
