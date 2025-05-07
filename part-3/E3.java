import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class E3 extends JFrame implements ActionListener {
    private JButton redBtn;
    private JButton blueBtn;
    private JButton greenBtn;
    private JPanel panel;

    public E3() {
        redBtn = new JButton("Change to red");
        blueBtn = new JButton("Change to blue");
        greenBtn = new JButton("Change to green");

        redBtn.setActionCommand("SetToRed");
        blueBtn.setActionCommand("SetToBlue");
        greenBtn.setActionCommand("SetToGreen");

        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(redBtn);
        buttonsPanel.add(blueBtn);
        buttonsPanel.add(greenBtn);

        panel = new JPanel(); // <-- Initialize the panel!

        setLayout(new BorderLayout());
        add(buttonsPanel, BorderLayout.NORTH);   // use BorderLayout constants
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "SetToRed":   panel.setBackground(Color.RED);   break;
            case "SetToGreen": panel.setBackground(Color.GREEN); break;
            case "SetToBlue":  panel.setBackground(Color.BLUE);  break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(E3::new);
    }
}
