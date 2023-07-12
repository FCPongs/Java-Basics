package JavaSwing.Basics;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args) {
        ImageIcon cat = new ImageIcon("miyawk.png");

        JFrame frame = new JFrame(); // Creates a frame

        //todo: Label
        JLabel label = new JLabel();

        //todo: Part 1- JFRAME
        frame.setTitle("This is your title"); // Where you will input your title
        frame.setSize(750, 750); // Sets the x and y dimension
        frame.getContentPane().setBackground(Color.BLACK); // Background color -- newColor(RGB)

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will close when X is clicked
        frame.setResizable(false); // To stop resize

       
        frame.setLayout(null);
        frame.setVisible(true); // This makes the frame visible
        frame.add(label);


        //todo: Part 2- JPANEL
        //* RED PANEL */
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        frame.add(redPanel);

        //* BLUE PANEL */
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);

        frame.add(bluePanel);

         //* GREEN PANEL */
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);

        frame.add(greenPanel);


        //todo: Label
        label.setText("Hi");
        label.setIcon(cat);// Add Icon on Label
        
       
    }
}
