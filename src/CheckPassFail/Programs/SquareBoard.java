package CheckPassFail.Programs;

public class SquareBoard {
    public static void SquareBoard(){
        System.out.println("Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for-loops.");

        int size = 5;
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col<=size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

}
