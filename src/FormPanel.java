import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel { // 类似导航栏 设置导航栏背景的长宽
        public FormPanel(){
            Dimension dimension = getPreferredSize();
            dimension.width = 250;
            setPreferredSize(dimension);

        }
}
