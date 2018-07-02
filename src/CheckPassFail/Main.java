package CheckPassFail;

public class Main {
    public static void main(String[] args) {

        System.out.println("SumAndAverage:");
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int count = 0;

        for (int number1 = lowerbound; number1 <= upperbound; ++number1) {
            sum += number1;
            count++;
        }
        average = (double) sum / count;
        System.out.println("Sum [for]: " + sum);
        System.out.println("Average [for]: " + average + "\n");

        int numberWhileDo = lowerbound;
        int sumWhileDo = 0;
        while (numberWhileDo <= upperbound) {
            sumWhileDo += numberWhileDo;
            ++numberWhileDo;
        }
        double averageWhileDo = (double) sumWhileDo / count;
        System.out.println("Sum [while-do]: " + sumWhileDo);
        System.out.println("Average [while-do]: " + averageWhileDo + "\n");

        int numberDoWhile = lowerbound;
        int sumDoWhile = 0;
        do {
            sumDoWhile += numberDoWhile;
            ++numberDoWhile;
        } while (numberDoWhile <= upperbound);
        double averageDoWhile = (double) sumDoWhile / count;
        System.out.println("Sum [do-while]: " + sumDoWhile);
        System.out.println("Average [do-while]: " + averageDoWhile + "\n");

    }

}
