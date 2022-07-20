package com.obss.jss.day4.events;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClickListener extends Frame implements MouseListener {

    Label l;

    MouseClickListener(){
        addMouseListener(this);
        l = new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse is clicked");
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse is pressed");
        l.setText("Mouse is pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse is released");
        l.setText("Mouse is released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
        l.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
        l.setText("Mouse exited");
    }

    public static void main(String[] args) {
        new MouseClickListener();
    }
}
