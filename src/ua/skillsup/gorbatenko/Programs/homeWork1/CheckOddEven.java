package ua.skillsup.gorbatenko.Programs.homeWork1;

public class CheckOddEven {
    public static void checkOddEven(){
        System.out.println("Write a program called CheckOddEven which prints \"Odd Number\" " +
                "if the int variable “number” is odd, or “Even Number” otherwise. " +
                "The program shall always print “BYE!” before exiting.");
        int number = -49;
        System.out.println("The number is " + number);
        if ( number % 2 != 0 ) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("BYE!\n");
    }

}
