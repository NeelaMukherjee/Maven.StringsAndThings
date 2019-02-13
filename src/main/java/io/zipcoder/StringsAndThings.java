package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */


    public Integer countYZ(String input) {
        int count = 0;

        String[] word_split = input.split(" ");

        for (int i = 0; i < word_split.length; i++) {

            if (word_split[i].charAt(word_split[i].length() - 1) == 'y') {

                count++;

            } else if (word_split[i].charAt(word_split[i].length() - 1) == 'z') {

                count++;

            }
        }

        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        String new_string = base.replaceAll(remove, "");


        return new_string;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        Boolean bool = false;
        int countIs = 0;
        int countNot = 0;

        //int index1 =0;
        //int index2 =0;

        //int len =input.length();


        while (input.contains("is")) {

            input = input.replaceFirst("is", "");
            countIs++;
        }

        while (input.contains("not")) {

            input = input.replaceFirst("not", "");
            countNot++;
        }





        /*Pattern p = Pattern.compile("is");
        Matcher m = p.matcher(input);
        while(m.find()) {
            countIs++;
        }

        Pattern p1 = Pattern.compile("not");
        Matcher m1 = p1.matcher(input);

        while (m1.find()){
            countNot++;
        }*/



        if (countIs == countNot) {
            bool = true;


        }


        return bool;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        Boolean bool = false;

        char happyChar = 'g';
        int count = 0;



        for (int i = 1; i < input.length(); i++) {

            //char temp = input.charAt(i);

            if (input.charAt(i) == happyChar) {

                if ((input.charAt(i-1) == happyChar) || (input.charAt(i + 1) == happyChar)) {

                    bool = true;
                }

                else {

                    bool=false;
                }
            }

        }

        return bool;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count = 0;

        int len = input.length();
        String newString = input.toLowerCase();


        for (int i = 0; i < len-2; i++) {

            Character temp = newString.charAt(i);

            if (temp == newString.charAt(i + 1) && newString.charAt(i + 1)==newString.charAt(i + 2)) {


                count++;

            }



        }

        return count;

    }

}


