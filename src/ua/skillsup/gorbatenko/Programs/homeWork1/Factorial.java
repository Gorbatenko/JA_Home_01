package ua.skillsup.gorbatenko.Programs.homeWork1;

public class Factorial {
    public static void factorial(){
        int n = 25;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("The Factorial of " + n + " is " + factorial);
        System.out.println("Факториал становится отрицательным на 17 шаге, из-за переполнения int.\n" +
                "Если переменную сделать long, то значение 20! будет корректным до 20! включительно.");
    }
}
