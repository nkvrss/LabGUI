package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Function extends JFrame{
    private JPanel rootPanel;
    private JPanel headPane;
    private JPanel bodyPane;
    private JPanel footPane;
    private JLabel taskLabel;
    private JLabel intervalLabel;
    private JLabel img;
    private JButton result;
    private JLabel xLabel;
    private JLabel yLabel;
    private JPanel argListPane;
    private JPanel funcListPane;
    private JTextArea xList;
    private JTextArea yList;

    public Function() {
        super("Табулирование функции");
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 600);

        result.addActionListener(new ResultAction());
    }

    class ResultAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String arguments, functions;
            arguments = "";
            functions = "";
            double x, y;
            x = -10;
            while (x <= 10) {
                if (x < -5) y = 2 / x;
                else if (x <= Math.abs(5)) y = x * x + 3 * x;
                else y = (x - 4) * (x - 4);
                arguments += x + "\n";
                functions += y + "\n";
                x++;
            }
            xList.setText(arguments);
            yList.setText(functions);
        }
    }

    public static void main(String[] args) {
        Function form = new Function();
        form.setVisible(true);
    }
}
