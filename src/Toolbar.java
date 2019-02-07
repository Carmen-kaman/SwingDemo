import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private  JButton helloButton;
    private  JButton goodButton;

//    private TextPanel textPanel;
    private StringListener textListener;

    public Toolbar(){
        helloButton = new JButton("Hello");
        goodButton = new JButton("GoodBye");

        helloButton.addActionListener(this);
        goodButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodButton);
    }

//    public void setTextPanel (TextPanel textPanel){
//        this.textPanel = textPanel;
//    }
    public void setStringListener (StringListener listener){
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("A button has been clicked");
        JButton clicked = (JButton) e.getSource();

        if (clicked == helloButton){
            if (textListener != null){
                textListener.textEmitted("hello\n");
            }
//            System.out.println("hello");
//            textPanel.appendText("hello\n");
        }else if (clicked == goodButton){
            if (textListener != null){
                textListener.textEmitted("goodbye\n");
            }
//            System.out.println("goodbye");
//            textPanel.appendText("goodbye\n");
        }
    }
}
