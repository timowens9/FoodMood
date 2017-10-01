package foodMood.view;

public class MainMenu_View 
{
    protected String loggedInUser;
    
    public MainMenu_View()
    {
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

}
