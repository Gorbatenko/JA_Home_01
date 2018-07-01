package CheckPassFail;

public class Main {
    public static void main(String[] args) {
        //*******************************************************//
        System.out.println("CheckPassFail:");
        int mark = 60;
        System.out.println("The mark is " + mark);

        if ( mark >= 50 ) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE\n");
        //*******************************************************//

        //*******************************************************//
        System.out.println("CheckOddEven:");
        int number = -49;
        System.out.println("The number is " + number);
        if ( number % 2 != 0 ) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("BYE!\n");
        //*******************************************************//

        //*******************************************************//
        System.out.println("PrintNumberInWord:");
        number = 5;

        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }

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
        //*******************************************************//


    }

}
