package app;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {// 这是一个线程
            @Override
            public void run() {
//                JFrame frame = new JFrame("Hello World");
                new MainFrame();
            }
        });


    }
}
