//Nick Chen September 2018 Method Madness

package NChen;

public class NChenLib {

    /**String method 1 (does not take punctuations and spaces into consideration)
     * Checks if the str is a palindrome
     *
     * @param str
     * @return
     */
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

    /**String method 2
     * Cuts out a character from mainStr at the index of the subStr
     *
     * @param mainStr
     * @param subStr
     * @return
     */
    public static String cutOut(String mainStr, String subStr){

        //if the subStr isn't found in the mainStr, it returns the mainStr as it is
        if(!mainStr.contains(subStr)){
            return mainStr;
        }

        //looks for the index of the subStr, cuts out the character at the index, and concatenates the rest of the mainStr
        return mainStr.substring(0,mainStr.indexOf(subStr)) + mainStr.substring(mainStr.indexOf(subStr)+1);
    }

    /**Math method 1
     * Checks if num is part of the Fibonnaci sequence
     *
     * @param num
     * @return
     */
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

    /**Math method 2
     * Returns the sum of all values from 0 up to num
     *
     * @param num
     * @return
     */
    public static int sumUpTo(int num){
        int sum = 0;

        //adds sum by i, then increments i, repeats until i reaches num;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    /**Additional method
     * Returns the input mm/dd/yyyy as mm-dd-yyyy
     *
     * @param date
     * @return
     */
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

    /**String Challenge Method 1 (preserves space but not punctuations and other special characters)
     * Encrypts a message into a vigenere cipher using the key
     *
     * @param msg
     * @param key
     * @return
     */
    public static String vigCipher(String msg, String key){
        //turns everything into upper case for ASCII conversion
        String msgU = msg.toUpperCase();
        String keyU = key.toUpperCase();

        //declaring key index and an empty string for the deciphered word
        int keyIndex = 0;
        String decoded = new String("");

        int x,y,z = 0;
        for(int i=0;i<msgU.length();i++){

            //checks for space
            if(msgU.substring(i,i+1).equals(" ")){
                decoded += " ";
            } else {
                //resets the keyIndex if it reaches the end of the key
                if (keyIndex > keyU.length() - 1) {
                    keyIndex = 0;
                }

                //turns the character into their ASCII, subtract by 65 to get their alphabetical order
                x = (int) keyU.charAt(keyIndex) - 65;
                y = (int) msgU.charAt(i) - 65;
                z = x + y;

                //adds 65 back after decrypting, subtract by 26 if it goes over z to restart at a
                if (z > 26) {
                    z += 39;
                } else {
                    z += 65;
                }
                decoded += Character.toString((char) z);
                keyIndex++;
            }
        }
        return decoded;
    }

    /**String Challenge Method 2
     * Returns the number of unique letters shared by at least two of the inputs.
     *
     * @param word1
     * @param word2
     * @param word3
     * @return
     */
    public static int stringUnion(String word1, String word2, String word3){
        //turns everything to uppercase because method uses ASCII code to check for shared unique letters
        String Word1 = word1.toUpperCase();
        String Word2 = word2.toUpperCase();
        String Word3 = word3.toUpperCase();

        //count of unique letters shared
        int count = 0;

        //goes through the alphabet using ASCII code to see if it is shared by at least two of the words
        for(int i=65;i<90;i++){
            if(Word1.contains(Character.toString((char)i))){
                if(Word2.contains(Character.toString((char)i))||Word3.contains(Character.toString((char)i))){
                    count++;
                }
            } else {
                if(Word2.contains(Character.toString((char)i))&&Word3.contains(Character.toString((char)i))){
                    count++;
                }
            }
        }

        return count;
    }

    /**Math Challenge Method 1
     * Returns the roots of a quadratic equation given the inputs
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static String quadSolver(double a, double b, double c){
        //checks if the discriminant is negative (imaginary roots if negative)
        if(Math.pow(b,2)-4*a*c<0){
            return "Two Imaginary Roots: " + (-b/2*a) + " ± " + Math.sqrt(((b*b)-4*a*c)*-1) + "i";
        }
        //checks if the discriminant is 0 (only one root if 0)
        if(Math.pow(b,2)-4*a*c==0){
            return "One Real Root: " + (-b/2*a);
        }
        return "Two Real Roots: " + ((-b/2*a)+(Math.sqrt((b*b)-4*a*c)/(2*a))) + " and " + ((-b/2*a)-(Math.sqrt((b*b)-4*a*c)/(2*a)));
    }

    /**Math Challenge Method 2
     * Returns the least common multiple of the three num by using the LCM method twice
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int leastCommonMultiple(int num1, int num2, int num3){
        //uses the LCM method twice;
        return LCM(LCM(num1,num2),num3);
    }

    /**LCM
     * Checks for LCM
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int LCM(int num1, int num2){
        //looks for the smaller value for the for loop to initialize the i as
        int small;
        if(num1<num2){
            small = num1;
        } else {
            small = num2;
        }

        //finds GCD for the LCM equation
        int GCD = 1;
        for(int i=small;i>1;i--){
            if(num1%i==0&&num2%i==0){
                GCD = i;
                break;
            }
        }

        return (num1*num2)/GCD;
    }
}
