
package ua.skillsup.gorbatenko.Programs.homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class MyArrаyLіst {
    public static void myArrаyLіst() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("green");
        colors.add("gray");
        colors.add("red");

        System.out.println("1. Colors in the ArrayList are: " + colors);

        System.out.print("   Please enter a color for the second task: ");
        String firstColor = reader.readLine();
        colors.add(0,firstColor);
        System.out.printf("2. First element in the ArrayList is %s. \n   Colors in the ArrayList are: %s.\n",firstColor,colors);

        String element = colors.get(2);
        System.out.println("3. Third element in the ArrayList is: " + element);

        System.out.print("   Please enter a color for the fourth task: ");
        String searchColor = reader.readLine();
        boolean isPresentElement = colors.contains(searchColor);
        if (isPresentElement){
            System.out.printf("4. The %s color found in the ArrayList.\n", searchColor);
        }else {
            System.out.printf("4. %s color not found in the ArrayList.\n", searchColor);
        }

        ArrayList<String> sortColors = new ArrayList<>();
        ArrayList<String> reverseColors = new ArrayList<>();
        Collections.sort(colors);
        sortColors.addAll(colors);
        Collections.reverse(colors);
        reverseColors.addAll(colors);
        System.out.printf("5. Sort ArrayList is: %s.\n", sortColors);
        System.out.printf("   Reverse ArrayList is: %s.\n", reverseColors);

        boolean isSortedArraysAreEqualsFirstMethod = sortColors.equals(reverseColors);
        String firstResult = (isSortedArraysAreEqualsFirstMethod)? "equals": "not equals";
        boolean isSortedArraysAreEqualsSecondMethod = new HashSet(sortColors).equals(new HashSet(reverseColors));
        String secondResult = (isSortedArraysAreEqualsSecondMethod)? "equals": "not equals";
        System.out.printf("6. ArrayLists are %s for first method.\n",firstResult);
        System.out.printf("   ArrayLists are %s for second method.\n",secondResult);

        System.out.println("*7. trіm thе cаpаcіty оf аn аrrаy lіst thе currеnt lіst sіzе.");

        ArrayList<String> cloneColors = (ArrayList<String>)colors.clone();
        System.out.printf("8. Clоnеd ArrаyLіst is: %s.\n",cloneColors);
        System.out.printf("   Original ArrаyLіst is: %s.\n",colors);


        ArrayList<String> combinedColors = new ArrayList<>();
        combinedColors.addAll(colors);
        combinedColors.addAll(cloneColors);

        System.out.printf("9. Result of jоіn twо аrrаy lіsts is: %s.\n",combinedColors);

    }
}
