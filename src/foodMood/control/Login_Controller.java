
package foodMood.control;

import foodMood.model.UserList;
import foodMood.view.LogIn_View;

public class Login_Controller {
    private UserList theUsers;
    private LogIn_View loginUI;
    
    /**
    * Default constructor for the Mood_Controller class
    */
    public Login_Controller() {
        System.out.println("Instantiated LoginController");
        theUsers = new UserList();
        loginUI = new LogIn_View(this);
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
    public LogIn_View getView(){
        return loginUI;
    }
    
    //normally this would be void, returns appcontroller so it can be referenced from testharness
    public App_Controller requestAppControl (){
        App_Controller mainCntl = new App_Controller(this);
        return mainCntl;
    }
}
