package CheckPassFail.Programs;

public class SumAndAverage {
    public void SumAndAverage() {
        System.out.println("SumAndAverage:");
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int countFor = 0;

        for (int number = lowerbound; number <= upperbound; ++number) {
            if (number % 2 != 0) {
                sum += number;
                countFor++;
            }
        }
        average = (double) sum / countFor;
        System.out.println("Sum odd numbers is: " + sum);
        System.out.println("Average of odd numbers is: " + average + "\n");

        int numberWhileDo = lowerbound;
        int sumWhileDo = 0;
        int countWhileDo = 0;
        while (numberWhileDo <= upperbound) {
            if (numberWhileDo % 7 == 0) {
                sumWhileDo += numberWhileDo;
                countWhileDo++;
            }
            numberWhileDo++;
        }
        double averageWhileDo = (double) sumWhileDo / countWhileDo;
        System.out.println("Sum numbers from 1 to 100 that is divisible by 7 is: " + sumWhileDo);
        System.out.println("Average of numbers from 1 to 100 that is divisible by 7 is: " + averageWhileDo + "\n");

        int numberDoWhile = lowerbound;
        int sqrNumber;
        int sumDoWhile = 0;
        int countDoWhile = 0;
        do {
            sqrNumber = numberDoWhile * numberDoWhile;
            sumDoWhile += sqrNumber;
            numberDoWhile++;
            countDoWhile++;
        } while (numberDoWhile <= upperbound);
        double averageDoWhile = (double) sumDoWhile / countDoWhile;
        System.out.println("Sum of the squares is: " + sumDoWhile);
        System.out.println("Average of the squares is: " + averageDoWhile);
    }
}
