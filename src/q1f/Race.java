package q1f;

import java.util.ArrayList;
import java.util.List;

/**
 * Questão 1f - Os carros pares só largam depois que todos os ímpares terminarem.
 */
public class Race {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> impares = new ArrayList<>();
        List<Thread> pares = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(new Racer(i));
            if (i % 2 != 0) impares.add(t); else pares.add(t);
        }

        System.out.println("=== Largada dos ímpares ===");
        for (Thread t : impares) t.start();

        // join: a thread main fica bloqueada até cada ímpar terminar
        for (Thread t : impares) t.join();

        System.out.println("=== Ímpares terminaram. Largada dos pares ===");
        for (Thread t : pares) t.start();
        for (Thread t : pares) t.join();

        System.out.println("=== Corrida encerrada ===");
    }
}
