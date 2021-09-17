import java.sql.SQLOutput;
import java.util.Scanner;

public class Maintask1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = vvod.nextLine();
        System.out.println("Добро пожаловать" +" " + name);

    }
}
