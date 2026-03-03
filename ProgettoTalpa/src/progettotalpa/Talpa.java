/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

/**
 *
 * @author montedori.riccardo
 */
public class Talpa extends Thread {

    private Buca bucaAssociata;
    private boolean inEsecuzione = true;

    public Talpa(Buca buca) {
        this.bucaAssociata = buca;
    }

    @Override
    public void run() {
        while (inEsecuzione) {
            try {

                Thread.sleep((long) (Math.random() * 2000) + 1000);

                bucaAssociata.mostraTalpa();

                Thread.sleep((long) (Math.random() * 1000) + 500);

                bucaAssociata.nascondiTalpa();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void fermaTalpa() {
        this.inEsecuzione = false;
    }
}
