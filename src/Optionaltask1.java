import java.util.Scanner;

public class Optionaltask1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String numbers = enter.nextLine();
        String longWord = " ", shortWord = numbers;

        for (String s : numbers.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("Самое длинное слово: " + longWord );
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое слово: " + shortWord);
        System.out.println("Длина: " + shortWord.length());
    }
}