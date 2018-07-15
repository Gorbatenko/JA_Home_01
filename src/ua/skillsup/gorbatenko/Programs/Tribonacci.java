package ua.skillsup.gorbatenko.Programs;

public class Tribonacci {
    public static void tribonacci(){
        int counter = 4;
        int tribonaciNumber;
        int tribonaciMinus1 = 2;
        int tribonaciMinus2 = 1;
        int tribonaciMinus3 = 1;
        int countMax = 20;
        int sum = tribonaciMinus3 + tribonaciMinus2 + tribonaciMinus1;
        double average;

        System.out.printf("The first %d Tribonacci numbers are:\n",countMax);
        System.out.printf("%d %d %d ", tribonaciMinus3, tribonaciMinus2, tribonaciMinus1);

        while (counter <= countMax) {
            tribonaciNumber = tribonaciMinus1 + tribonaciMinus2 + tribonaciMinus3;
            sum += tribonaciNumber;
            System.out.print(tribonaciNumber + " ");

            ++counter;
            tribonaciMinus3 = tribonaciMinus2;
            tribonaciMinus2 = tribonaciMinus1;
            tribonaciMinus1 = tribonaciNumber;
        }

        average = (double) sum / countMax;
        System.out.println("\nThe average is: " + average);
    }
}
