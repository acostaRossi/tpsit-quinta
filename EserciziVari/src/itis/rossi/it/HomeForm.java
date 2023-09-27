package itis.rossi.it;

import itis.rossi.it.es1.Es;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class HomeForm {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton esempio1Button;
    public HomeForm() {
        esempio1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Es().start();
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("HomeForm");
        frame.setContentPane(new HomeForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
