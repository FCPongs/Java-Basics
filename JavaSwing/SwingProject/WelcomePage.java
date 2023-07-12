package JavaSwing.SwingProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome!");

    WelcomePage(String userID){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);


        welcomeLabel.setBounds(0, 0, 260, 35);
        welcomeLabel.setText("Hello! "+userID);
        welcomeLabel.setFont(new Font(null,Font.ITALIC,25));
        welcomeLabel.setForeground(Color.BLUE);
        
        
        frame.add(welcomeLabel);

        frame.setVisible(true);
    }
}
