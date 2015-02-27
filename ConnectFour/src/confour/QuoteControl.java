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

    public void displaySundayQuote() {
        System.out.println();
        displayQuoteBorder();     
        System.out.println( 
                 "\t'Brothers and sisters, as the literal spirit children of our "
                + "\n\tloving Heavenly Father, we have unlimited, divine potential.' "
                + "\n\n\t- M. Russell Ballard, 'This is My Work and Glory', Apr 2013 General Conference"
                ); 
        displayQuoteBorder();
    }

    public void displayMondayQuote() {
        System.out.println();
        displayQuoteBorder();     
        System.out.println( 
                "\t'Stresses in our lives come regardless of our circumstances. "
                + "\n\tWe must deal with them the best we can.  But we should not"
                + "\n\tlet them get in the way of what is most important - and "
                + "\n\twhat is most important almost always involves the people "
                + "\n\taround us.  Often we assume that they must know how much "
                + "\n\twe love them.  But we should never assume; we should let "
                + "\n\tknow.  Wrote William Shakespeare, 'They do not love that "
                + "\n\tdo not show their love.'  We will never regret the kind "
                + "\n\twords spoken or the affection shown.  Rather, our regrets "
                + "\n\twill come if such things are omitted from our relationships "
                + "\n\twith those who mean the most to us.'"
                + "\n\n\t- Thomas S Monson, 'Finding Joy in the Journey', Oct 2008 General Conference"
                ); 
        displayQuoteBorder();
    }
    
    public void displayTuesdayQuote() {
        System.out.println();
        displayQuoteBorder();             
        System.out.println( 
                "\t'A pebble held close to the eye appears to be a gigantic obstacle. "
                + "\n\tCast on the ground, it is seen in perspective. Likewise, "
                + "\n\tproblems or trials in our lives need to be viewed in the "
                + "\n\tperspective of scriptural doctrine. Otherwise they can "
                + "\n\teasily overtake our vision, absorb our energy, and deprive "
                + "\n\tus of the joy and beauty the Lord intends us to receive here "
                + "\n\ton earth. Some people are like rocks thrown into a sea of problems. "
                + "\n\tThey are drowned by them. Be a cork. When submerged in a problem, "
                + "\n\tfight to be free to bob up to serve again with happiness.' "
                + "\n\n\t- Richard G. Scott, 'Finding Joy in Life', Apr 1996 General Conference"
                );
        displayQuoteBorder();
    }
    
    public void displayWednesdayQuote() {
        System.out.println();
        displayQuoteBorder();     
        System.out.println( 
               "\t'Attempt to be creative for the joy it brings. … Select something "
                + "\n\tlike music, dance, sculpture, or poetry. Being creative "
                + "\n\twill help you enjoy life. It engenders a spirit of gratitude. "
                + "\n\tIt develops latent talent, sharpens your capacity to reason, "
                + "\n\tto act, and to find purpose in life. It dispels loneliness "
                + "\n\tand heartache. It gives a renewal, a spark of enthusiasm, "
                + "\n\tand zest for life.' "
                + "\n\n\t- Richard G. Scott, 'Finding Joy in Life', Apr 1996 General Conference"
                );
        displayQuoteBorder();
    }    
        
    public void displayThursdayQuote() {
        System.out.println();
        displayQuoteBorder();     
        System.out.println( 
               "\t'Work is something more than the final end result. It is a "
                + "\n\tdiscipline. We must learn to do, and do well, before we can "
                + "\n\texpect to receive tangible rewards for our labors. … Let "
                + "\n\tus also teach our children to see that the work assigned "
                + "\n\tis carried to its completion, to take pride in what they "
                + "\n\taccomplish. There is a real satisfaction that comes from "
                + "\n\tfinishing a task, especially when it is the best work we "
                + "\n\tknow how to do.'"
                + "\n\n\t- L. Tom Perry, 'The Joy of Honest Labor', Oct 1986 General Conference"
                ); 
        displayQuoteBorder();
    }
    
    public void displayFridayQuote() {
        System.out.println();
        displayQuoteBorder();     
        System.out.println( 
               "\t'Let us relish life as we live it, find joy in the journey, "
                + "\n\tand share our love with friends and family. One day each "
                + "\n\tof us will run out of tomorrows. …My sincere prayer is "
                + "\n\tthat we may adapt to the changes in our lives, that we "
                + "\n\tmay realize what is most important, that we may express "
                + "\n\tour gratitude always and thus find joy in the journey.'"
                + "\n\n\t- Thomas S. Monson, 'Finding Joy in the Journey', Oct 2008 General Conference"
                ); 
        displayQuoteBorder();
    }
    
    public void displaySaturdayQuote() {
        System.out.println();
        displayQuoteBorder();     
        System.out.println( 
               "\t'Day by day, minute by minute, second by second we went from "
                + "\n\twhere we were to where we are now. The lives of all of us, "
                + "\n\tof course, go through similar alterations and changes. "
                + "\n\tThe difference between the changes in my life and the "
                + "\n\tchanges in yours is only in the details. Time never stands "
                + "\n\tstill; it must steadily march on, and with the marching "
                + "\n\tcome the changes.' "
                + "\n\n\t- Thomas S. Monson, 'Finding Joy in the Journey', Oct 2008 General Conference"
                
                ); 
        displayQuoteBorder();
    }
    
    public void displayQuoteBorder() {       
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

