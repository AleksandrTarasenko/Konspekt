package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
//  \\reduce//
        //первый способ использования
        //аккумулирует и возвращает в себя новое значение расчетов в лямдавыражении, пока не пройдет по всему списку листа
        // reduce - является eager(игр) методом (действующий сразу) и завершает работу стрима
        int rezult = list.stream().reduce((accumulator, element) ->
                accumulator * element).get(); // метод get в конце лямда выражения ОБЯЗАТЕЛЕН
        //reduce возвращает Optional - что бы получить значение из Optional необходимо использовать метод get
        //Optional оборачивает значение входящее из List (<Integer>) и явл контейнером хранения данных в своем виде
        //Optional может содержать null и not-null значения
        System.out.println(rezult);
        //5,8,2,4,3, значения в стриме
        //1.при создании потока, accumulator принимает первое значение из потока стрима accumulator = 5
        //2.Второе значение из потока стрима присваевется element = 8
        //3.производится действие в лямда accumulator * element и результат возвращается в accumulator == 40
        //1. accumulator принимает значение  = 40
        //2. element присвает новое значение = 2
        //3. производится действие в лямда accumulator * element и результат возвращается в accumulator == 80
        //...
        //3. производится действие в лямда accumulator * element и результат возвращается в accumulator == 960
        // 4. результат передается в метод get

        //Второй способ использования (Добавление первого присвоения значения accumulator)(НЕ МОЖЕТ БЫТЬ null)
        int rezult2 = list.stream().reduce(1,(accumulator, element) -> //добавлен первый параметр (значение 1)
                accumulator * element); //метод get не нужен, на выходе получаем Integer
        System.out.println(rezult2);
        //5,8,2,4,3, значения в стриме
        //1.при создании потока, accumulator принимает первое значение из параметра = 1
        //2.Первое значение из потока стрима присваевется element = 5
        //3.производится действие в лямда (accumulator * element) и результат возвращается в accumulator == 5
        //1. accumulator принимает значение  = 5
        //2. element присвает новое значение = 8
        //3. производится действие в лямда accumulator * element и результат возвращается в accumulator == 40
        //...
        //3. производится действие в лямда accumulator * element и результат возвращается в accumulator == 960
        // 4. результат передается в метод get


//  \\isPresent//
//        Можно проверить значение на null и not-null и выводить результать
        //для этого создаем переменную вида Optional<Integer>(или String), и выводим полученое значение через метод get
        Optional<Integer> o = list.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (o.isPresent()) { // метод isPresent - присутсвует значение или нет?
            System.out.println(o.get());
        }
        else System.out.println("Not Present. It is null");


        //пример со String
        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");
        String rezalt3 = list3.stream().reduce((a, e) ->
                a + " " + e).get();
        System.out.println(rezalt3);
        //privet, kak dela?,OK,poka - значения в стриме
        //1.при создании потока, a принимает первое значение из потока стрима a = privet
        //2.Второе значение из потока стрима присваевется e = 8 kak dela?
        //3.производится действие в лямда a + " " + e и результат возвращается в accumulator == privet kak dela?
        //1. accumulator принимает значение  = privet kak dela?
        //2. element присвает новое значение = OK
        //3. производится действие в лямда a + " " + e и результат возвращается в accumulator == privet kak dela? OK
        //...
        //3. производится действие в лямда a + " " + e и результат возвращается в accumulator == privet kak dela? OK poka
        // 4. результат передается в метод get
    }
}
