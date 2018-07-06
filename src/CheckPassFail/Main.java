package CheckPassFail;

import CheckPassFail.Programs.*;

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
            System.out.println("1. CheckPassFail\n" +
                    "2. CheckOddEven.\n" +
                    "3. PrintNumberInWord.\n" +
                    "4. PrintDayInWord.\n" +
                    "5. SumAndAverage.\n" +
                    "6. Product1ToN.\n" +
                    "7. HarmonicSum.\n" +
                    "8. ComputePI.\n" +
                    "9. CozaLozaWoza.\n" +
                    "10. Fibonacci.\n" +
                    "11. Tribonacci.\n" +
                    "12. ExtractDigits.\n" +
                    "0. Exit");

            String s = reader.readLine();
            switch (s) {
                case "1": CheckPassFail.CheckPassFail(); break;
                case "2": CheckOddEven.CheckOddEven();   break;
                case "3": PrintNumberInWord.PrintNumberInWord();  break;
                case "4": PrintDayInWord.PrintDayInWord();        break;
                case "5": SumAndAverage.SumAndAverage(); break;
                case "6": Product1ToN.Product1ToN();     break;
                case "7": HarmonicSum.HarmonicSum();     break;
                case "8": ComputePI.ComputePI();         break;
                case "9": CozaLozaWoza.CozaLozaWoza();   break;
                case "10": Fibonacci.Fibonacci();        break;
                case "11": Tribonacci.Tribonacci();      break;
                case "12": ExtractDigits.ExtractDigits();break;
                case "0": isWork = false;                break;
                default:
                    System.out.println("Пожалуйста, выберите один из пунктов меню. \nВводите только цифры.\n"); break;
            }
        } while (isWork);

    }

}
