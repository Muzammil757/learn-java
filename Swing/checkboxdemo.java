package Learn_Java.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class checkboxdemo implements ItemListener {
    JLabel jlabsel;
    JLabel jlabchang;
    JCheckBox jcbalpha;
    JCheckBox jcbbeta;
    JCheckBox jcbgamma;

    checkboxdemo() {
        JFrame jfrm = new JFrame("Check Box from Java");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabsel = new JLabel("");
        jlabchang = new JLabel("");

        jcbalpha = new JCheckBox("Alpha");
        jcbbeta = new JCheckBox("Beta");
        jcbgamma = new JCheckBox("Gamma");

        jcbalpha.addItemListener(this);
        jcbbeta.addItemListener(this);
        jcbgamma.addItemListener(this);

        jfrm.add(jcbalpha);
        jfrm.add(jcbbeta);
        jfrm.add(jcbgamma);
        jfrm.add(jlabchang);
        jfrm.add(jlabsel);

        jfrm.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        String str = "";
        JCheckBox cb = (JCheckBox) ie.getItem();
        if(cb.isSelected()) {
            jlabchang.setText(cb.getText() + " was just selected.");
        }
        else {
            jlabchang.setText(cb.getText() + " was just cleared.");
        }
        if(jcbalpha.isSelected()) {
            str += "Alpha ";
        }
        if(jcbbeta.isSelected()) {
            str += "Beta ";
        }
        if(jcbgamma.isSelected()) {
            str += "Gamma ";
        }
        jlabsel.setText("Selected check boxes: " + str);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new checkboxdemo();
            }
        });
    }
}