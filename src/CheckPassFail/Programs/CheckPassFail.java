package CheckPassFail.Programs;

public class CheckPassFail {

    public static void CheckPassFail(){
        System.out.println("Write a program called CheckPassFail which prints \"PASS\" " +
                "if the int variable \"mark\" is more than or equal to 50; " +
                "or prints \"FAIL\" otherwise. The program shall always print “DONE” before exiting.");
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
