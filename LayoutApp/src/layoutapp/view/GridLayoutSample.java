
package layoutapp.view;

import java.awt.GridLayout;
import javax.swing.*;


public class GridLayoutSample {
    JFrame frame;
    JPanel p;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    
    public GridLayoutSample() {
        frame = new JFrame("GridLayout Sample");
        p = new JPanel();
        p.setLayout(new GridLayout(2,3));
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        
        p.add(b1 );
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
        
    }
    
    
    
}
