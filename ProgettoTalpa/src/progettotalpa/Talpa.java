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
}
