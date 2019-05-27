package com.sergo.helloworld;

import javax.swing.JFrame;
import java.awt.*;

public class HelloIDEA extends JFrame{

    public HelloIDEA(){
        super("HelloIdeaApp!");
        setBounds(100,100,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        HelloIDEA appObj = new HelloIDEA();
        appObj.setVisible(true);
        System.out.println("Add a new string!");// write your code here
        System.out.println("And one more!");// write your code here
        DrawRectangle rect = new DrawRectangle(10, 20, 30, 40);
        appObj.add(rect);
    }
}
