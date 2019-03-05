package sillyclick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class GameWindow extends JFrame {

    TextField firstText = new TextField(10);
    TextField secondText = new TextField(10);
    private int numFirstClicks = 0;
    private int numStoredCarrots = 0;

    public GameWindow(String newTitle, int newWidth, int newHeight) {
        setTitle(newTitle);
        setSize(newWidth, newHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        firstText.setBounds(70, 60, 100, 15);
        firstText.setText("0/10 carrots");

        secondText.setBounds(170, 160, 100, 15);
        secondText.setText("0 stored carrots");

        panel.setLayout(new FlowLayout());

        JButton firstButton = new JButton("Plant a Carrot");
        firstButton.setBounds(50, 60, 10, 30);
        firstButton.addActionListener(this::firstClick);

        panel.add(firstButton);
        panel.add(firstText);
        panel.add(secondText);
    }

    public void firstClick(ActionEvent e) {
        numFirstClicks++;

        if (numFirstClicks == 10) {
            firstText.setText(numFirstClicks + "/10 carrots");
            // wait x seconds
            numStoredCarrots += 10;
            secondText.setText(numStoredCarrots + " stored carrots");
            numFirstClicks = 0;
        }
        firstText.setText(numFirstClicks + "/10 carrots");
    }
}
