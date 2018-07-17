package ua.skillsup.gorbatenko.Programs.homeWork1;

public class ExtractDigits {
    public static void extractDigits(){

        int n = 5345355;
        while (n > 0) {
            int digit = n % 10;
            System.out.printf("%d ",digit);
            n = n / 10;
        }

    }

}
