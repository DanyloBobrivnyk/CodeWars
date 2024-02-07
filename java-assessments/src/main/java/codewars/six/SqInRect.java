import java.util.List;
import java.util.ArrayList;
//https://www.codewars.com/kata/55466989aeecab5aac00003e/train/java
public class SqInRect {
    public static List<Integer> sqInRect(int lng, int wdth) {

        if(lng == wdth)
        {
            return null;
        }

        List<Integer> result = new ArrayList();
        int tilesCount = lng * wdth;

        for (; tilesCount > 0; )
        {
            int squareMaxVal = Math.min(lng, wdth);
            int tmp = (int)Math.pow(squareMaxVal, 2);

            tilesCount -= tmp;
            result.add(squareMaxVal);

            if (squareMaxVal == lng)
            {
                wdth -= lng;
            }
            else
            {
                lng -= wdth;
            }
            //squareMaxVal == lng ? wdth -= lng : lng -= wdth;
        }

        return result;
    }
}
