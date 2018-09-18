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

    //Math method 1
    public static boolean isFibonnaci(int num){
        //(not sure if 0 counts, so included it)
        if(num==0){
            return true;
        }

        //adds i by itself each time until i reaches num or goes above it,  then returning true or false, respectively
        int i = 1;
        while(i<num){
            if(i==num){
                return true;
            }
            i+=i;
        }
        return false;
    }

    //Math method 2
    public static int sumUpTo(int num){
        int sum = 0;

        //adds sum by i, then increments i, repeats until i reaches num;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    //Additional method
    public static String dateStr(String date){
        //hard coded since we know the input format is always going to be dd-mm-yyyy, replaces "/" with "-"
        String newDate = new String("");
        for(int i=0;i<date.length();i++){
            if(date.substring(i,i+1).equals("/")){
                newDate += "-";
            } else {
                newDate += date.substring(i,i+1);
            }
        }
        return newDate;
    }

    //Challenge Method 1
    public static String vigCipher(String msg, String key){
        //turns everything into upper case to avoid errors
        String msgU = msg.toUpperCase();
        String keyU = key.toUpperCase();
       // create an array ascii = [];
        for(int i=0;i<key.length();i++){
            int ascii = (int)key.charAt(i);
            //figure out how to turn STRING into ASCII
        }
        //        return Character.toString((char)65);
    }
}
