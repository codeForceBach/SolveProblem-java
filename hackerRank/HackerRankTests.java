package problemSolve.hackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HackerRankTests {
    public static void main(String[] args) throws IOException {
        /*
        nextInt() consumes all characters that make up the integer, but it does not touch the end-of-line character.
        So when nextLine() is called, it sees that there are no characters before the end-of-line character, so it thinks that an empty line was entered, and you get an empty String back.
        However, nextLine() does consume the end-of-line character, so if you call sc.nextLine();
        once before you do name = sc.nextLine();, it should work.
         */
        //HackerRankChallenges.wrapper();
        //HackerRankChallenges.stdInOUut();
        //HackerRankChallenges.outputFormat();
        //HackerRankChallenges.multipleN(3);
        //HackerRankChallenges.multipleLoopLine(5,3, 5);
        //HackerRankChallenges.dataTypeRange(5);
        //HackerRankChallenges.fuzzBuzz(15);
        /*
        initialize bufferReader and bufferWriter to read file from a path
        and creates 2 dimensional array and pass on the hourGlassSum method
         */
/*
        List<List<Integer>> arr = readFile();
        int result = HackerRankChallenges.hourGlassSum(arr);
        System.out.println("the Max value of the HourGlassSum is " + result);
*/

        //add more problem methods 10/09/2021
        //HackerRankChallenges.stringIntro();
        //HackerRankChallenges.stringPalindrome();
        HackerRankChallenges.getSmallAndlarge("Welcometojava", 3);
        //HackerRankChallenges.getSmallAndlarge("WelcometojavaWorldfortheheckoftime", 5);
        System.out.println("ava".compareTo("toj"));
        System.out.println("toj".compareTo("ava"));

    }//end main

    private static List<List<Integer>> readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("output_path")));
        /*
        You can replicate it in a terminal by running your program with the command:
        env OUTPUT_PATH=/path/to/some/file java Solution
        -> env output_PATH=C:\Users\chq-richardp\Documents\java_workSpace\Adv_java_tutorial\src\main\java\problemSolve.hackerRank java HackerRankTests

        better way to output in console rather than a separate file
        https://newbedev.com/what-s-the-correct-parameter-value-of-system-getenv-output-path
        That "OUTPUT_PATH" is an environmental variables. You have to declare that variable in your operating system to use it.
        Generally website like hackerrank do it because learning the path of there system is not good for security I guess.
        You can test your code in IDE but the environmental variables will be not there you need to declare.
        I hope it helped you for your confusion.
         */
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //initialize 2 dimensional ArrayList( brand new to me)
        List<List<Integer>> arr2 = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            //read a single line of input file and build array per line terminator

            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");

            //initialize a new 2 dimensional arraylist
            List <Integer> arrRowItems = new ArrayList<>();

            //iterate the initial String array to convert to int and add them to an arrayList.
            for(int j = 0 ; j < 6 ; j++){
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }//end second array loop

            //after single array is complete above for loop, add them to 2d dimensional array.
            arr2.add(arrRowItems);
        }//end for loop

        return arr2;
    }


}//end class
