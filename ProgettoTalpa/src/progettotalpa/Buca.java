/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

import javax.swing.*;
import java.awt.*;

public class Buca extends JButton {
    private boolean occupata = false;

    public Buca() {
        this.setBackground(Color.GRAY); // Colore della buca vuota
        this.setText("Vuota"); // Temporaneo per test
    }

    public synchronized void mostraTalpa() {
        this.occupata = true;
        setIcon(new ImageIcon("immagineTalpa.webp"));
        this.setBackground(Color.RED); 
        this.setText("TALPA!"); 
    }

    public synchronized void nascondiTalpa() {
        this.occupata = false;
        this.setBackground(Color.GRAY);
        this.setText("Vuota");
    }
    
    public boolean isOccupata() {
        return occupata;
    }
}
