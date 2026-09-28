package q1d;

public class Racer implements Runnable {
    private final int id;
    private final long espera;

    public Racer(int id, long espera) {
        this.id = id;
        this.espera = espera;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " - imprimindo");
            try {
                Thread.sleep(espera); // libera a CPU por 'espera' ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
