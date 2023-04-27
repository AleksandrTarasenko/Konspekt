package Core;

public class switch_case {
    public static void main(String[] args) {
        //Java 8
        //После ключевого слова switch в скобках идет сравниваемое выражение.
        // Значение этого выражения последовательно сравнивается со значениями, помещенными после операторов сase.
        // И если совпадение найдено, то будет выполнять соответствующий блок сase.
        int num = 8;
        switch(num) {
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");

        }
        //switch-выражения! с Java 12 и выше
        //новое ключевое слово yield синтаксис появился в Java 13
        //оператор или выражение (с Java 14)
        //двоеточия или стрелки (с Java 14)
        //метки или шаблоны (3-й превью в Java 19)
        //https://habr.com/ru/post/443464/
    }
}
