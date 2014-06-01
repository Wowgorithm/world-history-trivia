/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;
import java.util.Random;

/**
 *
 * @author Lloyd
 */


public class NorthAmericaQuestion 
{
    
        String[] NAquestions= { "<html> Who was the first president of <br> the United States?</html>",
            
                                "<html> What year did the Vietnam War <br>begin?</html> ",
                                
                                "<html> The War of 1812 ended in 1814<br> with the signing of the what?</html> ",
                               
                                "<html> What happened on <br> April 12, 1861?</html>",
                                
                                "<html>What is the war of 1845 between the United States and Mexico called?</html>"
                
                                
                               };
       // String[] NAanswers= {"George Washington", "1959","Treaty of Ghent","Battle of Fort Sumter" };
        
        
        
       
    
        
        public String showQuestion()
        {
        
           Random rand= new Random();
          
            int questionIndex=0+ rand.nextInt(4);
           
              
                //questionIndex++;
                return NAquestions[questionIndex];
            
            
        
        }
        
        
        
    
}