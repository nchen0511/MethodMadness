package NChen;

import static NChen.NChenLib.cutOut;
import static NChen.NChenLib.isPalindrome;

public class TestFile {

    public static void main(String[] args){

        System.out.println("String Method 1 Returns:");
        //testing string method 1
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("reviver"));
        System.out.println(isPalindrome("java"));

        System.out.println("\n\nString Method 2 Returns:");
        //testing string method 2
        System.out.println(cutOut("I ate an apple.", "apple"));
        System.out.println(cutOut("Hello","He"));
        System.out.println(cutOut("Java is cool","Javascript"));
    }
}
