package problemSolve.edabit;

import static org.junit.jupiter.api.Assertions.*;

class EdabitChallengesTest {

    /*
    @org.junit.jupiter.api.Test


    public void countTrue1 (){
        boolean[] boolArry = {true, false, false, true, false};
        int count = EdabitChallenges.countTrue(boolArry);
        assertEquals(count, 2);
    }

    @org.junit.jupiter.api.Test
    public void wordCount1 (){
        String s1 = "Just an example here move along";
        String s2 = "This is a test";
        String s3 = "";
        int wCount1 = EdabitChallenges.wordCount(s1);
        assertEquals(wCount1, 6);
        int wCount2 = EdabitChallenges.wordCount(s2);
        assertEquals(wCount2, 4);
        int wCount3 = EdabitChallenges.wordCount(s3);
        assertEquals(wCount3, 1);

    }

    @org.junit.jupiter.api.Test
    public void triSequence(){
        int sequence1 = EdabitChallenges.triangleNoSequence(4);
        assertEquals(10, sequence1);
    }
*/
    @org.junit.jupiter.api.Test
    public void reverseSentence(){
        String s1 =  "Hello World!";
        String rs1 = EdabitChallenges.ReverseString(s1);// = "!dlroW olleH";
        assertEquals("!dlroW olleH", rs1);
    }


}