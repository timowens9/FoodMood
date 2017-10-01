/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodMood.control;

import foodMood.view.FoodMenu_View;
import foodMood.model.FoodList;

/**
 *
 * @author timothyowens
 */

public class Food_Controller {
    FoodMenu_View foodView;
    FoodList foodList;
    
    /**
    * Default constructor for the Food_Controller class
    */
    public Food_Controller() {
         System.out.println("Instantiated Food Controller");
         foodView = new FoodMenu_View();
         foodList = new FoodList();
    }
}




