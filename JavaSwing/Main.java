package JavaSwing;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {
    public static void main(String[] args) {

        //todo: Part 1- JFRAME

        JFrame frame = new JFrame(); // Creates a frame

        frame.setTitle("This is your title"); // Where you will input your title
        frame.setSize(420, 420); // Sets the x and y dimension
        frame.getContentPane().setBackground(Color.BLACK); // Background color -- newColor(RGB)

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close when X is clicked
        frame.setResizable(false); // To stop resize

        frame.setVisible(true); // This makes the frame visible

        //! HOW TO CREATE AN ICON
        /*
         * ImageIcon image = new ImageIcon(); -- This creates an icon
         * frame.setIconImage(image.getImage()); -- This changes the icon of frame
         */


        //todo: Part 2- LABELS
        JLabel label = new JLabel(); // Create a LABEL

        label.setText("Bro, this is your text"); // Set text of label
        frame.add(label); //! We add the text to the frame

        ImageIcon cat = new ImageIcon("meow.jpg");
        label.setIcon(cat);// Add Icon on Label

        label.setHorizontalTextPosition(JLabel.CENTER); // Adjust text alignent
        label.setVerticalTextPosition(JLabel.TOP); // Adjust text alignent

        label.setForeground(Color.GREEN); // Change the color of text (COLOR.)
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//Change font style

        //todo: Part 3- PANEL
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0, 0, 250, 250);
        frame.add(panel); //! We add the panel to the frame
    }
}
