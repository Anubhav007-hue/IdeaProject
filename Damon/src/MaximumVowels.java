import java.util.HashSet;
import java.util.Set;



public class MaximumVowels {
    
    public static void main(String [] args )
    {
        String str="abciiidef";
        System.out.print(maxVowels(str,3));
    }

    public  static int maxVowels(String s, int k) {
        int maxCount = Integer.MIN_VALUE;
        int left = 0, right = 0, windowCount = 0;
        for(; right < s.length(); right++){
            windowCount += (isVowel(s.charAt(right))) ? 1 : 0;
            if(right - left + 1 == k){
                maxCount = Math.max(maxCount, windowCount);
                windowCount -= (isVowel(s.charAt(left++))) ? 1 : 0;
            }
        }
        return maxCount;
    }

    public static  boolean isVowel(char character){
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            return true;
        }
        return false;
    }
}
