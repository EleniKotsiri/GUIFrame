package MyPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    public GUI() {
        frame = new JFrame();

        JButton button = new JButton("Click me!");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        // set borders and layout
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        // add button to panel
        panel.add(button);
        // add label to panel
        panel.add(label);

        // add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        // set what happens when they close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the title of window (frame)
        frame.setTitle("Our GUI");
        // set the window to match a certain size
        frame.pack();
        // set frame to be in focus
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks: " + count);
    }
}
