
package foodMood.control;

import foodMood.model.UserList;
import foodMood.view.LoginView;

public class LoginController {
    private UserList theUsers;
    private LoginView loginUI;
    
    /**
    * Default constructor for the Mood_Controller class
    */
    public LoginController() {
        System.out.println("Instantiated LoginController");
        theUsers = new UserList();
        loginUI = new LoginView(this);
    }
    
    public UserList getUsers(){
        return theUsers;
    }
    
    
    
    /**
    * Handles authentication for the login process
    * @param user The name of the user 
    * @param password The password associated with the user
    */
    public boolean authenticate(String user, String password) {
        
        return theUsers.authenticate();
        //Code to handle authentication process
    }
    
    public void addNewUser(String user, String password){
        
    }
    
    //just for testing purposes
    public LoginView getView(){
        return loginUI;
    }
    
    //normally this would be void, returns appcontroller so it can be referenced from testharness
    public App_Controller requestAppControl (){
        App_Controller mainCntl = new App_Controller(this);
        return mainCntl;
    }
}
