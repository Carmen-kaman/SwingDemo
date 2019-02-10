package sampleMVC.controller;

import sampleMVC.model.model;
import sampleMVC.view.view;

public class drive {
    public static void main(String[] args) {

        model model = new model();
        controller controller = new controller(model);//controller 调用 model 方法
        view view = new view();

        view.addController(controller);// 将所有的鼠标监听时间都写在 controller；
        view.addModel(model);// view 需要获取 model 修改的数据；
        model.addObserver(view);// model 添加 view 作为监听者，model 是被监听；

    }
}
