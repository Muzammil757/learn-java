package Learn_Java.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class textfielddemo implements ActionListener {
    JTextField jtf;
    JButton jbtn;
    JLabel jlabprompt, jlabcontents;

    textfielddemo() {
        JFrame jfrm =  new JFrame("Text Field from Java");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(280, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(10);
        jtf.setActionCommand("Enter here");
        JButton jbtn = new JButton("Reverse");
        jtf.addActionListener(this);
        jbtn.addActionListener(this);
        jlabprompt = new JLabel("Enter text: ");
        jlabcontents = new JLabel("");
        jfrm.add(jlabprompt);
        jfrm.add(jtf);
        jfrm.add(jbtn);
        jfrm.add(jlabcontents);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Reverse")) {
            String orgstr = jtf.getText();
            String resstr = "";
            for(int i = orgstr.length()-1; i >= 0; i--) {
                resstr += orgstr.charAt(i);
            }
            jtf.setText(resstr);
        }
        else {
            jlabcontents.setText("You pressed ENTER. Text is: " + jtf.getText());
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new textfielddemo();
            }
        });
    }
}