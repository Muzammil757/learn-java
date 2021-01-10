package Learn_Java.Swing;

import javax.swing.*;

class swingtext {
    swingtext() {
        JFrame jfrm = new JFrame("Swing from Java");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Introducing  inUI     -  inIndex");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new swingtext();
            }
        });
    }
}