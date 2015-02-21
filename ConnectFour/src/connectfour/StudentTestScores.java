
package connectfour;

/**
 *
 * @author Tenille Diel
 */
public class StudentTestScores {
    int scores[] = {80, 75, 90, 75, 20, 50, 60, 40, 70, 75, 95, 80, 85, 85, 70, 60, 65, 70, 80, 65};
    int sum = 0;
    
    public int testScores() {
    for (int x : scores) {
        sum += x;  
    }
    int avgScore = sum / 20;
    return avgScore;
}
}
