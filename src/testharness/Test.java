/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testharness;

import foodMood.control.App_Controller;
import foodMood.control.Food_Controller;
import foodMood.control.Login_Controller;

/**
 *
 * @author cmgoe
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Starting tests...");
        Login_Controller theLoginCntl = new Login_Controller();
        App_Controller mainCntl = theLoginCntl.requestAppControl();
        Food_Controller theFoodCntl = new Food_Controller(mainCntl);
        
        if(theLoginCntl.getUsers() == null)
            System.out.println("[TEST] FAILED: the users list is null");
        else
            System.out.println("[TEST] PASSED: UsersList successfully read in");
        
        if(theLoginCntl.getView() == null)
            System.out.println("[TEST] FAILED: view not instantiated");
        else
            System.out.println("[TEST] PASSED: login view instantiated");
           
        if(theLoginCntl.authenticate("user1", "pass1"))
            System.out.println("[TEST] PASSED: user authenticated");
        else
            System.out.println("[TEST] FAILED: user not authenticated properly");
        
        
        if(mainCntl == null)
            System.out.println("[TEST] FAILED: didn't correctly instantiate appController");
        else
            System.out.println("[TEST] PASSED: successfully moved controller to main appController");
        
        if(theFoodCntl ==null)
            System.out.println("[TEST] FAILED: didn't correctly instantiate Food Controller");
         else
            System.out.println("[TEST] PASSED: successfully moved controller to main food Controller");
            
    }
}
