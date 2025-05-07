import javax.swing.*;       // For Swing components like JFrame, JButton, JLabel, etc.
import java.awt.*;          // For layouts, colors, fonts, etc.
import java.awt.event.*;    // For handling events like button clicks

class E2 extends JFrame implements ActionListener {
    private JTextField textInput;
    private JButton button;
    private JLabel resultLabel;
    private JLabel inputLable;

    public E2() {
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        button = new JButton("Submit");
        resultLabel = new JLabel("Please Login", SwingConstants.CENTER);
        inputLable = new JLabel("Name");
        textInput = new JTextField(20);

        button.addActionListener(this);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inputPanel.add(inputLable);
        inputPanel.add(textInput);
        inputPanel.add(button);

        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String name = textInput.getText().trim();
        if (!name.isEmpty()) {
            resultLabel.setText("Hello, " + name + "!");
        } else {
            resultLabel.setText("Please enter your name first.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(E2::new);
    }
}