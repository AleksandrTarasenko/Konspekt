package Regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        /*
        public boolean matches (String regex)
        Соответствует ли String регулярному выражению

        public String [] split (String regex)
        Делит по рег выражению
         */
        String s
                = "Ivanov vasiliy, Russua, Moscow, Lenin street, 51, flat 48, email: vivanov@mai.ru. Postcode: AA99" +
                "Phone number: +123456789;" +
                "Petrova Mariya, Ucraine, Kiev. Lomonosov street, 33, flat 18, email: masha@yandex.ru, Postcode: UKR54" +
                "Phone number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, flat 21, email: chock@gmail.com, Postcode: USA23" +
                "Phone number: +136478952;";
        String s2 = "chock@gmail.com";
        boolean rezult = s2.matches("\\w+@\\w+\\.\\w+"); //matches
        System.out.println(rezult);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));

    }
}
