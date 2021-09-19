import java.util.Scanner;

public class Maintask5 {
//    int a =1; int b= 2; int c =3; int d =4; int e =5; int j = 6;
//    int  k=7; int l = 8; int m=9; int n=10; int o =11; int p=12;
    public static void main(String[] args) {
        int x = 0;
        while (x ==0){
        Scanner vvod = new Scanner(System.in);
            System.out.println("Введите числа от 1 до 12, чтобы узнать месяц");
            System.out.println();
            Integer mes = vvod.nextInt();
            switch (mes) {
                case 1:
                    System.out.println("Первый месяц - Январь");
                    break;
                case 2:
                    System.out.println("Второй месяц - Февраль");
                    break;
                case 3:
                    System.out.println("Третий месяц - Март");
                    break;
                case 4:
                    System.out.println("Четвертый месяц - Апрель");
                    break;
                case 5:
                    System.out.println("Пятый месяц - Май");
                    break;
                case 6:
                    System.out.println("Шестой месяц - Июнь");
                    break;
                case 7:
                    System.out.println("Седьмой месяц - Июль");
                    break;
                case 8:
                    System.out.println("Восьмой месяц - Август");
                    break;
                case 9:
                    System.out.println("Девятый месяц - Сентябрь");
                    break;
                case 10:
                    System.out.println("Десятый месяц - Октябрь");
                    break;
                case 11:
                    System.out.println("Одинадцатый месяц - Ноябрь");
                    break;
                case 12:
                    System.out.println("Двенадцатый месяц  - Декабрь");
                    break;
                default:
                    System.out.println("Чтобы узнать месяц введите числа от 1 до 12");
                    break;
            }




        }
    }
}