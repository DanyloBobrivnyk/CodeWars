package codewars.five;
//https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
public class Greed{
    public static int greedy(int[] dice){
        int res = 0;
        int[] tmp = new int[7];

        for(int value : dice) {
            tmp[value]++;
        }

        for (int i = 1; i < tmp.length; i++)
        {
            int multiplier = i == 1 ? 1000 : i * 100;
            res += tmp[i] / 3 * multiplier;
        }

        res += tmp[1] % 3 * 100;
        res += tmp[5] % 3 * 50;

        return res;
    }
}

/**
 * Three 1's => 1000 points
 *  Three 6's =>  600 points
 *  Three 5's =>  500 points
 *  Three 4's =>  400 points
 *  Three 3's =>  300 points
 *  Three 2's =>  200 points
 *  One   1   =>  100 points
 *  One   5   =>   50 point
 */