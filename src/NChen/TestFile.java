package NChen;

import static NChen.NChenLib.*;

public class TestFile {

    public static void main(String[] args){

        System.out.println("String Method 1 Returns (isPalindrome):");
        //testing string method 1
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("reviver"));
        System.out.println(isPalindrome("java"));

        System.out.println("\n\nString Method 2 Returns (cutOut):");
        //testing string method 2
        System.out.println(cutOut("I ate an apple.", "apple"));
        System.out.println(cutOut("Hello","He"));
        System.out.println(cutOut("Java is cool","Javascript"));

        System.out.println("\n\nMath Method 1 Returns (isFibonnaci):");
        //testing math method 1
        System.out.println(isFibonnaci(123));
        System.out.println(isFibonnaci(0));
        System.out.println(isFibonnaci(144));

        System.out.println("\n\nMath Method 2 Returns (sumUpTo):");
        //testing math method 2
        System.out.println(sumUpTo(6));
        System.out.println(sumUpTo(0));
        System.out.println(sumUpTo(10));

        System.out.println("\n\nAdditional Method Returns (dateStr):");
        //testing additional method
        System.out.println(dateStr("01/01/2001"));
        System.out.println(dateStr("01/02/3456"));
        System.out.println(dateStr("09/18/2018"));

        System.out.println("\n\nChallenge Method 1 Returns (vigCipher):");
        //testing challenge method 1
        System.out.println(vigCipher("test","test"));
    }
}
