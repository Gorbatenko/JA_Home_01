package ua.skillsup.gorbatenko;

import ua.skillsup.gorbatenko.Programs.homeWork1.*;
import ua.skillsup.gorbatenko.Programs.homeWork2.MyArrаyLіst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean isWork = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. CheckPassFail       7. HarmonicSum.    13. SquareBoard.   ||  18. MyArrаyLіst.\n" +
                    "2. CheckOddEven.       8. ComputePI.      14. CheckerBoard.\n" +
                    "3. PrintNumberInWord.  9. CozaLozaWoza.   15. TimeTable.(not work)\n" +
                    "4. PrintDayInWord.    10. Fibonacci.      16. PrintPattern.\n" +
                    "5. SumAndAverage.     11. Tribonacci.     17. Factorial.\n" +
                    "6. Product1ToN.       12. ExtractDigits.\n" +
                    "0. Exit");

            String s = reader.readLine();
            switch (s) {
                case "1": CheckPassFail.checkPassFail(); break;
                case "2": CheckOddEven.checkOddEven();   break;
                case "3": PrintNumberInWord.printNumberInWord();  break;
                case "4": PrintDayInWord.printDayInWord();        break;
                case "5": SumAndAverage.sumAndAverage(); break;
                case "6": Product1ToN.product1ToN();     break;
                case "7": HarmonicSum.harmonicSum();     break;
                case "8": ComputePI.computePI();         break;
                case "9": CozaLozaWoza.cozaLozaWoza();   break;
                case "10": Fibonacci.fibonacci();        break;
                case "11": Tribonacci.tribonacci();      break;
                case "12": ExtractDigits.extractDigits();break;
                case "13": SquareBoard.squareBoard();    break;
                case "14": CheckerBoard.checkerBoard();  break;
                case "15": TimeTable.timeTable();        break;
                case "16": PrintPattern.printPattern();  break;
                case "17": Factorial.factorial();        break;
                case "18": MyArrаyLіst.myArrаyLіst();    break;
                case "0": isWork = false;                break;
                default:
                    System.out.println("Пожалуйста, выберите один из пунктов меню. \nВводите только цифры.\n"); break;
            }
        } while (isWork);

    }

}