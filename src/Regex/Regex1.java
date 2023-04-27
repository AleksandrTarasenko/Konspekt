package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s
                = "Ivanov vasiliy, Russua, Moscow, Lenin street, 51, flat 48, email: vivanov@mai.ru. Postcode: AA99" +
                "Phone number: +123456789;" +
                "Petrova Mariya, Ucraine, Kiev. Lomonosov street, 33, flat 18, email: masha@yandex.ru, Postcode: UKR54" +
                "Phone number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, flat 21, email: chock@gmail.com, Postcode: USA23" +
                "Phone number: +136478952;";

        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
        Pattern pattern2 = Pattern.compile("\\+\\d{9}");
        Pattern pattern3 = Pattern.compile("\\w+@\\w+\\.\\w+");

        Matcher matcher = pattern3.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
