package CheckPassFail.Programs;

public class CheckOddEven {
    public CheckOddEven(){
        System.out.println("CheckOddEven:");
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
