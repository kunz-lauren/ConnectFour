/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Tenille Diel
 */
public class QuoteControl {

    public String displaySundayQuote() {
         return "'Brothers and sisters, as the literal spirit children of our "
                + "loving Heavenly Father, we have unlimited, divine potential.' "
                + "\n- M. Russell Ballard, 'This is My Work and Glory', Apr 2013 General Conference"
                ; 
     
    }

    public String displayMondayQuote() {
        return  "'Stresses in our lives come regardless of our circumstances. "
                + "We must deal with them the best we can.  But we should not"
                + "let them get in the way of what is most important - and "
                + "what is most important almost always involves the people "
                + "around us.  Often we assume that they must know how much "
                + "we love them.  But we should never assume; we should let "
                + "know.  Wrote William Shakespeare, 'They do not love that "
                + "do not show their love.'  We will never regret the kind "
                + "words spoken or the affection shown.  Rather, our regrets "
                + "will come if such things are omitted from our relationships "
                + "with those who mean the most to us.'"
                + "\n- Thomas S Monson, 'Finding Joy in the Journey', Oct 2008 General Conference"
                ; 
        
    }
    
    public String displayTuesdayQuote() {
       return   "'A pebble held close to the eye appears to be a gigantic obstacle. "
                + "Cast on the ground, it is seen in perspective. Likewise, "
                + "problems or trials in our lives need to be viewed in the "
                + "perspective of scriptural doctrine. Otherwise they can "
                + "easily overtake our vision, absorb our energy, and deprive "
                + "us of the joy and beauty the Lord intends us to receive here "
                + "on earth. Some people are like rocks thrown into a sea of problems. "
                + "They are drowned by them. Be a cork. When submerged in a problem, "
                + "fight to be free to bob up to serve again with happiness.' "
                + "\n- Richard G. Scott, 'Finding Joy in Life', Apr 1996 General Conference"
                ;
        
    }
    
    public String displayWednesdayQuote() {
        return  "'Attempt to be creative for the joy it brings. … Select something "
                + "like music, dance, sculpture, or poetry. Being creative "
                + "will help you enjoy life. It engenders a spirit of gratitude. "
                + "It develops latent talent, sharpens your capacity to reason, "
                + "to act, and to find purpose in life. It dispels loneliness "
                + "and heartache. It gives a renewal, a spark of enthusiasm, "
                + "and zest for life.' "
                + "\n- Richard G. Scott, 'Finding Joy in Life', Apr 1996 General Conference"
                ;
       
    }    
        
    public String displayThursdayQuote() {
        return  "'Work is something more than the final end result. It is a "
                + "discipline. We must learn to do, and do well, before we can "
                + "expect to receive tangible rewards for our labors. … Let "
                + "us also teach our children to see that the work assigned "
                + "is carried to its completion, to take pride in what they "
                + "accomplish. There is a real satisfaction that comes from "
                + "finishing a task, especially when it is the best work we "
                + "know how to do.'"
                + "\n- L. Tom Perry, 'The Joy of Honest Labor', Oct 1986 General Conference"
                ; 
      
    }
    
    public String displayFridayQuote() {
        return  "'Let us relish life as we live it, find joy in the journey, "
                + "and share our love with friends and family. One day each "
                + "of us will run out of tomorrows. …My sincere prayer is "
                + "that we may adapt to the changes in our lives, that we "
                + "may realize what is most important, that we may express "
                + "our gratitude always and thus find joy in the journey.'"
                + "\n- Thomas S. Monson, 'Finding Joy in the Journey', Oct 2008 General Conference"
                ; 
        
    }
    
    public String displaySaturdayQuote() {
        return  "'Day by day, minute by minute, second by second we went from "
                + "where we were to where we are now. The lives of all of us, "
                + "of course, go through similar alterations and changes. "
                + "The difference between the changes in my life and the "
                + "changes in yours is only in the details. Time never stands "
                + "still; it must steadily march on, and with the marching "
                + "come the changes.' "
                + "\n- Thomas S. Monson, 'Finding Joy in the Journey', Oct 2008 General Conference"
                
                ; 
        
    }
    
    private void displayQuoteBorder() {       
        System.out.println(
        "\t#####################################################################################");
    }

    public void displayError() {       
        System.out.println();
        displayQuoteBorder();                     
        System.out.println("\tThat is an invalid selection. Please choose again.");
        displayQuoteBorder();             
    }
}

