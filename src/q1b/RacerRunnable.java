package q1b;

/**
 * Questão 1b - Forma 2: implementando a interface Runnable.
 */
public class RacerRunnable implements Runnable {
    private final int id;

    public RacerRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " - imprimindo");
        }
    }
}
