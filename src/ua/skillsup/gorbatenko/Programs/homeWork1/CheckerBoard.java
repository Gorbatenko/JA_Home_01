package ua.skillsup.gorbatenko.Programs.homeWork1;

public class CheckerBoard {

    public static void checkerBoard(){
        System.out.println("Write a program called CheckerBoard that displays the following n×n (n=7) checkerboard pattern using two nested for-loops.");

        int size = 7;

        for (int row = 1; row <= size; row++) {

            if ((row % 2) == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
                if (col % size == 0) {
                    System.out.println();
                }
            }
        }
    }

}
