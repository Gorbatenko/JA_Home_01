package ua.skillsup.gorbatenko.Programs.homeWork1;

public class SumAndAverage {
    public static void sumAndAverage() {
        System.out.println("Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. " +
                "Also compute and display the average:");
        System.out.println("Modify the program to use a \"while-do\" loop instead of \"for\" loop.");
        System.out.println("Modify the program to use a \"do-while\" loop.");
        System.out.println("Modify the program to sum from 111 to 8899, and compute the average. " +
                "Introduce an int variable called count to count the numbers in the specified range.");
        System.out.println("Modify the program to sum only the odd numbers from 1 to 100, and compute the average. " +
                "(HINTS: n is an odd number if n % 2 is not 0.)");
        System.out.println("Modify the program to sum those numbers " +
                "from 1 to 100 that is divisible by 7, and compute the average.");
        System.out.println("Modify the program to find the \"sum of the squares\" " +
                "of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.");
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
