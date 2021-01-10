package Learn_Java.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class buttondemo implements ActionListener {
    JLabel jlab;
    buttondemo () {
        JFrame jfrm = new JFrame("Buttons from Java");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnup = new JButton("Up");
        JButton jbtndn = new JButton("Down");
        jbtnup.addActionListener(this);
        jbtndn.addActionListener(this);
        jfrm.add(jbtnup);
        jfrm.add(jbtndn);

        jlab = new JLabel("Press a button");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Up")) {
            jlab.setText("You pressed Up.");
        }
        else {
            jlab.setText("You pressed Down.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new buttondemo();
            }
        });
    }
}