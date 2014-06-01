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
public class AfricaQuestion 
{
    
     String[] AfricaQuestions= { "<html> When did the African island chain Cape Verde<br> achieve independence from Portugal?</html>",//1975
            
                                "<html>Who founded Timbuctu? </html> ",//touareg
                                
                                "<html>Which of these Egyptian rulers reigned the earliest? </html> ",//hatsheput
                               
                                "<html>The Berber are the indigenous people of what part of Africa?</html>",//northern
                                
                                "When was Kong obliterated?",//1895
                                
                                "<html>Which South African party introduced apartheid in 1948? </html>",//Nationalist Party
                                 
                                "<html>Which country was once known as British Basutoland?</html>",//Lesotho
                               
                                "<html>Which African National Congress leader <br>was awarded the Nobel Prize for Peace in 1960?</html> "//Albert Lutuli
                               };
       // String[] NAanswers= {"George Washington", "1959","Treaty of Ghent","Battle of Fort Sumter" };
        
        
        
       
    
        
        public String showQuestion()
        {
        
           // Random rand= new Random();
            Random rand= new Random();
            //int spaceCount=0;
            int questionIndex=0+ rand.nextInt(6);
            
              
                //questionIndex++;
                return AfricaQuestions[questionIndex];
            
            
        
        }
    
    
}
