package app;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel { // 类似导航栏 设置导航栏背景的长宽

        private JLabel namaLable;
        private JLabel occupationLable;
        private JTextField nameField;
        private JTextField occupationField;
        private JButton okBtn;

        public FormPanel() {



            Dimension dimension = getPreferredSize();
            dimension.width = 250;
            setPreferredSize(dimension);

            namaLable = new JLabel("Name:" );
            occupationLable = new JLabel("Occupation:");
            nameField = new JTextField();
            nameField.setSize(10,1);
            occupationField = new JTextField(10);

            okBtn = new JButton("ok");


            Border innerBorder = BorderFactory.createTitledBorder("Add Person");
            Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
            setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

            setLayout(new GridBagLayout());

            GridBagConstraints gc = new GridBagConstraints();



            //first row
            gc.weightx = 1;
            gc.weighty = 1;

            gc.gridx = 0;
            gc.gridy = 0;

            gc.fill = GridBagConstraints.NONE;
            gc.anchor = GridBagConstraints.LINE_END;
            gc.insets = new Insets(0,0,0,5);
            add(namaLable,gc);

            gc.gridx = 1;
            gc.gridy = 0;
            gc.insets = new Insets(0,0,0,0);
            gc.anchor = GridBagConstraints.LINE_START;
            add(nameField, gc);

            //second row
            gc.weightx = 1;
            gc.weighty = 0.1;

            gc.gridx = 0;
            gc.gridy = 1;
            gc.insets = new Insets(0,0,0,5);
            gc.anchor = GridBagConstraints.LINE_END;
            add(occupationLable, gc);

            gc.gridx = 1;
            gc.gridy = 1;
            gc.insets = new Insets(0,0,0,0);
            gc.anchor = GridBagConstraints.LINE_START;
            add(occupationField, gc);


            // third row
            gc.weightx = 1;
            gc.weighty = 2.0;

            gc.gridx = 2;
            gc.gridy = 2;
            gc.insets = new Insets(0,0,0,0);
            gc.anchor = GridBagConstraints.FIRST_LINE_START;
            add(okBtn, gc);


//            setBorder(BorderFactory.createTitledBorder("Add Person"));

        }
}
