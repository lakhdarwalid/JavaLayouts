
package layoutapp.view;

import java.awt.BorderLayout;
import javax.swing.*;


public class BorderLayoutSample {
    JFrame frame;
    JPanel p;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;

    public BorderLayoutSample() {
        
        frame = new JFrame("BorderLayout Sample");
        p = new JPanel();
        p.setLayout(new BorderLayout());
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        
        p.add(b1,BorderLayout.NORTH );
        p.add(b2, BorderLayout.WEST);
        p.add(b3, BorderLayout.CENTER);
        p.add(b4, BorderLayout.EAST);
        p.add(b5, BorderLayout.SOUTH);
        
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
        
    }
    
    
}
