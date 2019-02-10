package sampleMVC.model;

import sampleMVC.view.view;

import java.util.Observable;

public class model extends Observable {

    public String name = new String(" first name");

    public void setName(String s){ //更新数据

        this.name = s;

        System.out.println("m name "+this.name);

        this.setChanged();
        this.notifyObservers( );// 通知view 数据发生更改；

    }
}
