package CheckPassFail.Programs;

public class PrintDayInWord {
    public static void PrintDayInWord(){
        System.out.println("PrintDayInWord:");
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
