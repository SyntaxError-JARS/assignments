package PrinterClasses;

import basic_implementations.ChaoticControl;
import basic_implementations.LoopCentral;

import java.util.Arrays;

public class LoopPrinter {
    public static void loopPrinting(){
// TODO: use an enhanced for loop with the stringArray, if any String in the array contains the word "Awesome" return true otherwise return false
// TODO: Use the String array numbersAsStrings to return an int array that indicates evens as 0 and odds as 1
        System.out.println("----------------------------------------------------");
        System.out.println("------------------Loop Start---------------------");

        LoopCentral loopCentral = new LoopCentral();

        boolean check1 = (loopCentral.breakMe("Skillz").equals("Huzzah"));
        boolean check2 = (loopCentral.breakMe("Hello").equals("No Huzzah"));
        boolean check3 = (loopCentral.breakMe("Pizza").equals("Huzzah"));
        boolean check4 = (loopCentral.breakMe("Zaps").equals("No Huzzah"));
        boolean check5 = (loopCentral.breakMe("Zapz").equals("Huzzah"));

        System.out.printf("Your breakMe test passed if the follow all prints true: \n %s \n %s \n %s \n %s",check1,check2,check3,check4,check5).println();
        System.out.println("--------------------breakMe method End---------------------");

        String[] stringArray1 = {"Charles", "is", "a", "dingleberry!"};
        check1 = !loopCentral.enhancedLoop(stringArray1);

        String[] stringArray2 = {"Y'all", "be", "so", "Awesome"};
        check2 = loopCentral.enhancedLoop(stringArray2);

        String[] stringArray3 = {"Awesome", "work", "today", "Folks!"};
        check3 = loopCentral.enhancedLoop(stringArray3);

        String[] stringArray4 = {"This", "is", "Awesome", "Work!"};
        check4 = loopCentral.enhancedLoop(stringArray4);

        String[] stringArray5 = {"Never", "give", "up", "Everybody!"};
        check5 = !loopCentral.enhancedLoop(stringArray5);

        System.out.printf("Your enhancedLoop test passed if the follow all prints true: \n %s \n %s \n %s \n %s \n %s",check1,check2,check3,check4,check5).println();
        System.out.println("--------------------enhancedLoop method End---------------------");

        String[] oddstringArray1 = {"1", "2", "3", "4"};
        check1 = Arrays.equals(loopCentral.oddCheck(oddstringArray1), new int[]{1, 2, 3, 4});

        String[] oddstringArray2 = {"10", "20", "30", "40"};
        check2 = Arrays.equals(loopCentral.oddCheck(oddstringArray2), new int[]{10, 20, 30, 40});

        String[] oddstringArray3 = {"11", "22", "33", "44"};
        check3 = Arrays.equals(loopCentral.oddCheck(oddstringArray3), new int[]{11, 22, 33, 44});

        String[] oddstringArray4 = {"14", "24", "34", "44"};
        check4 = Arrays.equals(loopCentral.oddCheck(oddstringArray4), new int[]{14, 24, 34, 44});

        String[] oddstringArray5 = {"19", "29", "34", "94"};
        check5 = Arrays.equals(loopCentral.oddCheck(oddstringArray5), new int[]{19, 29, 34, 94});

        System.out.printf("Your oddCheck test passed if the follow all prints true: \n %s \n %s \n %s \n %s",check1,check2,check3,check4,check5).println();
        System.out.println("--------------------oddCheck method End---------------------");


    };
}
