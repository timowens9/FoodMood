
package foodMood.view;
import foodMood.control.Food_Controller;
import foodMood.model.Food;
import foodMood.model.Mood;

public class FoodMenu_View 
{
    Food_Controller foodCtrl;
    protected Food food;
    protected Mood mood;
    
    public FoodMenu_View(Food_Controller foodCtrl)
    {
        this.foodCtrl = foodCtrl;
    }
    
    public void initializeView() {
        //setup GUI
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
