package com.sergo.helloworld;

import javax.swing.JFrame;

public class HelloIDEA extends JFrame{

    public HelloIDEA(){
        super("HelloIdeaApp!");
        setBounds(100,100,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
	    System.out.println("hello!");// write your code here
        HelloIDEA appObj = new HelloIDEA();
        appObj.setVisible(true);
        System.out.println("Add a new string!");// write your code here
    }
}
