package Stream;

import java.util.stream.Stream;

public class DistinctCountPeek {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        // stream не может быть обработан дважды, его нельзя переиспользовать

//\\distinct// - Выводит только уникальные значения
        //stream1.distinct().forEach(System.out::println); // может быть вставлен в середину к другим Lazy методам Stream
//  \\count// - Считает кольчиство элементов
        //System.out.println(stream1.count()); //count - явл окончательным eager(игр) методом

//        System.out.println(stream1.distinct().count()); //счет уникальных знач
//  \\peek// - Позволяет просматривать операции в нутри стрима к примеру Chaining. Возвращает stream
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
}
