
package foodMood.view;

import foodMood.control.App_Controller;


public class MainMenu_View 
{
    App_Controller appCtrl;
    protected String loggedInUser;
    
    public MainMenu_View(App_Controller appCtrl)
    {
        this.appCtrl = appCtrl;
    }
    
    public void initializeView() {
        //setup GUI
    }
    
    public String getLoggedInUser()
    {
        return this.loggedInUser;
    }
    
    public void setLoggedInUser(String inputUser)
    {
        this.loggedInUser = inputUser;
    }
    
    public void logout()
    {
        this.loggedInUser = null;
        //add code to return to login screen
    }
    
    public void viewUserMoods()
    {
        //code to load the mood view
    }
    
    public void enterFoodMood()
    {
        //code to load the foodmenu view
    }
}
