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
 */

public class Food_Controller {
    App_Controller appCtrl;
    FoodMenu_View foodView;
    FoodList foodList;
    
    /**
    * Default constructor for the Food_Controller class
     * Constructor takes in @param appCtrl to allow two-way communication between the controllers
    */
    public Food_Controller(App_Controller appCtrl) {
         this.appCtrl = appCtrl;
         System.out.println("Instantiated Food Controller");
         foodView = new FoodMenu_View();
         foodList = new FoodList();
    }
}




