
package ua.skillsup.gorbatenko.Programs.homeWork2;

import java.util.ArrayList;

public class MyArrаyLіst {
    public static void myArrаyLіst() {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("green");
        colors.add("gray");
        colors.add("red");

        System.out.println("1. Colors in the ArrayList are: " + colors);

        colors.add(0,"pink");
        System.out.println("2. First element in the ArrayList is pink. Colors in the ArrayList are: " + colors);

        String element = colors.get(2);
        System.out.println("3. Third element in the ArrayList is: " + element);

        String searchColor = "blue";
        boolean isPresentElement = colors.contains(searchColor);
        if (isPresentElement){
            System.out.printf("4. The %s color found in the ArrayList.\n", searchColor);
        }else {
            System.out.printf("4. %s color not found in the ArrayList.\n", searchColor);
        }


    }
}
