package Learn_Java.Swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class listdemo implements ListSelectionListener {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;
    String names[] = {"Africa", "Australia", "Arab Emrites", "Brazil", "Indonesia", "India", "Mexico", "Newzealand", "Oman", "Pakistan", "Palestine", "Qattar", "Turkey", "United Kingdom", "United States", "Zimbabway"};

    listdemo() {
        JFrame jfrm = new JFrame("List from Java");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 220);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlst = new JList<String>(names);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(150, 150));
        jlab = new JLabel("Please choose a name");
        jlst.addListSelectionListener(this);
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public void valueChanged(ListSelectionEvent le) {
        int idx = jlst.getSelectedIndex();
        if(idx != -1) {
            jlab.setText("Current selection " + names[idx]);
        }
        else {
            jlab.setText("Please choose a name");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new listdemo();
            }
        });
    }
}