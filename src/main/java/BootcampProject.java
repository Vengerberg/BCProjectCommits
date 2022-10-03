import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BootcampProject {
    public static void main(String[] args) {

        // test cases for 0
        System.out.println("Problem 0 test cases: ");
        System.out.println("1 into {} -> " + Arrays.toString(inputArray(new int []{},1)));
        System.out.println("1 into {1, 1} -> " + Arrays.toString(inputArray(new int []{1,1},1)));
        System.out.println("1 into {-1} -> " + Arrays.toString(inputArray(new int []{-1},1)));
        System.out.println("\"hello\" into {} -> " + Arrays.toString(inputArray(new String []{},"hello")));
        System.out.println("\"\" into {} -> " + Arrays.toString(inputArray(new String []{},"")));
        System.out.println("\"hi\" into {\"hi\"} -> " + Arrays.toString(inputArray(new String []{"hi"},"hi")));
        System.out.println("'1' into {} -> " + Arrays.toString(inputArray(new char []{},'1')));
        System.out.println("'1' into {'1', '1'} -> " + Arrays.toString(inputArray(new char []{'1','1'},'1')));
        System.out.println("'1' into {'H'} -> " + Arrays.toString(inputArray(new char []{'H'},'1')));

        // test cases for 1
        System.out.println("Problem 1 test cases: ");
        System.out.println("1234 -> " + SumOf(1234));
        System.out.println("0 -> " + SumOf(0));
        System.out.println("9 -> " + SumOf(9));
        System.out.println("99999 -> " + SumOf(99999));
        System.out.println("22 -> " + SumOf(22));

        //test cases for 2
        System.out.println("Problem 2 test cases: ");
        System.out.println("25 exp of 5 -> " + NumExp(25,5));
        System.out.println("30 exp of 6 -> " + NumExp(30,6));
        System.out.println("1 exp of 251 -> " + NumExp(1,251));
        System.out.println("2 exp of 2 -> " + NumExp(2,2));
        System.out.println("9 exp of 3 -> " + NumExp(9,3));
        System.out.println("125 exp of 5 -> " + NumExp(125,5));
        System.out.println("0 exp of 2 -> " + NumExp(0,2));

        //test cases for 3
        System.out.println("Problem 3 test cases: ");
        System.out.println("{1, 2, 3} meta 5 -> " + Arrays.toString(SumOfIndexArr(new int[]{1, 2, 3}, 5)));
        System.out.println("{} meta 5 -> " + Arrays.toString(SumOfIndexArr(new int[0], 5)));
        System.out.println("{-1, 2, 1} meta 0 -> " + Arrays.toString(SumOfIndexArr(new int[]{-1, 2, 1}, 0)));
        System.out.println("{-1, 2, 1, 8} meta 7 -> " + Arrays.toString(SumOfIndexArr(new int[]{-1, 2, 1, 8}, 7)));
        System.out.println("{2, 3, 10, -2} meta 5 -> " + Arrays.toString(SumOfIndexArr(new int[]{2, 3, 10, -2}, 5)));
        System.out.println("{2, 3, 10, -2} meta 200 -> " + Arrays.toString(SumOfIndexArr(new int[]{2, 3, 10, -2}, 200)));

        //test cases for 4
        System.out.println("Problem 4 test cases: ");
        System.out.println("0 -> " + toBinary(0));
        System.out.println("128 -> " + toBinary(128));
        System.out.println("137 -> " + toBinary(137));
        System.out.println("10 -> " + toBinary(10));
        System.out.println("100 -> " + toBinary(100));
        System.out.println("-2 -> " + toBinary(-2));
        System.out.println("1023 -> " + toBinary(1023));
        System.out.println("1 -> " + toBinary(1));

        //test cases for 5
        System.out.println("Problem 5 test cases: ");
        System.out.println("'hi' in 'hihihi': " + repeatCount("hi", "hihihi"));
        System.out.println("'hi' in 'I think so': " + repeatCount("hi", "I think so"));
        System.out.println("'hi' in 'hi, I think so yea, hi': " + repeatCount("hi", "hi, I think so yea, hi"));
        System.out.println("'h' in 'How are you today he said hey': " + repeatCount("h", "How are you today he said hey"));
        System.out.println("'' in 'hihihi': " + repeatCount("", "hihihi"));

        //test cases for 6
        System.out.println("Problem 6 test cases: ");
        System.out.println("{1, 0, 0, 2, 3} -> " + Arrays.toString(moveZeros(new int[]{1, 0, 0, 2, 3})));
        System.out.println("{1, 2, 3, 0, 0, 0} -> " + Arrays.toString(moveZeros(new int[]{1, 2, 3, 0, 0, 0})));
        System.out.println("{0, 0, 0, 1, 2, 3} -> " + Arrays.toString(moveZeros(new int[]{0, 0, 0, 1, 2, 3})));
        System.out.println("{1, 0, 2, 0, 0, 3} -> " + Arrays.toString(moveZeros(new int[]{1, 0, 2, 0, 0, 3})));
        System.out.println("{-3, 0, 2, 2, 0, 3} -> " + Arrays.toString(moveZeros(new int[]{-3, 0, 2, 2, 0, 3})));
        System.out.println("{} -> " + Arrays.toString(moveZeros(new int[]{})));

        //test cases for 7
        System.out.println("Problem 7 test cases: ");
        System.out.println("{1, 2, 3, 3} -> " + Arrays.toString(noDuplicates(new int[]{1, 2, 3, 3})));
        System.out.println("{3, 4, 3, 4, 3, 4, 5} -> " + Arrays.toString(noDuplicates(new int[]{3, 4, 3, 4, 3, 4, 5})));
        System.out.println("{} -> " + Arrays.toString(noDuplicates(new int[]{})));
        System.out.println("{1, -1, 1, -1, 1, -1, 1} -> " + Arrays.toString(noDuplicates(new int[]{1, -1, 1, -1, 1, -1, 1})));

        // test cases for 8
        System.out.println("Problem 8 test cases: ");
        int[][] empty = powerSet(new int[0]);
        int[][] two = powerSet(new int[]{1, 2});
        int[][] three = powerSet(new int[]{1, 2, 3});

        String emptyStr = "";
        String twoStr = "";
        String threeStr = "";

        for(int i = 0; i < empty.length; i++) {
            emptyStr = emptyStr + Arrays.toString(empty[i]) + " ";
        }

        for(int i = 0; i < two.length; i++) {
            twoStr = twoStr + Arrays.toString(two[i]) + " ";
        }

        for(int i = 0; i < three.length; i++) {
            threeStr = threeStr + Arrays.toString(three[i]) + " ";
        }

        System.out.println("{} -> " + emptyStr);
        System.out.println("{1, 2} -> " + twoStr);
        System.out.println("{1, 2, 3} -> " + threeStr);

        //test cases for 9
        System.out.println("Problem 9 test cases: ");
        System.out.println("1234567890: " + validatePhone("1234567890"));
        System.out.println("123-456-7890: " + validatePhone("123-456-7890"));
        System.out.println("(123) 456-7890: " + validatePhone("(123) 456-7890"));

    }

    //0
    public static int [] inputArray(int[] array, int element) {

        int [] result = new int[array.length +1];
        for (int i =0; i < array.length ; i++){
            result[i] = array[i];
        }
        result[array.length] = element;  // !
        return result;
    }

    public static String [] inputArray(String[] array, String element) {

        String [] result = new String[array.length +1];
        for (int i =0; i < array.length ; i++){
            result[i] = array[i];
        }
        result[array.length] = element;  // !
        return result;
    }

    public static char [] inputArray(char[] array, char element) {

        char [] result = new char[array.length +1];
        for (int i =0; i < array.length ; i++){
            result[i] = array[i];
        }
        result[array.length] = element;  // !
        return result;
    }

    //1
    public static int SumOf(int n){
        int sum = Math.abs(n) ; // because it treats - as -1 when it gets numeric value

        do {
            String digits = "" + sum; // 1234 to "1234"
            // we have an integer
            // we get the digits by converting to string
            // we sum them
            sum = 0;

            for(int i =0; i < digits.length();i++){
                sum+=Character.getNumericValue(digits.charAt(i));
            }
        } while(sum>9);

        return sum;
    }

    //2
    public static boolean NumExp(int n, int m) {
        boolean result =false;

        int exponent = 1;

        // try comparing n to exponents of m
        while(exponent <= n){
            if(exponent == n){
                result = true;
            }
            exponent *= m;
        }

        return result;
    }

    //3
    public static int[] SumOfIndexArr(int[] arr, int meta){
        //Ex : ({2, 3, 10, -2}, 5) -> {0, 1}
        // explicit guard clause (code would handle it anyway)
        if(arr.length == 0) {
            return new int[0];
        }

        // init to 0 in case we don't find value
        int[] result = new int[0];

        for (int i = 0; i <arr.length; i++){ //2
            for (int k = i+1; k < arr.length; k++){ //3
                if (arr[i]+arr[k] == meta) {
                    result = new int[]{i, k};
                    break;
                }
            }
        }

        return result;
    }

    //4
    public static String toBinary(int n){
        n = Math.abs(n);

        String res = "";

        // handle 0 edge case
        if (n == 0){
            res= "0";
        }

        // store mods in reverse order in string
        while (n > 0){
            res = (n % 2) + res;
            n /= 2;
        }

        return res;
    }

    //5
    //version using split method at the bottom of the file
    public static int repeatCount(String s, String recehica) {
        if(s.length() == 0) {
            return 0;
        }

        s = s.toLowerCase();
        recehica = recehica.toLowerCase();
        int repetitions = 0;

        // check every character that is a possible start of match (aka there are enough letters AFTER for there to be a match)
        for(int i = 0; i <= recehica.length()-s.length(); i++) {

            if(recehica.charAt(i) == s.charAt(0)) {
                // assume it will match, (easier to disprove than prove)
                boolean fullMatch = true;

                // iterate through word
                for(int m = 0; m < s.length(); m++) {

                    // if characters don't match, update to false
                    if(s.charAt(m) != recehica.charAt(m+i)) {
                        fullMatch = false;
                    }
                }

                // done doing work of checking match, use result to know whether we update repetitions
                if(fullMatch) {
                    repetitions += 1;
                }
            }
        }

        return repetitions;
    }

    //6
    public static int[] moveZeros(int[] arr){ //[0, 0, 0, 1, 2, 3] / [1, 2, 3, 0, 0, 0]/

        int [] result = new int[arr.length]; // [0,0,0,0,0,0]
        int idx = 0;

        // copy values to new array, zeroes already in correct positions
        for (int i = 0; i < arr.length; i++){
            if(arr[i] !=0 ){
                result[idx] = arr[i];
                idx += 1;
            }
        }

        return result;
    }

    //7
    public static int[] noDuplicates(int[]niz) {
        int[] result;
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < niz.length; i++){
            set.add(niz[i]);
        }

        result = new int[set.size()];

        int index = 0;
        for(int i: set) {
            result[index] = i;
            index += 1;
        }

        return result;
    }

    //8
    public static int[][] powerSet(int[] arr) {
        // size of power set is 2^n
        int[][] result = new int[(int) Math.pow(2, arr.length)][];

        result[0] = new int[0];

        // for each val in arrays, add to existing
        int idx = 1;
        for(int i = 0; i < arr.length; i++) {
            int upperBound = idx;
            // loop through existing, adding new val
            for(int k = 0; k < upperBound; k++) {
                result[idx] = inputArray(result[k], arr[i]);
                idx += 1;
            }
        }

        return result;
    }

    //9
    public static boolean validatePhone(String num) {

        Pattern pattern = Pattern.compile("(^\\([0-9]{3}\\) [0-9]{3}\\-[0-9]{4}$)|(^[0-9]{3}-[0-9]{3}-[0-9]{4}$)");
        Matcher matcher = pattern.matcher(num);

        return matcher.matches();
    }

    // 5b: matches FULL matches only, e.g. "hi" or " hi " matches "hi", but "think" does not
    //// implementation for different understanding of number 5 where we matched whole word usage only, not just character sequence anywhere
    public static int numOfRepetitionFullMatches( String s, String sentence){

        // remove punctuation and split string on spaces into words array
        sentence = sentence.replaceAll("-","");
        sentence = sentence.replaceAll("\\p{Punct}", " ");// zbog "-"
        String [] words = sentence.split(" ");

        // count occurences
        int repetition = 0;
        for (int i =0; i < words.length; i++){
            if(words[i].equalsIgnoreCase(s)){
                repetition+=1;
            }
        }

        return repetition;
    }

}
