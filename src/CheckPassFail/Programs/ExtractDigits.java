package CheckPassFail.Programs;

public class ExtractDigits {
    public static void ExtractDigits(){

        int n = 5345355;
        while (n > 0) {
            int digit = n % 10;
            System.out.printf("%d ",digit);
            n = n / 10;
        }

    }

}
