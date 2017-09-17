/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodMood.control;

import foodMood.view.LogIn_View;

public class App_Controller {
    Food_Controller foodControl;
    Mood_Controller moodControl;
    NewUser_Controller newUserControl;
    LogIn_View loginView;
    Boolean isLoggedIn;
    
    /**
     * Default constructor for the App_Controller class
     */
    public App_Controller() {
        loginView = new LogIn_View();
    }
    
    /**
    * Handles authentication for the login process
    * @param user The name of the user 
    * @param password The password associated with the user
    */
    public void authenticate(String user, String password) {
        //Code to handle authentication process
    }
}




