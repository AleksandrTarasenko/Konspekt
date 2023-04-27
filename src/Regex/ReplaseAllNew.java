package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaseAllNew {
    public static void main(String[] args) {
        //Имеется набор цифр банковской карты месяц/год и CVC-код в одной строке без пробелов
        //которые представляют собой 1234 5678 9123 4567 03/25 951 (№ банк карты, месяц/год, CVC-код)
        String myString = "12345678912345670325951;" +
                "98765432136985211226521;" +
                "47589562148632581027654;";
        //нужен вывод
        //месяц/год, № банковской карты, CVC-код
        //03/25 1234 5678 9123 4567 (951)
        Pattern pattern= Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        //Выражения взятые в круглые скобки являются группами
        Matcher matcher = pattern.matcher(myString);

        //можно преобразовать через matcher.replaceAll через $№ группы в новый формат,
        // данные по группам от Pattern.compile regex
//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);

        while (matcher.find()) {
            // если group без аргумента, то вывод полный
            // если в качестве аргумента предать группу 7, то покажется инф-я только 7 группы CVC-код
            System.out.println(matcher.group(7));
        }


    }
}
