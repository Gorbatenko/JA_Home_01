package CheckPassFail.Programs;

public class HarmonicSum {

    public static void HarmonicSum(){
        System.out.println("Write a program called HarmonicSum to compute the sum of a harmonic series, " +
                "as shown below, where n=50000. The program shall compute the sum from left-to-right " +
                "as well as from the right-to-left. ");

        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double delta = 0.0;

        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            sumL2R += 1 / ((double) denominator);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = maxDenominator; denominator >= 1; --denominator) {
            sumR2L += 1 / ((double) denominator);
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        System.out.println("The difference is: " + (sumR2L - sumL2R));

    }

}
