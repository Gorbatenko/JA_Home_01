package CheckPassFail.Programs;

public class CheckPassFail {

    public static void CheckPassFail(){
        System.out.println("CheckPassFail:");
        int mark = 60;
        System.out.println("The mark is " + mark);

        if ( mark >= 50 ) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE\n");
    }
}
