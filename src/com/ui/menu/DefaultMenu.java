package com.ui.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class DefaultMenu extends JFrame {

    public JMenuBar menuBar;

    public DefaultMenu() throws HeadlessException {
        menuBar = new JMenuBar();
    }

    public void createSimpleMenu(String menuName, String[] menuItemNames){
        var menu = new JMenu(menuName);
        menu.setMnemonic(menuName.charAt(0));
        for (String menuItemName: menuItemNames) {
            var menuItem = new JMenuItem(menuItemName, menuItemName.charAt(0));
            menuItem.setAccelerator(KeyStroke.getKeyStroke(menuItemName.charAt(0), KeyEvent.CTRL_DOWN_MASK));
            menu.add(menuItem);
        }
        menuBar.add(menu);
    }

}
