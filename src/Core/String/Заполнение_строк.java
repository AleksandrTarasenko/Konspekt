package Core.String;

public class Заполнение_строк {
    //Класс String в Java не предоставляет удобного метода заполнения,
    // поэтому давайте создадим несколько методов самостоятельно.

    //Мы можем достичь этого с помощью StringBuilder и некоторой процедурной логики:
    public String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();

        //Другой способ сделать заполнение слева — создать строку нужной длины,
        // содержащую только символы заполнения, а затем использовать метод substring():
//        StringBuilder sb2 = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            sb2.append(' ');
//        }
//        return sb.substring(inputString.length()) + inputString;
    }


}
