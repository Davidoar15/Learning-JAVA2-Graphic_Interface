import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    
    private JMenuBar menuBar;
    private JMenu menuOptions, menuCalc, menuAbout, menuBGColor;
    private JMenuItem itemCalc, itemRed, itemBlack, itemPurple, itemCreator, itemOut, itemNew;
    private JLabel labelLogo, labelWelcome, labelTitle, labelName, labelLastName, labelMotherLastName, labelDepartment, labelAntiquity, labelResult, labelFooter;
    private JTextField textName, textLastName, textMotherLastName;
    private JComboBox<String> comboDepartment, comboAntiquity;
    private JScrollPane scrollPane; 
    private JTextArea textArea;

    public Principal() {
        setLayout(null);
        setTitle("Principal Screen");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/coca-cola-bottle.png")).getImage());

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 0, 0));
        setJMenuBar(menuBar);

        menuOptions = new JMenu("Options");
        menuOptions.setBackground(new Color(255, 0, 0));
        menuOptions.setFont(new Font("Andale Mono", 1, 14));
        menuOptions.setForeground(new Color(255, 255, 255));
        menuBar.add(menuOptions);

        menuCalc = new JMenu("Calculate");
        menuCalc.setBackground(new Color(255, 0, 0));
        menuCalc.setFont(new Font("Andale Mono", 1, 14));
        menuCalc.setForeground(new Color(255, 255, 255));
        menuBar.add(menuCalc);

        menuAbout = new JMenu("About");
        menuAbout.setBackground(new Color(255, 0, 0));
        menuAbout.setFont(new Font("Andale Mono", 1, 14));
        menuAbout.setForeground(new Color(255, 255, 255));
        menuBar.add(menuAbout);

        menuBGColor = new JMenu("Background Color");
        menuBGColor.setFont(new Font("Andale Mono", 1, 14));
        menuBGColor.setForeground(new Color(255, 0, 0));
        menuOptions.add(menuBGColor);

        itemCalc = new JMenuItem("Vacations");
        itemCalc.setFont(new Font("Andale Mono", 1, 14));
        itemCalc.setForeground(new Color(255, 0, 0));
        itemCalc.addActionListener(this);
        menuCalc.add(itemCalc);

        itemRed = new JMenuItem("Red");
        itemRed.setFont(new Font("Andale Mono", 1, 14));
        itemRed.setForeground(new Color(255, 0, 0));
        itemRed.addActionListener(this);
        menuBGColor.add(itemRed);

        itemBlack = new JMenuItem("Black");
        itemBlack.setFont(new Font("Andale Mono", 1, 14));
        itemBlack.setForeground(new Color(255, 0, 0));
        itemBlack.addActionListener(this);
        menuBGColor.add(itemBlack);

        itemPurple = new JMenuItem("Purple");
        itemPurple.setFont(new Font("Andale Mono", 1, 14));
        itemPurple.setForeground(new Color(255, 0, 0));
        itemPurple.addActionListener(this);
        menuBGColor.add(itemPurple);

        itemNew = new JMenuItem("New");
        itemNew.setFont(new Font("Andale Mono", 1, 14));
        itemNew.setForeground(new Color(255, 0, 0));
        itemNew.addActionListener(this);
        menuOptions.add(itemNew);

        itemCreator = new JMenuItem("The Creator");
        itemCreator.setFont(new Font("Andale Mono", 1, 14));
        itemCreator.setForeground(new Color(255, 0, 0));
        itemCreator.addActionListener(this);
        menuAbout.add(itemCreator);

        itemOut = new JMenuItem("Out");
        itemOut.setFont(new Font("Andale Mono", 1, 14));
        itemOut.setForeground(new Color(255, 0, 0));
        itemOut.addActionListener(this);
        menuOptions.add(itemOut);

        ImageIcon image = new ImageIcon("images/cocacola-letters.png");
        Image getImg = image.getImage();
        Image resizeImg = getImg.getScaledInstance(270, 100, Image.SCALE_SMOOTH);
        ImageIcon newImg = new ImageIcon(resizeImg);
        labelLogo = new JLabel(newImg);
        labelLogo.setBounds(20, 10, 270, 100);
        add(labelLogo);

        labelWelcome = new JLabel("WELCOME");
        labelWelcome.setBounds(360, 42, 300, 50);
        labelWelcome.setFont(new Font("Andale Mono", 1, 32));
        labelWelcome.setForeground(new Color(255, 255, 255));
        add(labelWelcome);

        labelTitle = new JLabel("Worker Data for Vacation Calculation");
        labelTitle.setBounds(25, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 1, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelName = new JLabel("Full Name:");
        labelName.setBounds(25, 188, 180, 25);
        labelName.setFont(new Font("Andale Mono", 1, 12));
        labelName.setForeground(new Color(255, 255, 255));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(25, 213, 150, 25);
        textName.setBackground(new Color(224, 224, 224));
        textName.setFont(new Font("Andale Mono", 1, 14));
        textName.setForeground(new Color(255, 0, 0));
        add(textName);

        labelLastName = new JLabel("Last Name:");
        labelLastName.setBounds(25, 248, 180, 25);
        labelLastName.setFont(new Font("Andale Mono", 1, 12));
        labelLastName.setForeground(new Color(255, 255, 255));
        add(labelLastName);

        textLastName = new JTextField();
        textLastName.setBounds(25, 273, 150, 25);
        textLastName.setBackground(new Color(224, 224, 224));
        textLastName.setFont(new Font("Andale Mono", 1, 14));
        textLastName.setForeground(new Color(255, 0, 0));
        add(textLastName);

        labelMotherLastName = new JLabel("Mother's last name:");
        labelMotherLastName.setBounds(25, 308, 180, 25);
        labelMotherLastName.setFont(new Font("Andale Mono", 1, 12));
        labelMotherLastName.setForeground(new Color(255, 255, 255));
        add(labelMotherLastName);

        textMotherLastName = new JTextField();
        textMotherLastName.setBounds(25, 334, 150, 25);
        textMotherLastName.setBackground(new Color(224, 224, 224));
        textMotherLastName.setFont(new Font("Andale Mono", 1, 14));
        textMotherLastName.setForeground(new Color(255, 0, 0));
        add(textMotherLastName);

        labelDepartment = new JLabel("Select Department:");
        labelDepartment.setBounds(220, 188, 180, 25);
        labelDepartment.setFont(new Font("Andale Mono", 1, 12));
        labelDepartment.setForeground(new Color(255, 255, 255));
        add(labelDepartment);

        comboDepartment = new JComboBox<String>();
        comboDepartment.setBounds(220, 213, 220, 25);
        comboDepartment.setBackground(new Color(224, 224, 224));
        comboDepartment.setFont(new Font("Andale Mono", 1, 14));
        comboDepartment.setForeground(new Color(255, 0, 0));
        comboDepartment.addItem("Please Select a Option");
        comboDepartment.addItem("Customer Support");
        comboDepartment.addItem("Logistics Department");
        comboDepartment.addItem("Management Department");
        add(comboDepartment);

        labelAntiquity = new JLabel("Select Antiquity:");
        labelAntiquity.setBounds(220, 248, 180, 25);
        labelAntiquity.setFont(new Font("Andale Mono", 1, 12));
        labelAntiquity.setForeground(new Color(255, 255, 255));
        add(labelAntiquity);

        comboAntiquity = new JComboBox<String>();
        comboAntiquity.setBounds(220, 273, 220, 25);
        comboAntiquity.setBackground(new Color(224, 224, 224));
        comboAntiquity.setFont(new Font("Andale Mono", 1, 14));
        comboAntiquity.setForeground(new Color(255, 0, 0));
        comboAntiquity.addItem("Please Select a Option");
        comboAntiquity.addItem("1 year of service");
        comboAntiquity.addItem("2 to 6 years of service");
        comboAntiquity.addItem("7 or more years of service");
        add(comboAntiquity);

        labelResult = new JLabel();
        labelResult.setBounds(220, 307, 180, 25);
        labelResult.setFont(new Font("Andale Mono", 1, 12));
        labelResult.setForeground(new Color(255, 255, 255));
        add(labelResult);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(new Color(224, 224, 224));
        textArea.setFont(new Font("Andale Mono", 1, 11));
        textArea.setForeground(new Color(255, 0, 0));
        textArea.setText("\n    Here appears the Result of the Vacation Calculation.");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(220, 333, 385, 90);
        add(scrollPane);

        labelFooter = new JLabel("© 2023 The Coca-Cola Company | All rights reserved");
        labelFooter.setBounds(155, 445, 500, 30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new Color(255, 255, 255));
        add(labelFooter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemCalc) {

        }
        if (e.getSource() == itemRed) {

        }
        if (e.getSource() == itemBlack) {

        }
        if (e.getSource() == itemPurple) {

        }
        if (e.getSource() == itemNew) {

        }
        if (e.getSource() == itemOut) {

        }
        if (e.getSource() == itemCreator) {

        }
    }

    public static void main(String args[]) {
        Principal windowPrincipal = new Principal();

        windowPrincipal.setBounds(0, 0, 640, 535);
        windowPrincipal.setVisible(true);
        windowPrincipal.setResizable(false);
        windowPrincipal.setLocationRelativeTo(null);
    }
}
