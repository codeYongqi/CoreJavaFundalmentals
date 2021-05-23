package Chapter6._6_3_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.ArrayList;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit the Program ?");
        System.exit(0);

    }
}

class TalkingClock{
    /**
     * Starts the clock
     * @param interval
     * @param beep
     */
    public void start(int interval, boolean beep){
        var listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is "
                + Instant.ofEpochMilli(e.getWhen()));
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        var timer = new Timer(1000, listener);
        timer.start();
    }
}
