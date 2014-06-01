package Game;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lloyd
 */
public class SouthAmericaQuestion 
{
    
      String[] SAquestions= { "<html> What year did the Portuguese invade Brazil?</html>",
            
                                "<html> What are people of both Native American <br> and European ancestry called?</html> ",
                                
                                "<html> Who captured and murdered the Incan emperor? </html> ",
                               
                                "<html> Who overthrew the leader Salvador Allende in <br>Chile in a coup d'etat??</html>",
                                
                                "<html> He named the Pacific Ocean. His crew was <br>the first to sail all the way around the <br> world but he died halfway there.</html>",
                                
                                "<html>Which of these is a major river in South America? "
                                
                               };
     
        
        
        
       
    
        
        public String showQuestion()
        {
        
           // Random rand= new Random();
            Random rand= new Random();
            int spaceCount=0;
            int questionIndex=0+ rand.nextInt(5);
            
              
                //questionIndex++;
                return SAquestions[questionIndex];
            
            
        
        }
        
        
    
    
    
    
    
    
    
}
