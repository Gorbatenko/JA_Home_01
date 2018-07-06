package CheckPassFail.Programs;

public class CozaLozaWoza {
    public static void CozaLozaWoza() {
        int lowerbound = 1;
        int upperbound = 110;
        boolean isNumber = true;

        for (int number = lowerbound; number <= upperbound; ++number) {

            isNumber = true;
            // Print "Coza" if number is divisible by 3
            if ( number % 3 == 0 ) {
                System.out.print("Coza");
                isNumber = false;
            }
            // Print "Loza" if number is divisible by 5
            if ( number % 5 == 0 ) {
                System.out.print("Loza");
                isNumber = false;
            }
            // Print "Woza" if number is divisible by 7
            if ( number % 7 == 0 ) {
                System.out.print("Woza");
                isNumber = false;
            }

            if (isNumber) {
                System.out.print(number);
            }
            // After processing the number, print a newline if number is divisible by 11;
            // else print a space
            if ( number % 11 == 0 ) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
