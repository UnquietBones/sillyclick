package sillyclick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class GameWindow extends JFrame {

    private int numFirstClicks = 0;
    private int numSecondClicks = 0;
    TextField firstText = new TextField(10);
    TextField secondText = new TextField(10);

    public GameWindow(String newTitle, int newWidth, int newHeight) {
        setTitle(newTitle);
        setSize(newWidth, newHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        firstText.setBounds(70, 60, 100, 15);
        secondText.setBounds(70, 120, 100, 15);

        panel.setLayout(new FlowLayout());

        JButton firstButton = new JButton("Click Me");
        firstButton.setBounds(50, 60, 10, 30);
        firstButton.addActionListener(this::firstClick);

        JButton secondButton = new JButton("Click Me");
        secondButton.setBounds(50, 120, 10, 30);
        secondButton.addActionListener(this::secondClick);

        panel.add(firstButton);
        panel.add(firstText);
        panel.add(secondButton);
        panel.add(secondText);
    }

    public void firstClick(ActionEvent e) {
        numFirstClicks++;
        firstText.setText("Clicks " + numFirstClicks);
    }

    public void secondClick(ActionEvent e) {
        numSecondClicks++;
        secondText.setText("Clicks " + numSecondClicks);
    }

}
