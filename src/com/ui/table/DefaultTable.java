package com.ui.table;

import javax.swing.*;
import java.awt.*;

public class DefaultTable extends JFrame {
    public DefaultTable(String title) throws HeadlessException {
        super(title);
    }

    public JTable createTable(String[][] data, String[] cols){
        var table = new JTable(data, cols);
        add(new JScrollPane(table));
        return table;
    }
}
