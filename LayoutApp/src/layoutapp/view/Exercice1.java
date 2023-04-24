
package layoutapp.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class Exercice1 {
    JFrame frame;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;

    public Exercice1() {
        
        frame = new JFrame("Multi Layout Excercise");
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setPreferredSize(new Dimension(200,200));
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
               
        p1.add(b1 );
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,3));
        p2.setPreferredSize(new Dimension(200,200));
        b6 = new JButton("Button 6");
        b7 = new JButton("Button 7");
        b8 = new JButton("Button 8");
        b9 = new JButton("Button 9");
        b10 = new JButton("Button 10");
               
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        
        
        p3 = new JPanel(new BorderLayout());
        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2, BorderLayout.SOUTH);
        frame.add(p3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    
}
