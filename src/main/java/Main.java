import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int secondNumber = new Scanner(System.in).nextInt();
        double quotient = (double) firstNumber/secondNumber;
        System.out.println("Результат деления введенных вами чисел: " + quotient);
        int sum = firstNumber + secondNumber;
        System.out.println("Результат сложения введенных вами чисел: " + sum);
        int subtraction = secondNumber - firstNumber;
        System.out.println("Результат вычитания введенных вами чисел: " + subtraction);
        int multiply = firstNumber * secondNumber;
        System.out.println("Результат умножения введенных вами чисел: " + multiply);

    }
}
