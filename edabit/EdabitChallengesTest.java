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

        /*
        boolean [] booleanArr= {true, true, false, false, true};
        int count = EdabitChallenges.countTrue(booleanArr);
        System.out.println("expected count of \"true\" is : " + count);

        System.out.println(EdabitChallenges.triangleNoSequence(4));

        String t1 = "Hello World!";
        System.out.println(t1.length());
        System.out.println(EdabitChallenges.ReverseString(t1));

        System.out.println(EdabitChallenges.CaptureTheRock(new String []{"A8", "E8"}));
        System.out.println(EdabitChallenges.CaptureTheRock(new String []{"A8", "H3"}));


        System.out.println("result of difference : " + EdabitChallenges.MaxAndMinGap(34, 12, 7));

        System.out.println("Is there a bomb? : " + EdabitChallenges.fineTheBomb("this goes boom!!"));
        System.out.println("Is there a bomb? : " + EdabitChallenges.fineTheBomb("did you think there is a BOMB?"));

        EdabitChallenges.arrayOfMultiple(4, 5);


        System.out.println(EdabitChallenges.parityAnalysis(243));


        System.out.println(EdabitChallenges.dashed("Carpe Diem"));
        */
        //System.out.println(EdabitChallenges.histogram((new int []{3, 5, 0}), "]"));

        System.out.println(EdabitChallenges.duplicateCount("abastskadobit"));
        System.out.println(EdabitChallenges.duplicateCount("o"));
    }


}