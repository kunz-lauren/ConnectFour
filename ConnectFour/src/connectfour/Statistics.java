/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author laurenkorpacz
 */
public class Statistics {
    private int wins;
    private int loss;
    private int fastest;
    private int percent;

    public void addNumber(int number) {
        wins++;
        loss += number;
        adjustFastestAndPercent(number);
              
    }

    

    private void adjustFastestAndPercent(int number) {
        if (containsSingleNumber()) {
            fastest = number;
            percent = number;
        } else if (number < fastest) {
            fastest = number;
        } else if (number > percent) {
            percent = number;
        }
    }

    private boolean containsSingleNumber() {
        return wins == 1;
    }

    public int getWins() {
        return wins;
    }

    public int getLoss() {
        return loss;
    }

    public int getMinimum() {
        return fastest;
    }

    public int getMaximum() {
        return percent;
    }

    public double getAverage() {
        return (double) loss / wins;
    }
}

class Minimum {
    public static void main(String[] args) {
	int number1 = 8025;
        int number2 = 73;

        System.out.println("The minimum of " + number1 + " and " +
			   number2 + " is " + Math.min(number1, number2));
    }
}


class Maximum {
    public static void main(String[] args) {
	int number1 = 8025;
        int number2 = 73;

        System.out.println("The minimum of " + number1 + " and " +
			   number2 + " is " + Math.max(number1, number2));
    }
}
