package JavaSwing.SwingProject;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        IDandPass info = new IDandPass(); // Instantiate ID and Pass class


        LoginPage page = new LoginPage(info.getLoginInfo()); // Instantiate of the Login page
        /* We are going to send our LoginInfo to our login page as an argument
           LoginPage is to receive a HashMap, to have a copy
        */

    }
}
