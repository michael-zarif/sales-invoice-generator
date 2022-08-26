import com.ui.window.MainWindow;

public class Main {
    public static void main(String[] args) {
        var window = new MainWindow("Sales Invoice Generator");
        window.createWindowComponents();
        window.createFileMenu();
        window.setPaneDimensions();
        window.createInvoicesTable();
        window.createWindowFrame();
    }
}