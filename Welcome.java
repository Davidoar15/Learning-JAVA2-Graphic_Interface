import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener {
    
    private JTextField textField;
    private JLabel label1, label2, label3, label4;
    private JButton button;

    public Welcome() {
        setLayout(null);
        setTitle("WELCOME");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/coca-cola-bottle.png")).getImage());

        ImageIcon image = new ImageIcon("images/cocacola-letters.png");
        Image getImg = image.getImage();
        Image resizeImg = getImg.getScaledInstance(300, 100, Image.SCALE_SMOOTH); // Adapt Image
        ImageIcon newImg = new ImageIcon(resizeImg);
        label1 = new JLabel(newImg);
        label1.setBounds(30, 35, 300, 100);
        add(label1);

        label2 = new JLabel("Vacation Control System");
        label2.setBounds(65, 160, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Insert your Name");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("© 2023 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textField = new JTextField();
        textField.setBounds(45, 240, 255, 25);
        textField.setBackground(new Color(224, 224, 224));
        textField.setFont(new Font("Andale Mono", 1, 14));
        textField.setForeground(new Color(255, 0, 0));
        add(textField);

        button = new JButton("Enter");
        button.setBounds(125, 280, 100, 30);
        button.setBackground(new Color(255, 255, 255));
        button.setFont(new Font("Andale Mono", 1, 14));
        button.setForeground(new Color(255, 0, 0));
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

        }
    }

    public static void main(String args[]) {
        Welcome windowWelcome = new Welcome();

        windowWelcome.setBounds(0, 0, 365, 450);
        windowWelcome.setVisible(true);
        windowWelcome.setResizable(false);
        windowWelcome.setLocationRelativeTo(null);
    }
}