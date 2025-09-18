/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

import org.junit.Test;

/**
 *
 * @author RC_Student_lab
 */


public class Login_ClassTest {

    public Login_ClassTest() {
    }

   
    public void testCheckUserName_True() {
        //WORKS!!!!!!
        //LoginClass LC = new LoginClass("Java Programming",2,0,3);

         //boolean condition = LB.isAvailable();

        // Assertions.assertTrue(condition);
       /* String userName = "kyl_1";
        boolean expected = true;
        boolean actual = LoginClass.checkUserName(userName);
        Assertions.assertEquals(expected, actual);*/
       boolean condition = Login_Class.checkUserName( "kyl_1");
        Assertions.assertTrue(condition);
    }

     
    public void testCheckUserName_False() {
        //WORKS!!!!!!
       /* String userName = "kyle";
        boolean expected = false;
        boolean actual = LoginClass.checkUserName(userName);
        Assertions.assertEquals(expected, actual);*/
        boolean condition = Login_Class.checkUserName("kyle!!!!!!");
        Assertions.assertFalse(condition);
    }


  @Test
public void testCheckPasswordComplexity_True() {
    /* String password = "Ch&&sec@ke99!";
    boolean expected = true;
    boolean actual = LoginClass.checkPasswordComplexity(password);
    Assertions.assertEquals(expected, actual); */
    boolean condition = Login_Class.checkPasswordComplexity("Ch&&sec@ke99!");
    Assertions.assertTrue(condition);
}


    @Test
    public void testCheckPasswordComplexity_False() {
        //WORKS!!!!!!
        /*String password = "ch&&sec@ke99!";
        boolean expected = false;
        boolean actual = LoginClass.checkPasswordComplexity(password);
        Assertions.assertEquals(expected, actual);*/
         boolean condition = Login_Class.checkPasswordComplexity("password");
        Assertions.assertFalse(condition);
    }

    @Test
    public void testCheckCellPhoneNumber_True() {
        //WORKS!!!!!!
       /* String number = "+27838968976";
        boolean expected = true;
        boolean actual = LoginClass.checkCellPhoneNumber(number);
        Assertions.assertEquals(expected, actual);*/
        boolean condition = Login_Class.checkCellPhoneNumber("+27838968976");
        Assertions.assertTrue(condition);
    }

    @Test
    public void testCheckCellPhoneNumber_False() {
        //WORKS!!!!!!
        /*String number = "08966553";
        boolean expected = false;
        boolean actual = LoginClass.checkCellPhoneNumber(number);
        Assertions.assertEquals(expected, actual);*/
       boolean condition = Login_Class.checkCellPhoneNumber("08966553");
        Assertions.assertFalse(condition);
    }



   @Test
public void testRegisterUser() {
    // Valid input
    String userName = "kyl_1";
    String password = "Ch&&sec@ke99!";
    String cellPhoneNumber = "+27838968976";

    String expected = "Success"; 
    String actual = Login_Class.registerUser(userName, password, cellPhoneNumber);

    Assertions.assertEquals(expected, actual);
}





    @Test
    public void testLoginUser_True() {
    String registeredUser = "kyl_1";
    String loginUser = "kyl_1";

    boolean expected = true;
    boolean actual = Login_Class.loginUser(loginUser, registeredUser);

    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLoginUser_False() {
    String registeredUser = "kyl_1";
    String loginUser = "kyle!!!!!!";

    boolean expected = false;
    boolean actual = Login_Class.loginUser(loginUser, registeredUser);

    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReturnLoginStatus() {
        //WORKS!!!!!!
       /* String password = "Ch&&sec@ke99!";
        String entered = "Ch&&sec@ke99!";
        String expected = "Welcome back!";
        String actual = LoginClass.returnLoginStatus(entered, password);
        Assertions.assertEquals(expected, actual);*/
       String loginUser = "kyl_1";
       String returnLoginUser = "kyl_1";

       String expected = "true";
       String actual = Login_Class.returnLoginStatus(returnLoginUser, loginUser); 
       Assertions.assertEquals(expected,actual);
    }

    private static class Assertions {

        private static void assertTrue(boolean condition) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void assertFalse(boolean condition) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void assertEquals(String expected, String actual) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void assertEquals(boolean expected, boolean actual) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Assertions() {
        }
    }

    }