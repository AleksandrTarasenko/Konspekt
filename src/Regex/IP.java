package Regex;

import java.util.regex.Pattern;

public class IP {
    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+"(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + "is OK? " + Pattern.matches(regex, ip));
        //25[0-5]    |  2[0-4]\d | [01]?\d?\d  (\.)                 {3}                 25[0-5] | 2[0-4]\d | [01]?\d?\d
        //250 - 255  | 200 - 249 | 0 - 199       .(точка)  Проверяем условие 3 раза     Проверяем условие еще раз, но не ставим точку в конце
    }
    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        IP ip = new IP();
        ip.checkIP(ip1);
        ip.checkIP(ip2);
    }
}
