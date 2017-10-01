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
    Login_Controller newUserControl;
    LogIn_View loginView;
    Boolean isLoggedIn;
    
    /**
     * Default constructor for the App_Controller class
     */
    public App_Controller() {
        System.out.println("Instantiated appController");
    }
    
}




