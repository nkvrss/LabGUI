package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame{
    private JPanel rootPanel;
    private JTextField name;
    private JLabel labelName;
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JPanel headPane;
    private JPanel bodyPane;
    private JPanel footPane;
    private JLabel question;
    private JButton testing;
    private JButton exit;

    public Test() {
        super("Тестирование");
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100, 350, 220);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        radio1.setSelected(true);

        testing.addActionListener(new TestingAction());
        exit.addActionListener(new ExitAction());
    }

    class TestingAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text, result;
            if (radio2.isSelected())
                result = ", ответ верный!";
            else
                result = ", ответ неверный!";
            text = name.getText() + result;
            JOptionPane.showMessageDialog(null, text, "Тестирование", JOptionPane.PLAIN_MESSAGE);
        }
    }

    class ExitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Test form = new Test();
        form.setVisible(true);
    }
}
