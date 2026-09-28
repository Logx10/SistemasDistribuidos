package q1c;

/**
 * Questão 1c - Cria e inicia 10 racers (1 a 10).
 */
public class Race {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Racer(i)).start();
        }
    }
}
