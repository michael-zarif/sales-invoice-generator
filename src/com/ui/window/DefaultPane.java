package com.ui.window;

import javax.swing.*;
import java.awt.*;

public class DefaultPane extends JPanel{

    public DefaultPane(String title) {
        setBorder(BorderFactory.createTitledBorder(title));
    }

    public void setDimensions(int x, int y, int width, int height){
//        setLocation(x, y);
        setBounds(x, y, width, height);
        setPreferredSize(new Dimension(width, height));
    }
}
