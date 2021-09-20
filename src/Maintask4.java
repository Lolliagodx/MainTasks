import java.util.Scanner;

public class Maintask4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("enter first number");

        int number1 = enter.nextInt();
        System.out.println("enter second number");
        int number2 = enter.nextInt();

        System.out.println("сумма двух чисел " + (number1 + number2));
        System.out.println("произведение двух чисел " + (number1 * number2));
    }
}
