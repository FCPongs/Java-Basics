package JavaSwing.SwingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//! We create the action listener interface
public class LoginPage implements ActionListener{

    //* FRAME */
    JFrame frame = new JFrame();

    //* LOGIN BUTTON */
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    //* TEXT/PASSWORD FIELD */
    JTextField userIDField = new JTextField();
    JPasswordField userPASSWORDField = new JPasswordField();
    
    //* LABEL FOR TEXT FIELD */
    JLabel userID = new JLabel("User ID:");
    JLabel userPASS = new JLabel("Password: ");

    //* Message FOR TEXT FIELD */
    JLabel message = new JLabel("");


    //! We want to create this hashMap to have a copy of the info
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    //! This will get the HASHMAP of IDandPass in the main class--via constructor
    LoginPage(HashMap<String,String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        //* SETTING THE SIZE OF THE ID AND PASSWORD LABEL */
        userID.setBounds(50, 100, 75, 25);
        userPASS.setBounds(50, 150, 75, 25);

        //* MESSAGE FOR THE USER */
        message.setBounds(125,250,260,35);
        message.setFont(new Font(null,Font.ITALIC,25));

        //todo: SETTING THE SIZE FOR THE TEXT FIELD
        userIDField.setBounds(125, 100, 200, 25);
        userPASSWORDField.setBounds(125, 150, 200, 25);

        //? SETTING THE SIZE OF THE BUTTON -- LOGIN
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);

        //? SETTING THE SIZE OF THE BUTTON -- RESET
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);

        //! FRAME */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        //! ADDING COMPONENTS TO THE FRAME */        
        frame.add(userID);
        frame.add(userPASS);

        frame.add(userIDField);
        frame.add(userPASSWORDField);

        frame.add(loginButton);
        frame.add(resetButton);

        frame.add(message);


    }
    //! We create the action listener interface

    @Override
    public void actionPerformed(ActionEvent e) {
        //* THIS IS FOR THE RESET BUTTON */
        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPASSWORDField.setText("");
        }
        //* THIS IS FOR THE LOGIN BUTTON */
        if(e.getSource()==loginButton){

        //! GET THE VALUES
            //? CREATE A STRING VARIABLE
            String userID = userIDField.getText();

            //? Retrieves the password that we type in and converts it to string
            String password = String.valueOf(userPASSWORDField.getPassword());

        //! We check the hashmap from IDandPass
            if(loginInfo.containsKey(userID)){ //! If hashmap contains userID (value)
                if(loginInfo.get(userID).equals(password)){
                    //! Will messages if correct
                    message.setForeground(Color.GREEN);
                    message.setText("Success!");
                    frame.dispose(); //*THIS WILL CLOSE THE LOGIN PAGE*/
                    //! Will send you to the WELCOMEPAGE
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                //! Triggers when user is correct but password is wrong
                else {
                    message.setForeground(Color.RED);
                    message.setText("WRONG PASSWORD");
                }
            
            }
            //! Triggers when user is not found
            else{
                message.setForeground(Color.RED);
                message.setText("User not found");
            } 

        }
    }

}
