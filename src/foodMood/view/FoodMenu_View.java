
package foodMood.view;
import foodMood.model.Food;
import foodMood.model.Mood;

public class FoodMenu_View 
{
    protected Food food;
    protected Mood mood;
    
    public FoodMenu_View()
    {
        
    }
    
    public Food getFood()
    {
        return this.food;
    }
    
    public Mood getMood()
    {
        return this.mood;
    }
    
    public void setFood(Food inputFood)
    {
        this.food = inputFood;
    }
    
    public void setMood(Mood inputMood)
    {
        this.mood = inputMood;
    }
    
    public void exportFoodMood()
    {
        //code to tell the controller to export food/mood/timestamp to repository
    }
    
}
