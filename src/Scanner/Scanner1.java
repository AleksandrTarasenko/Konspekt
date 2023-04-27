package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); //in - input stream - входящий поток
//        System.out.println("Введите число");
//        int i = scanner.nextInt(); // nextInt - следующее число
//        System.out.println("Введенное число " + i);

//        System.out.println("Напишите 2 числа");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное = " + x / y);
//        System.out.println("Остаток = " + x % y);

//        System.out.println("Напишите пару слов");
//        String s = scanner.nextLine(); // nextLine - Следующая строка
//        System.out.println("Вы наприсали " + s);

//        String s1 = scanner.next(); // считывает значение до первого пробела
//        System.out.println(s1);
        Scanner scanner = new Scanner("Privet moy drug!\nKak dela\nKak pojivaes");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        while (scanner.hasNextLine()) { // есть еще строка?
//            System.out.println(scanner.nextLine());
        System.out.println(scanner.next().charAt(2));
        }

}
