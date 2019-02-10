package sampleMVC.controller;

import sampleMVC.model.model;
import sampleMVC.view.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller implements ActionListener {

    public model model;

    public controller(model m){
        this.model = m;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        if (actionCommand.equalsIgnoreCase("set")) { //监听到鼠标点击按钮，调用相关的model 函数；

            System.out.println("before set name: " + model.name);

            System.out.println("click set button");

            model.setName(" seconde name");// 调用set函数；
        }

        }


}
