/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

/**
 *
 * @author monte
 */
public class Talpa {
    
    private boolean visibile;

    public Talpa() {
        this.visibile = false;
    }

    public synchronized void appare() {
        visibile = true;
    }

    public synchronized void scompare() {
        visibile = false;
    }

    public synchronized boolean isVisibile() {
        return visibile;
    }
}
