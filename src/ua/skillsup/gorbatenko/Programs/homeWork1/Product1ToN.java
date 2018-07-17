package ua.skillsup.gorbatenko.Programs.homeWork1;

public class Product1ToN {
    public static void product1ToN(){
        System.out.println("Write a program called Product1ToN to compute the product of integers 1 to 10 (i.e., 1×2×3×...×10). " +
                "Try computing the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. " +
                "Write down the product obtained and explain the results.");
        long product = 1;
        int lowerbound = 1;
        int upperbound = 13;

        for (int number = lowerbound; number <= upperbound; ++number) {
            product *= number;
        }
        System.out.println("Product of " + lowerbound + " to " + upperbound + ": " + product);
    }

}
