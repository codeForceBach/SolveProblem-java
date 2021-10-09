package problemSolve.edabit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EdabitChallenges {

    public static int countTrue(boolean [] arr){
        int cntT = 0;
/*
        for(int i = 0; i < arr.length ; i++){
            if (arr[i] == true){
                cntT++;
            }//end if
        }//end for
       */
        for(boolean b : arr){
            if(b == true){
                cntT++;
            }
        }
        return cntT;
    }//end countTrue

    public static int wordCount(String s){
        String[] word = s.split("\\s");
        return word.length;

    }

    public static int triangleNoSequence(int num){
        //each time the num increment,
        //it add index count to the number to create next number.
        int sequence = 0;
        for(int i = 1; i <= num ; i++){
            sequence += i;
        }
        return sequence;
    }

    public static String ReverseString(String s1) {

 /*       char[] s1Char = s1.toCharArray();
        StringBuilder rSt = new StringBuilder();
        for(int i = s1Char.length-1 ; i >= 0 ; i--){
            rSt.append(s1Char[i]);
        }
        return rSt.toString();
        */
        //https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
        return new StringBuilder(s1).reverse().toString();
    }

    public static boolean CaptureTheRock(String [] rocks) {

        if(rocks[0].substring(0, 1).equals(rocks[1].substring(0, 1))){
            return true;
        } else if (rocks[0].substring(1, 2).equals(rocks[1].substring(1, 2))){
            return true;
        } else {
            return false;
        }

        //try use charAt() method or startWith() & endWith
        /*https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
        	return ((rooks[0].charAt(0) == rooks[1].charAt(0)) ||
						(rooks[0].charAt(1) == rooks[1].charAt(1)));
        return rooks[0].startsWith(rooks[1].substring(0,1)) || rooks[0].endsWith(rooks[1].substring(1));
         */

    }

    public static int MaxAndMinGap (int a, int b, int c){

        int [] salary = {a, b, c};
        Arrays.sort(salary);
        return salary[2] - salary[0];
        //utilize max and min Math function that iterate inside parenthesis
        /*
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return max - min;
         */

    }

    public static String fineTheBomb( String word){

        if (word.toUpperCase().contains("BOMB")){
            return "DUCK!";
        }
        return "relax, there's no bomb.";

    }

    public static String nameShuffle(String name){
        String[] nameSqe = name.split(" ");

        return nameSqe[1] + " " + nameSqe[0];
    }

    public static int[] arrayOfMultiple(int num, int length){
        int[] numTime = new int[length];
        for (int i = 0; i < length ; i++){
            numTime[i] =  (num * i) + num;
        }
        return numTime;

    }

    public static boolean parityAnalysis(int num){
        boolean oddNum = false;
        boolean sumOdd = false;

         if (num % 2 == 1){
             oddNum = true;
         }

        char [] numStr = (String.valueOf(num)).toCharArray();
         int sum = 0;
         for(char c : numStr){
                sum += Character.getNumericValue(c);
         }

        if (sum % 2 == 1) {
            sumOdd = true;
        }

         if (oddNum == sumOdd){
             return true;
         } else {

             return false;
         }


    }

    public static String dashed(String s){

/*

        char[ ] charS = s.toCharArray();
        StringBuilder dashedS = new StringBuilder();
        for(char c : charS){
            if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) =='i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u'){
                dashedS.append("-"+ c +"-");
            }else {
                dashedS.append(c);
            }
        }
        System.out.println(String.valueOf(dashedS));
        //return String.valueOf(dashedS);
*/

        return s.replaceAll("(?i)([aeiou])","-$1-");
    }

    public static boolean PuzzlePieces(int[][] n){
        boolean sameSum = true;
        if (n[0].length == n[1].length) {
            int sum = n[0][0] + n[1][0];
            for (int i = 1; i < n[1].length; i++) {
                if (sum != n[0][i] + n[1][i]){
                    sameSum = false;
                }
            }
        } else {
            sameSum = false;
        }
        return sameSum;

    }

    public static String rps(String s1, String s2){
        //if s1 is rock and s2 scissors Player 1 wins
        //otherwise(s2 is paper) player 2 wins
        if (s1.equals("rock") && s2.equals("scissors")){
            return "Player 1 wins";
        } else if (s1.equals("paper") && s2.equals("rock")){
            return "Player 1 wins";
        } else if (s1.equals("scissors") && s2.equals("paper")){
            return "Player 1 wins";
        } else if (s1.equals(s2)){
            return "TIE";
        } else
            return "Player 2 wins";

    }

    public static int duplicateCount(String str){
        int duplicateCount = 0;
        Map<Character, Integer> duplicateS = new HashMap<>();
        //iterate the charArray per current chat to increment count
        for (int i = 0 ; i < str.length() ; i++){
            /*
            int count = duplicateS.get(s.charAt(i));
            duplicateS.put(s.charAt(i), (duplicateS.containsKey(s.charAt(i)) ? ++count : 1));
            */
            if(!duplicateS.containsKey(str.charAt(i))){
                duplicateS.put(str.charAt(i), 1);
            } else {
                int count = (duplicateS.get(str.charAt(i)));
                duplicateS.put(str.charAt(i), ++count);
            }
        }//end of for loop with String

        for(Map.Entry<Character, Integer> cha: duplicateS.entrySet()){

            if(cha.getValue() >= 2){
                duplicateCount = 2;
            }//End if

        }//End for
        return duplicateCount;

        //store each duplicateChar counter to map (for duplicate char) and return max duplicate count with chat itself

    }
}//end class
