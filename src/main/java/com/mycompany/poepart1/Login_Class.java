/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */

    

public class Login_Class {
       public static boolean checkUserName(String username) {
     if     ( username.contains("_") && username.length() <= 5){
            JOptionPane.showMessageDialog(null, "Username Successfully Captured!", "Username", JOptionPane.INFORMATION_MESSAGE);
    return true;       
  } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted. It must contain an underscore and be at most 5 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
   }return false;
}


     public static boolean checkPasswordComplexity(String PasswordComplexity) {
     if  (PasswordComplexity.length() >= 8 && PasswordComplexity.matches(".*\\d.*")
                && PasswordComplexity.matches(".*[!@#$%^&*()\\-+=<>?/].*")
                && PasswordComplexity.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null, "Password Successfully Captured!", "Password", JOptionPane.INFORMATION_MESSAGE);
   return true;
     } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted. It must contain at least 8 characters, a capital letter, a number, and a special character.", "Error", JOptionPane.ERROR_MESSAGE);
    return false;
        }}



     public static boolean checkCellPhoneNumber(String CellphoneNumber) {
     if  (CellphoneNumber.startsWith("+27") && CellphoneNumber.length() == 12)   {
          JOptionPane.showMessageDialog(null, "Cell phone number successfully added", "Number", JOptionPane.INFORMATION_MESSAGE);
     return true;
} else {
            JOptionPane.showMessageDialog(null, "Phone number format is incorrect. It must start with +27 and have exactly 12 digits.", "Error", JOptionPane.ERROR_MESSAGE);
   return false;
        }}




    /*  public static String registerUser(String userName, String password, String cellPhoneNumber) {
        if (checkUserName(userName) && checkPasswordComplexity(password) && checkCellPhoneNumber(cellPhoneNumber)) {

            JOptionPane.showMessageDialog(null, "User Registered Successfully", "Registered", JOptionPane.INFORMATION_MESSAGE);
            Login_Class.registeredUserName = userName;  // ✅ Updates the global one from Main class
            Login_Class.registeredPassword = password;

            return "Success"; // Return success message
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed. Please ensure that all details meet the required format!", "Error", JOptionPane.ERROR_MESSAGE);
            return "Failure"; // Return failure message
        }
       }*/



      public static String registerUser(String userName, String password, String cellPhoneNumber) {
    if (checkUserName(userName) && checkPasswordComplexity(password) && checkCellPhoneNumber(cellPhoneNumber)) {

        JOptionPane.showMessageDialog(null, "User Registered Successfully", "Registered", JOptionPane.INFORMATION_MESSAGE);

        // Update the global variables in the main class
        Poepart1.registeredUserName = userName;
        Poepart1.registeredPassword = password;

        return "Success";
    } else {
        JOptionPane.showMessageDialog(null, "Registration failed. Please ensure that all details meet the required format!", "Error", JOptionPane.ERROR_MESSAGE);
        return "Failure";
    }
}




        public static boolean loginUser(String loginUser, String registeredUser) {
        if  (loginUser.equals(registeredUser)) {
            String name = JOptionPane.showInputDialog(null, "Please enter your Name:", "Name", JOptionPane.QUESTION_MESSAGE);
            String surname = JOptionPane.showInputDialog(null, "Please enter your surname:", "Surname", JOptionPane.QUESTION_MESSAGE);

            JOptionPane.showMessageDialog(null, "Welcome " + name + " " + surname, "Welcome Message", JOptionPane.INFORMATION_MESSAGE);
  return true;
    } else {
            JOptionPane.showMessageDialog(null, "User not registered or incorrect username!", "Login Error", JOptionPane.ERROR_MESSAGE);
  return false;
        }
        }




   public static String returnLoginStatus(String returnLoginUser, String loginUser) {
       if (returnLoginUser != null && returnLoginUser.equals(loginUser)) {
           String name = null;
           String surname = null;
           JOptionPane.showMessageDialog(null, "Welcome " + name + " " + surname + ", it is great to see you again", "Login", JOptionPane.INFORMATION_MESSAGE);
      return "true";
       } else {
            JOptionPane.showMessageDialog(null, "Username or Password incorrect. Please try again.", "Login", JOptionPane.ERROR_MESSAGE);
       return "false";
       }}}