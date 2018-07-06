package CheckPassFail.Programs;

public class Product1ToN {
    public static void Product1ToN(){
        System.out.println("Product1ToN:");
        long product = 1;
        int lowerbound = 1;
        int upperbound = 13;

        for (int number = lowerbound; number <= upperbound; ++number) {
            product *= number;
        }
        System.out.println("Product of " + lowerbound + " to " + upperbound + ": " + product);
    }

}
