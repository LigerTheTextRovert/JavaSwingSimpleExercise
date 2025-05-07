import javax.swing.*;       // For Swing components like JFrame, JButton, JLabel, etc.
import java.awt.*;          // For layouts, colors, fonts, etc.
import java.awt.event.*;    // For handling events like button clicks

class E4 extends JFrame implements ActionListener {
    private JTextField txtName;           // User name input
    private JTextField txtEmail;          // User email input
    private JPasswordField txtPassword;   // Password input
    private JRadioButton rbMale, rbFemale;  // Gender selection
    private JCheckBox cbJava, cbPython, cbCpp;  // Interests selection
    private JButton btnSubmit;            // Submit form button
    private GridBagConstraints gbc;       // Layout constraints

    public E4() {
        txtName = new JTextField(20);
        txtEmail = new JTextField(20);
        txtPassword = new JPasswordField(10);
        rbFemale = new JRadioButton("Female");
        rbMale = new JRadioButton("Male");
        cbCpp = new JCheckBox("C++");
        cbJava = new JCheckBox("Java");
        cbPython = new JCheckBox("Python");
        btnSubmit = new JButton("Submit Information");

        btnSubmit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setSize(400, 300);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        //First row : name
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        add(txtName, gbc);

        //Second row : email
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        add(txtEmail, gbc);

        //Third row : pass
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Pass:"), gbc);
        gbc.gridx = 1;
        add(txtPassword, gbc);

        //Fourth row : genders
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Genders:"), gbc);
        gbc.gridx = 1;
        JPanel genderRbPanel = new JPanel();
        genderRbPanel.add(rbMale);
        genderRbPanel.add(rbFemale);
        add(genderRbPanel, gbc);

        //Fifth row : interests
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        JPanel checkBoxsPanel = new JPanel();
        checkBoxsPanel.add(cbJava);
        checkBoxsPanel.add(cbPython);
        checkBoxsPanel.add(cbCpp);
        add(checkBoxsPanel, gbc);

        //Submit button
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(btnSubmit, gbc);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Unspecified";
        String interests = "";
        if (cbJava.isSelected()) interests += "Java ";
        if (cbPython.isSelected()) interests += "Python ";
        if (cbCpp.isSelected()) interests += "C++ ";

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Interests: " + interests,
                "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(E4::new);
    }
}
