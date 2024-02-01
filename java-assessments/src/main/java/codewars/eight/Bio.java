package codewars.eight;

//https://www.codewars.com/kata/5556282156230d0e5e000089

public class Bio {
    public String dnaToRna(String dna) {
        char[] chars = dna.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'T')
            {
                chars[i] = 'U';
            }
        }

        return new String(chars);  // Do your magic!
    }
}