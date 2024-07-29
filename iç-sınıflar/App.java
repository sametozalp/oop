import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {

        // Anonymous classes

        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selam");
            }
        });
        t.start();
    }
}