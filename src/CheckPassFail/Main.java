package CheckPassFail;

import CheckPassFail.Programs.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        CheckPassFail checkPassFail = new CheckPassFail();
        CheckOddEven checkOddEven = new CheckOddEven();
        PrintNumberInWord printNumberInWord = new PrintNumberInWord();
        PrintDayInWord printDayInWord = new PrintDayInWord();
        SumAndAverage sumAndAverage = new SumAndAverage();
        Product1ToN product1ToN = new Product1ToN();

        boolean isWork = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Menu:");
            System.out.println("1. CheckPassFail");
            System.out.println("2. CheckOddEven");
            System.out.println("3. PrintNumberInWord");
            System.out.println("4. PrintDayInWord");
            System.out.println("5. SumAndAverage");
            System.out.println("6. Product1ToN");
            System.out.println("0. exit");

            String s = reader.readLine();
            switch (s) {
                case "1":
                    checkPassFail.CheckPassFail();
                    break;
                case "2":
                    checkOddEven.CheckOddEven();
                    break;
                case "3":
                    printNumberInWord.PrintNumberInWord();
                    break;
                case "4":
                    printDayInWord.PrintDayInWord();
                    break;
                case "5":
                    sumAndAverage.SumAndAverage();
                    break;
                case "6":
                    product1ToN.Product1ToN();
                    break;
                case "0":
                    isWork = false;
                    break;
                default:
                    System.out.println("Пожалуйста, выберите один из пунктов меню. \nВводите только цифры.\n");
                    break;
            }
        } while (isWork);

    }

}
