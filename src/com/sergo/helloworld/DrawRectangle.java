package com.sergo.helloworld;

import javax.swing.*;
import java.awt.*;

public class DrawRectangle extends JPanel {
    private Rectangle rect;

    public DrawRectangle() {
        rect = new Rectangle(10, 20, 30, 40);
    }

    public DrawRectangle(int x, int y, int w, int h) {
        rect = new Rectangle(x,y,w,h);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color c = new Color(255, 215, 150);
        g2.setColor(c);
        g2.draw(rect);
    }
}