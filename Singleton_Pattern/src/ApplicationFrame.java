import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame implements ActionListener {
    private final JLabel titleLabel = new JLabel("  Increment  Application  ");
    private final JLabel valueLabel = new JLabel("Value1 ");
    private final JTextField valueOuput = new JTextField("0", 8);
    private final JButton incrementButton = new JButton("Incr");
    private final JButton decrementButton = new JButton("Decr");
    private final JButton closeButton = new JButton("Close");
    private final JPanel jPanel = new JPanel();
    private static ApplicationFrame single;
    private static boolean created = false;

    private ApplicationFrame() {
        super("Stepper");
        single = this;
        created = true;
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font font = new Font("TimesRoman", Font.BOLD, 20);
        jPanel.setLayout(new GridLayout(2, 2));
        titleLabel.setFont(font);
        valueLabel.setFont(font);
        content.add(titleLabel);
        jPanel.add(valueLabel);
        jPanel.add(valueOuput);
        jPanel.add(incrementButton);
        jPanel.add(decrementButton);
        content.add(jPanel);
        content.add(closeButton);
        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);
        closeButton.addActionListener(this);
        setSize(210, 200);
    }

    public static ApplicationFrame getInstance(){
        if(!created){
            single = new ApplicationFrame();
        }
        return single;
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        if (target == incrementButton) {
            int value = Integer.parseInt(valueOuput.getText());
            value++;
            valueOuput.setText("" + value);
        }

        if (target == decrementButton) {
            int value = Integer.parseInt(valueOuput.getText());
            value--;
            valueOuput.setText("" + value);
        }

        if (target == closeButton) {
            this.setVisible(false);
        }


    }
}