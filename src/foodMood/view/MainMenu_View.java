package foodMood.view;

import foodMood.model.User;

public class MainMenu_View 
{
    protected User loggedInUser;
    
    public MainMenu_View(User inputUser)
    {
        loggedInUser = inputUser;
    }
    
    public void initializeView() {
        //setup GUI
    }
    
    public User getLoggedInUser()
    {
        return this.loggedInUser;
    }
    
    public void setLoggedInUser(User inputUser)
    {
        this.loggedInUser = inputUser;
    }
    
    public void logout()
    {
        this.loggedInUser = null;
        //add code to return to login screen
    }

}
