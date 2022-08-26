package com.ui.window;

import com.ui.listener.DefaultListener;

import javax.swing.*;
import java.awt.*;

public class DefaultWindow extends JFrame {
    private JPanel contentPane = new JPanel();

    public DefaultWindow(String title) throws HeadlessException {
        super(title);
        setSize(500, 500);
        setLocation(300, 80);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Component createButton(String text){
        var btn = new JButton(text);
        btn.setActionCommand(text);
        var l = new DefaultListener();
        btn.addActionListener(l);
        return btn;
    }

    public Component createLabel(String text){
        var label = new JLabel(text);
        add(label);
        return label;
    }

    public Component createTextField(int length, String text){
        var textField = new JTextField(length);
        textField.setToolTipText(text);
        add(textField);
        return textField;
    }

    public Component[] createTextFieldWithLabel(int length, String text){
        var label = new JLabel(text);
        var textField = new JTextField(length);
        textField.setToolTipText(text);
        return new Component[] {label, textField};
    }

    public void createPasswordField(int length){
        var passwordField = new JPasswordField(length);
        add(passwordField);
    }
    
    public void createTextAreaWithLabel(String text, int rows, int cols){
        add(new JLabel());
        var textArea = new JTextArea(rows, cols);
        textArea.setToolTipText(text);
        add(new JScrollPane(textArea));
    }

    public void adjustScreen(){
        var grid = new GridLayout();
//        grid.setColumns(2);
        grid.setRows(2);
        grid.setHgap(10);
        grid.setVgap(10);
        setLayout(grid);

        var flow = new FlowLayout();
        flow.setAlignment(0);
        flow.setHgap(10);
        flow.setVgap(10);
//        setLayout(flow);
        //        setLayout(null);

        pack();
    }
}
