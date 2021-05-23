package Chapter6._6_1_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {
        var listenr = new TimePrinter();

        var timer = new Timer(1000, listenr);
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit Program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
