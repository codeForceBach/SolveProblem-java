package problemSolve.hackerRank;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class HackerRankChallenges {


    public static void wrapper(){
        int a = 123;
        Integer wrapA = new Integer(a);
        System.out.println("passing primitive value to Integer autoBox the primitive value : " + wrapA);
        Integer stringInt = new Integer("123");
        System.out.println("Even if pass string parameter, autoboxing apply : " + stringInt);
        Integer eAsa = a;
        System.out.println("assign a primitive value to object type auto boxing as well : " + eAsa);

        byte b = (byte)261;
        System.out.println("the value of b with byte conversion of 261 is : " + b);
        System.out.println("the value of Integer.toBinaryString(b) is : " + Integer.toBinaryString(b));
        System.out.println("the value of Integer.toBinaryString(261) is : " + Integer.toBinaryString(261));
    }

    public static void stdInOUut() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine();

        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s.toString());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public static void outputFormat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s" + "%03d%n", s1, x);
        }
        System.out.println("================================");
    }

    public static void multipleN(int N) {
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }

    public static void multipleLoopLine(int a, int b, int n) {
        int result = a;
        for (int i = 0; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
            result = result + b * ((int) Math.pow(2, i));
            System.out.print(result + " ");

        }
    }

    public static void dataTypeRange(double t) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -127 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32768) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

    public static void endOfFile() throws IOException {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        int lineCnt = 0;
        while(scan.hasNext()){
            lineCnt++;
            System.out.println(lineCnt  + scan.next());
        }
        String s = Integer.toString(2);
       /*
       BufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();*/
    }

    public static void fuzzBuzz(int n) {
        for (int i = 1 ; i <= n; i++){
           if(i >= 3 && i % 3 ==0){
                if(i >= 5 && i%5 == 0){
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }

            } else if (i >= 5 && i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

    public static int hourGlassSum(List<List<Integer>> arr){
        //since -9 is the lowest value, the maxSum need to set the possible max negative value.
        int maxSum = -54;
        //you can go 4th line max
        int[][] maxArray = new int[4][4];

        for (int i = 0 ; i < maxArray.length; i++){
            System.out.print(i + " : ");
            for (int j = 0 ; j < maxArray[i].length; j++){
                //System.out.print(j + " : ");
                int arraySum = 0;
                int counter = 0;
                for (int x = i; x < i + 3; x++) {

                    for (int y = j; y < j + 3; y++) {
                        //if j is greater or equals to i
                        //arraySum += arr.get(x).get(y);
                        ++counter;
                        System.out.print(counter + "_");
                        if (!((counter == 4) || (counter == 6))) {
                            System.out.print(arr.get(x).get(y) + " ");
                            arraySum += arr.get(x).get(y);
                        }

                }
            }
                System.out.println("\n");
                maxArray[i][j] = arraySum;
            }
        }

//iterate over new 2d array to assign the max value to maxSum
        System.out.println("maxArray = {" );
       for(int h = 0 ; h < maxArray.length; h++ ){
            for(int g = 0 ; g < maxArray[h].length ; g++){
                if ((h == (maxArray.length -1)) && (g == (maxArray[h].length - 1))) {
                    System.out.print(maxArray[h][g]);
                } else {
                    System.out.print(maxArray[h][g] + ", ");
                }
                if (maxSum < maxArray[h][g]){
                    maxSum = maxArray[h][g];
                }
            }

        }
        System.out.println("}");
        return maxSum;
    }
    
}
