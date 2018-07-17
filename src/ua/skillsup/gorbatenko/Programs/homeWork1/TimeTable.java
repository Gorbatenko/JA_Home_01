package ua.skillsup.gorbatenko.Programs.homeWork1;

public class TimeTable {

    public static void timeTable(){
        System.out.println("Write a program called TimeTable to produce the multiplication table" +
                " of 1 to 9 as shown using two nested for-loops:");

        int size = 9;
        int product;
        String tab = " ";

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                product = row * col;
                    if (size <= 3) {
                        tab = " ";
                    } else if (3 <= size & size < 10) {
                        if (product <= 9) {
                            tab = "  ";
                        } else {
                            tab = " ";
                        }
                    } else if (size >= 10 & size < 32) {
                        if (product <= 9) {
                            tab = "   ";
                        } else if (product > 9 & product <= 99) {
                            tab = "  ";
                        } else {
                            tab = " ";
                        }
                    }
                    System.out.printf("%s%d", tab, product);
                    if (col % size == 0) {
                        System.out.println();
                    }

            }
        }
        System.out.println();
        product = 0;
        for (int row = 1; row <= size + 2; row++) {
            for (int col = 1; col <= size; col++) {
                product = Math.abs(row - 2) * col;
                if (size <= 3) {
                    tab = " ";
                } else if (3 <= size & size < 10) {
                    if (product <= 9) {
                        tab = "  ";
                    } else {
                        tab = " ";
                    }
                } else if (size >= 10 & size < 32) {
                    if (product <= 9) {
                        tab = "   ";
                    } else if (product > 9 & product <= 99) {
                        tab = "  ";
                    } else {
                        tab = " ";
                    }
                }
                if (col == 1) {
                    System.out.printf("%s%d |", tab, Math.abs(row - 2));
                }
                if (row == 2){
                }
                System.out.printf("%s%d", tab, product);
                if (col % size == 0) {
                    System.out.println();
                }

            }
        }
    }
}
