
package foodMood.view;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class LogIn_View 
{
    protected JLabel username_label;
    protected JLabel password_label;
    protected JTextField username_text;
    protected JTextField password_text;
    protected String username;
    protected String password;
    
    public LogIn_View()
    {
        initializeView();
    }
    
    private void initializeView()
    {
        username_label =  new JLabel("Username: ");
        password_label =  new JLabel("Password: ");
        username_text = new JTextField("");
        username_text = new JTextField("");
    }
    
    public String getUsername_Text()
    {
        return this.username_text.getText();
    }
    
    public String getPassword_Text()
    {
        //add encryption
        return this.password_text.getText();
    }
    
    public void setUsername_Text(String inputText)
    {
        this.username_text.setText(inputText);
    }
    
    public void setPassword_Text(String inputText)
    {
        this.password_text.setText(inputText);
    }
    
}
