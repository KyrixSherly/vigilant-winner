package com.sd.game;

import java.awt.*;
import javax.swing.*;

public class DiceGUI extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.drawString("Dice Roller", 70, 20);
    }
}