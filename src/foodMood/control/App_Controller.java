/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodMood.control;

import foodMood.view.LoginView;

public class App_Controller {
    Food_Controller foodControl;
    Mood_Controller moodControl;
    LoginController loginCtrl;
    LoginView loginView;
    Boolean isLoggedIn;
    
    /**
     * Default constructor for the App_Controller class
     */
    public App_Controller(LoginController loginCtrl) {
        System.out.println("Instantiated appController");
        foodControl = new Food_Controller(this);
        moodControl = new Mood_Controller(this);
        this.loginCtrl = loginCtrl;
    }
    
    public Food_Controller requestFoodControl(){
        if(foodControl == null){
            foodControl = new Food_Controller(this);
        } else {
            foodControl.requestThisControl();
        }
        
        return foodControl;
    }
    
    public Mood_Controller requestMoodControl(){
        if(moodControl == null){
            moodControl = new Mood_Controller(this);
        } else {
            moodControl.requestThisControl();
        }
        
        return moodControl;
    }
    
}




