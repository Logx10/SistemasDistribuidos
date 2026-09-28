package q1b;

/**
 * Questão 1b - Forma 1: estendendo a classe Thread.
 */
public class RacerThread extends Thread {
    private final int id;

    public RacerThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " - imprimindo");
        }
    }
}
