
package foodMood.control;

import foodMood.view.MoodMenu_View;
import foodMood.model.MoodList;

public class Mood_Controller {
   App_Controller appCtrl;
   MoodMenu_View moodView;
   MoodList moodList;
   
   /**
   * Default constructor for the Mood_Controller class
     * @param appCtrl
   */
   public Mood_Controller(App_Controller appCtrl) {
       this.appCtrl = appCtrl;
   }
   
   public void requestThisControl() {
       
   }
}
