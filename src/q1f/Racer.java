package q1f;

public class Racer implements Runnable {
    private final int id;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int volta = 1; volta <= 1000; volta++) {
            System.out.println("Racer " + id + " - imprimindo (" + volta + ")");
        }
        System.out.println(">>> Racer " + id + " terminou a corrida");
    }
}
