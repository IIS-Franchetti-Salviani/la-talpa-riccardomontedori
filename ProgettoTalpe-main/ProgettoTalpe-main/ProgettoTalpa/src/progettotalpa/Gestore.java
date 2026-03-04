/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

import java.util.Random;

/**
 *
 * @author monte
 */
public class Gestore {
    private Talpa talpa;
    private Thread threadTalpa;
    private boolean attivo;
    private Random random;

    public Gestore() {
        talpa = new Talpa();
        random = new Random();
    }
    
    public void avvia() {
        attivo = true;

        threadTalpa = new Thread(() -> {
            while (attivo) {
                try {
                    Thread.sleep(1000 + random.nextInt(2000));
                    talpa.appare();
                    Thread.sleep(800);
                    talpa.scompare();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        threadTalpa.start();
    }

    public void ferma() {
        attivo = false;
    }

    public Talpa getTalpa() {
        return talpa;
    }
}
