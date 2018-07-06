package CheckPassFail.Programs;

public class Fibonacci {

    public static void Fibonacci(){
        int counter = 3;
        int fibonaciNumber;
        int fibonaciMinus1 = 1;
        int fibonaciMinus2 = 1;
        int countMax = 20;
        int sum = fibonaciMinus1 + fibonaciMinus2;
        double average;

        System.out.printf("The first %d Fibonacci numbers are:\n",countMax);
        System.out.printf("%d %d ",fibonaciMinus2, fibonaciMinus1);

        while (counter <= countMax) {
            fibonaciNumber = fibonaciMinus1 + fibonaciMinus2;
            sum += fibonaciNumber;
            System.out.print(fibonaciNumber + " ");

            ++counter;
            fibonaciMinus2 = fibonaciMinus1;
            fibonaciMinus1 = fibonaciNumber;
        }

        average = (double) sum / countMax;
        System.out.println("\nThe average is: " + average);
    }
}
