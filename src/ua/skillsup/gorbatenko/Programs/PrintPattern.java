package ua.skillsup.gorbatenko.Programs;

public class PrintPattern {
    public static void printPattern(){
        System.out.println("Print each of the followings patterns using nested loops.");

        int size = 8;
        String blackPixel = "# ";
        String whitePixel = "  ";
        String printPixel = "";
        String numberCase = "";

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if (row >= col){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (a)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if (row + col <= size + 1){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (b)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if (row <= col){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (c)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if (row + col >= size + 1){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (d)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if ((row == 1) | (row == size) | (col == 1) | (col == size)){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (e)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if ((row == 1) | (row == size) | (col == row)){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (f)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if ((row == 1) | (row == size) | (row + col == size + 1)){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (g)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if ((row == 1) | (row == size) | (col == row) | (row + col == size + 1)){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (h)\n");

        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                if ((row == 1) | (row == size) | (col == 1) | (col == size) | (col == row) | (row + col == size + 1)){
                    printPixel = blackPixel;
                }else {
                    printPixel = whitePixel;
                }
                System.out.print(printPixel);
            }
            System.out.println();
        }
        System.out.println("      (i)\n");
    }
}
