
package foodMood.view;
import foodMood.model.Mood;
import java.util.ArrayList;

public class MoodMenu_View 
{
    protected Mood mood;
    protected ArrayList<Mood> moodList;
    
    public MoodMenu_View()
    {
    }
    
    public void initializeView() {
        //setup GUI
    }
    
    public void addNewMood(Mood newMood)
    {
        this.moodList.add(newMood);
        //controller export moodList for user to repository
    }
    
    public void setMood(Mood inputMood)
    {
        this.mood = inputMood;
    }
    
    public Mood getMood()
    {
        return this.mood;
    }
    
    public ArrayList getMoodList()
    {
        return this.moodList;
    }
}
