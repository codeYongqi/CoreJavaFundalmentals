package Chapter6._6_2_2;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.util.*;

public class LambdaTest {
    public static void main(String[] args) {
        var planets = new String[]{"Mecrcury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));


        ArrayList array = new ArrayList();
        array.removeIf(e -> e == null);
        array.removeIf(Objects::isNull);
        // keep program running until user select "OK"
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
