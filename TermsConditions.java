import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TermsConditions extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check;
    private JButton btn1, btn2;
    private JScrollPane scrollPane;
    private JTextArea textArea;

    String name = "";

    public TermsConditions() {
        setLayout(null);
        setTitle("License");
        setIconImage(new ImageIcon(getClass().getResource("images/coca-cola-bottle.png")).getImage());

        name = Welcome.name;

        label1 = new JLabel("TERMS & CONDITIONS");
        label1.setBounds(225, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textArea = new JTextArea();
        textArea.setEditable(false); // User can't change TextArea Content
        textArea.setFont(new Font("Andale Mono", 0, 9));
        textArea.setText("\n\n          TERMS & CONDITIONS" +
                         "\n\n            A. FORBIDDEN SALE OR DISTRIBUTION WITHOUT COMPANY AUTHORIZATION."+
                         "\n            B. FORBIDDEN ALTERATION OF CODE OR DESIGN."+
                         "\n            C. THE DEVELOPER IS NOT RESPONSIBLE FOR MISUSE OF THIS SOFTWARE."+
                         "\n\n          THE FOLLOWING LEGAL AGREEMENTS GOVERN YOUR USE OF THIS SOFTWARE."+
                         "\n          THE AUTHOR IS NOT LIABLE FOR THE USE YOU MAKE"+
                         "\n          OF THIS SOFTWARE AND ITS SERVICES. TO ACCEPT THESE TERMS, CLICK (I ACCEPT)."+
                         "\n          IF YOU DO NOT ACCEPT THESE TERMS, CLICK (I DO NOT ACCEPT) AND DO NOT USE THIS SOFTWARE."+
                         "\n\n          FOR MORE INFORMATION ABOUT PRODUCTS OR SERVICES, PLEASE VISIT:"+
                         "\n          https://github.com/Davidoar15");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(15, 40, 575, 200);
        add(scrollPane);

        check = new JCheckBox("I, "+name+", Accept");
        check.setBounds(10, 250, 300, 30);
        check.addChangeListener(this);
        add(check);

        btn1 = new JButton("Continue");
        btn1.setBounds(10, 290, 100, 30);
        btn1.setEnabled(false);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("I Not Accept");
        btn2.setBounds(120, 290, 110, 30);
        btn2.setEnabled(true);
        btn2.addActionListener(this);
        add(btn2);

        ImageIcon image = new ImageIcon("images/logo-coca-cola.png");
        Image getImg = image.getImage();
        Image resizeImg = getImg.getScaledInstance(290, 300, Image.SCALE_SMOOTH); // Adapt Image
        ImageIcon newImg = new ImageIcon(resizeImg);
        label2 = new JLabel(newImg);
        label2.setBounds(315, 140, 290, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e) {
        if (check.isSelected()) {
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        } else {
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            Principal windowPrincipal = new Principal();

            windowPrincipal.setBounds(0, 0, 640, 535);
            windowPrincipal.setVisible(true);
            windowPrincipal.setResizable(false);
            windowPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == btn2) {
            Welcome windowWelcome = new Welcome();

            windowWelcome.setBounds(0, 0, 365, 450);
            windowWelcome.setVisible(true);
            windowWelcome.setResizable(false);
            windowWelcome.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        TermsConditions windowLicense = new TermsConditions();
        
        windowLicense.setBounds(0, 0, 618, 380);
        windowLicense.setVisible(true);
        windowLicense.setResizable(false);
        windowLicense.setLocationRelativeTo(null);
    }
}