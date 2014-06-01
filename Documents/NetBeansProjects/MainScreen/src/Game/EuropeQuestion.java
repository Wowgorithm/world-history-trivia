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
public class EuropeQuestion 
{
    String[] EUquestions= { "<html>The government that replaced Napoleon was a(n)...</html>",//constitutional monarchy
            
                                "<html>The Peace of Westphalia did what?</html> ",//marked the end of the Thirty Years War
                                
                                "<html>The defeat of the Spanish Armada <br> resulted in all of the following EXCEPT_______ </html> ",//encouragement for Catholics across Europe
                               
                                "<html> The greatest flaw in Columbus's plan to reach Asia <br> by sailing west was...</html>",//underestimated the earth's circumfrence
                                
                                "<html> The Edict of Nantes allows for what? </html>",//granting religious toleration to the French Huguenots
                                
                                "<html>Among the food plants the Europeans brought back from the<br> Americas, the most immediately beneficial to humans was</html> "//the potato
                                
                               };
     
        
        
        
       
    
        
        public String showQuestion()
        {
        
           // Random rand= new Random();
            Random rand= new Random();
            int spaceCount=0;
            int questionIndex=0+ rand.nextInt(5);
            
              
                //questionIndex++;
                return EUquestions[questionIndex];
            
            
        
        }
    
    
    
    
}
