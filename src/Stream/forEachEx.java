package Stream;

import java.util.Arrays;

public class forEachEx {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//  \\forEach//
//        возвращает void (т.е. выводим только через System.out.println)
        //forEach - является eager(игр) методом (действующий сразу) и завершает работу стрима
        Arrays.stream(array).forEach(el->{el*=2;
            System.out.println(el);});
        Arrays.stream(array).forEach(el -> System.out.println(el));
        Arrays.stream(array).forEach(System.out::println); //метод reference, ссылка на метод. (::) -два двоеточия
        //мы даем ссылку на наш метод в println и джава понимает что нужно вывести по очереди все элементы из stream
        // до :: указываем класс(System.out), после :: указываем метод (println)
        Arrays.stream(array).forEach(Utils::myMethod);//кортокая запись
        Arrays.stream(array).forEach(el->Utils.myMethod(el));//длинная запись

        //каждый элемент потока передай в класс Utils и используй метод myMethod
        //можно подставлять в метод только те данные которые соответствуют этому методу
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = "+ a);
    }
}