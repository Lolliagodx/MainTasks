import java.util.Scanner;

public class Maintask2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите значение, которое хотите перевернуть:");
        String znach = vvod.nextLine();
        StringBuilder reverse = new StringBuilder(znach);
       System.out.println ("Перевернутое значение:" + " " + reverse.reverse());


    }
}
