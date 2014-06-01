package Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lloyd
 */
import java.util.*;

public class AustraliaQuestion
{
 
        //MAKE THIS AN INTERFACE AND IMPLEMENT IN EACH CONTINENT (FRAME) CLASS!!!!!!
      //MAY NEED ANONYMOUS CLASSES
        //NEVERMIND!!
        
      // public void showQuestion();
      // public boolean checkAnswer();
        
        
    
        
            //remember to change questions 
           String[] AusQuestions= { 
                                "<html>Who was the first Australian Prime Minister?</html>",//Edmund Barton
            
                                "<html>Near which Victorian beach did Harold Holt disappear in 1967? </html> ",//Cheviot 
                                
                                "<html>Which Australian Prime Minister managed a rock 'n' roll band in his youth?</html>",//Keating 
                               
                                "<html>Which was the last colony (later a state) to join the Federation? </html>",//Western Australia
                                
                                "<html>Where did the Commonwealth Parliament first sit? </html>",//Melbourne
                                
                                "<html>In which year was the Blue Ensign officially adopted as Australia's national flag?</html>"//1953
                                
                               };
       // String[] NAanswers= {"George Washington", "1959","Treaty of Ghent","Battle of Fort Sumter" };
        
        
        
       
    
        
        public String showQuestion()
        {
        
           // Random rand= new Random();
            Random rand= new Random();
            //int spaceCount=0;
            int questionIndex=0+ rand.nextInt(5);
                //questionIndex++;
                return AusQuestions[questionIndex];
            
            
        
        }
           
                
              
            
           
        
    
}
