package q1b;

/**
 * Questão 1b - Demonstra as duas formas de criação e instanciação.
 */
public class Main {
    public static void main(String[] args) {
        // Forma 1: a própria classe é uma Thread
        RacerThread r1 = new RacerThread(1);
        r1.start();

        // Forma 2: o Runnable é entregue a um objeto Thread
        Thread r2 = new Thread(new RacerRunnable(2));
        r2.start();
    }
}
