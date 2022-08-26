package com.ui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create New Invoice" -> JOptionPane.showMessageDialog(null, e.getActionCommand());
            case "Delete Invoice" -> JOptionPane.showMessageDialog(null, e.getActionCommand());
            case "Save" -> JOptionPane.showMessageDialog(null, e.getActionCommand());
            case "Cancel" -> JOptionPane.showMessageDialog(null, e.getActionCommand());
        }
    }
}
