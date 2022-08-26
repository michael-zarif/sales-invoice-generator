package com.ui.window;

import com.ui.menu.DefaultMenu;
import com.ui.table.DefaultTable;

public class MainWindow {
    private final DefaultWindow f;
    private DefaultMenu m;
    private DefaultPane leftPane;
    private DefaultPane rightPane;
    private DefaultPane lowerPane;
    private DefaultTable invoicesTable;
    private DefaultTable invoiceItems;
    public MainWindow(String title) {
        f = new DefaultWindow("Sales Invoice Generator");
        m = new DefaultMenu();
        leftPane = new DefaultPane("Invoices Table");
        rightPane = new DefaultPane("Invoice Data");
        lowerPane = new DefaultPane("");
        invoicesTable = new DefaultTable("Invoices Table");
        invoiceItems = new DefaultTable("Invoice Items");
    }

    public void createWindowFrame(){
        f.setSize(900, 700);
        f.setLocation(300, 80);
        f.setJMenuBar(m.menuBar);
        f.add(leftPane);
        f.add(rightPane);
        f.add(lowerPane);
        f.adjustScreen();
    }

    public void createWindowComponents(){
        rightPane.add(f.createTextFieldWithLabel(15, "Invoice Date")[0]);
        rightPane.add(f.createTextFieldWithLabel(15, "Invoice Date")[1]);
        rightPane.add(f.createTextFieldWithLabel(15, "Customer Name")[0]);
        rightPane.add(f.createTextFieldWithLabel(15, "Customer Name")[1]);
        lowerPane.add(f.createButton("Create New Invoice"));
        lowerPane.add(f.createButton("Delete Invoice"));
        lowerPane.add(f.createButton("Save"));
        lowerPane.add(f.createButton("Cancel"));
    }

    public void setPaneDimensions(){
        leftPane.setDimensions(0, 0, 400, 500);
        rightPane.setDimensions(800, 0, 400, 500);
        lowerPane.setDimensions(0,500, 1200, 100);
    }

    public void createFileMenu(){
        m.createSimpleMenu("File", new String[] {"Open", "Exit"});
    }

    public void createInvoicesTable(){
        String[] cols = {"No.", "Date", "Customer", "Total"};
        String[][] data = {
                {"1", "12/11/2008", "Mina", "300"},
                {"2", "12/11/2009", "Ahmed", "400"},
                {"3", "12/11/2010", "Omar", "500"},
        };
        leftPane.add(invoicesTable.createTable(data, cols));
    }
}
