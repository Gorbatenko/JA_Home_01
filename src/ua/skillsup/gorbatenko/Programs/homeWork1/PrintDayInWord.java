package ua.skillsup.gorbatenko.Programs.homeWork1;

public class PrintDayInWord {
    public static void printDayInWord(){
        System.out.println("Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday”" +
                " if the int variable \"day\" is 0, 1, ..., 6, respectively. " +
                "Otherwise, it shall print “Not a valid day”. " +
                "Use (a) a \"nested-if\" statement; (b) a \"switch-case\" statement.:");
        int number = 5;

        switch(number) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Not a valid day");
        }
        System.out.println();
    }
}
