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
public class AsiaQuestion {
    
    
    
     String[] AsiaQuestions= { "<html>The highland border region where Laos, Thailand, and Burma meet is called... </html>",// the golden Triangle
            
                                "<html> Where did Bhuddism originate?</html> ",//india
                                
                                "<html> Which of the earth's extremes is located in Asia?</html> ",//largest continent, highest elevation, lowest elevation,and deepest lake
                               
                                "<html> What present day country was a part of the Persian Empire?</html>",//Tajikistan
                                 
                                "<html>In which Asian country can you find the Terracotta Army statues?</html",//China
                                
                                "<html>In which present day country did the kingdom of Assyria exist?</html>",//Iraq
                                
                                "<html>Who founded the Mongol Empire, which later became the largest<br> contiguous empire of the world?</html>",//Genghis Khan
             
                                "<html>In which Arabian city was Prophet Mohammad born? </html>",//Mecca
                                
                                "<html> Name the famous Persian king who founded the <br>Achaemenid Empire (the first Persian empire).</html>"//Cyrus the Great
             
                               };
       
        
        
       
    
        
        public String showQuestion()
        {
        
           // Random rand= new Random();
            Random rand= new Random();
            //int spaceCount=0;
            int questionIndex=0+ rand.nextInt(8);
            
              
                //questionIndex++;
                return AsiaQuestions[questionIndex];
            
            
        
        }
        
}
