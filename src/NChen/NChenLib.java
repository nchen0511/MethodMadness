package NChen;

public class NChenLib {

    //String method 1 (does not take punctuations and spaces into consideration)
    public static boolean isPalindrome(String str){
        //creates an empty string
        String reverse = new String("");

        //reverses the original string and puts it into the empty string
        for(int i=str.length();i>0;i--){
            reverse+=str.substring(i-1,i);
        }

        //checks if the reversed string matches the original string
        return str.equals(reverse);
    }

    //String method 2
    public static String cutOut(String mainStr, String subStr){

        //if the subStr isn't found in the mainStr, it returns the mainStr as it is
        if(!mainStr.contains(subStr)){
            return mainStr;
        }

        //looks for the index of the subStr, cuts out the character at the index, and concatenates the rest of the mainStr
        return mainStr.substring(0,mainStr.indexOf(subStr)) + mainStr.substring(mainStr.indexOf(subStr)+1);
    }
}
