package q1e;

public class Racer implements Runnable {
    private final int id;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " - imprimindo");
        }
    }
}
