package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrapezoidArea extends JFrame {
    private JPanel rootPanel;
    private JPanel headPane;
    private JPanel bodyPane;
    private JPanel footPane;
    private JLabel title;
    private JLabel figure;
    private JLabel formula;
    private JTextField inputA;
    private JLabel labelA;
    private JTextField inputB;
    private JTextField inputH;
    private JLabel labelB;
    private JLabel labelH;
    private JButton result;
    private JTextField output;
    private JButton clean;
    private JButton exit;

    public TrapezoidArea() {
        super("Вычисление площади трапеции");
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,370,400);

        result.addActionListener(new ResultAction());
        clean.addActionListener(new CleanAction());
        exit.addActionListener(new ExitAction());
    }

    class ResultAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double a, b, h, s;
            a = Double.parseDouble(inputA.getText());
            b = Double.parseDouble(inputB.getText());
            h = Double.parseDouble(inputH.getText());
            s = (a + b) * h / 2;
            output.setText(Double.toString(s));
        }
    }

    class CleanAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputA.setText("");
            inputB.setText("");
            inputH.setText("");
            output.setText("");
        }
    }

    static class ExitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        TrapezoidArea form = new TrapezoidArea();
        form.setVisible(true);
    }
}
