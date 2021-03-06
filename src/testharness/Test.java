/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testharness;

import foodMood.control.App_Controller;
import foodMood.control.Food_Controller;
import foodMood.control.LoginController;
import foodMood.control.Mood_Controller;

/**
 *
 * @author cmgoe
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Starting tests...");
        LoginController theLoginCntl = new LoginController();
        
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
        
        App_Controller mainCntl = theLoginCntl.requestAppControl();
        
        if(mainCntl == null)
            System.out.println("[TEST] FAILED: didn't correctly instantiate appController");
        else
            System.out.println("[TEST] PASSED: successfully moved controller to main appController");
        
        
        Food_Controller theFoodCntl = mainCntl.requestFoodControl();
        
        if(theFoodCntl ==null)
            System.out.println("[TEST] FAILED: didn't correctly instantiate Food Controller");
         else
            System.out.println("[TEST] PASSED: successfully moved controller to main food Controller");
        
        Mood_Controller theMoodCntl = mainCntl.requestMoodControl();
        
        if(theMoodCntl == null)
            System.out.println("[TEST] FAILED: didnt correctly instatiate Mood Controller");
        else 
            System.out.println("[TEST] PASSED: successfully moved control to mood controller");
            
    }
}
