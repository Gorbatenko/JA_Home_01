package ua.skillsup.gorbatenko.Programs;

public class ComputePI {
    public static void computePI(){
        System.out.println("Write a program called ComputePI to compute the value of π, using the following series expansion. " +
                "You have to decide on the termination criterion used in the computation");

        int maxTerm = 25000;
        double sum = 0.0;
        for (int term = 1; term <= maxTerm; term++) {
            if (term % 2 == 1) {
                sum += 1.0/(term*2-1);
            } else {
                sum -= 1.0/(term*2-1);
            }
        }
        System.out.println("PI handmade is: " + sum*4);
        System.out.println("PI Math is:     " + Math.PI);

        if ((sum * 4) == Math.PI){
            System.out.println("PI handmade equals PI Math.");
        } else {
            System.out.println("PI handmade not equals PI Math.");
        }
    }

}
