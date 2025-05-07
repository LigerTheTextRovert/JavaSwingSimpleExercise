import javax.swing.*;       // For Swing components like JFrame, JButton, JLabel, etc.
import java.awt.*;          // For layouts, colors, fonts, etc.
import java.awt.event.*;    // For handling events like button clicks

public class E1 extends JFrame implements ActionListener {
    private JLabel counterLabel;    // Displays the click count
    private JButton clickButton;    // Button to register clicks
    private int count = 0;          // Stores the current count

    public E1() {
        setTitle("Counter App");
        counterLabel = new JLabel("Click: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300, 200);
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        counterLabel.setText("Click :" + count);
    }

    public static void main (String[] args){
       SwingUtilities.invokeLater(E1::new);
    }
}