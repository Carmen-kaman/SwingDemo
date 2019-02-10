package sampleMVC.view;

import sampleMVC.controller.controller;
import sampleMVC.model.model;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class view extends JFrame implements Observer {

    private JPanel panel;
    private JButton button;
    public model m;

    public view() {


        super("Set Name");
        setSize(600,500);
        this.setLayout(new BorderLayout());
        panel = new JPanel();
        button = new JButton("set");
        panel.add(button);
        this.add(panel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) { // 获取到model 数据发生更新的消息；
            System.out.println("view receive information");
            System.out.println("this is model`s name："+ m.name);
            System.out.println("finish set name");
    }

    public void addController(controller c){
        System.out.println("controller is listener");
        this.button.addActionListener(c);// button 的监听放在了 controller
    }

    public void addModel(model m){
        this.m = m;
    }
}
