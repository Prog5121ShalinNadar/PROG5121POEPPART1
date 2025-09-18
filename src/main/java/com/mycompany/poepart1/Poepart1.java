/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
 
    

public class Poepart1 {

    /**
     * @param args the command line arguments
     */
    static String name;
    static String surname;
    static String registeredUserName;
    static String registeredPassword;
    private static final Logger LOG = Logger.getLogger(Poepart1.class.getName());
  




    public static void main(String[] args) {


  String username = JOptionPane.showInputDialog(null, "Please enter your username( must be less than 5 characters & an underscore):", "Username", JOptionPane.QUESTION_MESSAGE);
  Login_Class.checkUserName(username);


  String PasswordComplexity = JOptionPane.showInputDialog(null, "Please enter your password (must contain  8 characters,a symbol, a capital):", "Password", JOptionPane.QUESTION_MESSAGE);
   Login_Class.checkPasswordComplexity(PasswordComplexity);


  String CellPhoneNumber = JOptionPane.showInputDialog(null, "Please enter your cell phone number(Start with +27):", "Number", JOptionPane.QUESTION_MESSAGE);
  Login_Class.checkCellPhoneNumber(CellPhoneNumber);


     String registrationResult = Login_Class.registerUser(username, PasswordComplexity,CellPhoneNumber);


      String enteredUsername = JOptionPane.showInputDialog(null, "Enter your username for login:", "Login", JOptionPane.QUESTION_MESSAGE);
      boolean loginSuccessful = Login_Class.loginUser(enteredUsername, registeredUserName);


     String returnLoginUser = JOptionPane.showInputDialog(null, "Enter username again to confirm login:", "Login Confirmation", JOptionPane.QUESTION_MESSAGE);
     String loginStatus = Login_Class.returnLoginStatus(enteredUsername, registeredUserName);


    }
}