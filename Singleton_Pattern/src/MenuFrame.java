import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame implements ActionListener {
    private JLabel titleLabel = new JLabel("  Welcome Page  ");
    private JButton openButton =new JButton("Open");
    private JButton exitButton =new JButton("Exit");
    private JPanel panel =new JPanel();

    public MenuFrame(String s){
        super(s);
        Container content=getContentPane();
        content.setLayout(new FlowLayout());
        Font f=new Font("TimesRoman", Font.BOLD,20);
        panel.setLayout(new GridLayout(1,2));
        titleLabel.setFont(f);  openButton.setFont(f);
        exitButton.setFont(f);
        content.add(titleLabel);
        panel.add(openButton); panel.add(exitButton);
        content.add(panel);
        openButton.addActionListener(this);   exitButton.addActionListener(this);
        setSize(210,200);    setVisible(true);}

    public void actionPerformed(ActionEvent e){

        Object target=e.getSource();
        if (target== openButton){
            ApplicationFrame f = ApplicationFrame.getInstance();
            f.setVisible(true);}

        if (target== exitButton){
            System.exit(0);}


    }
}
