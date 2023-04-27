package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    //Параллельность стримов нужна с большими объемами данных
    //нужно перемножить (1мрд) 1 2 3 4 5...1,000,000,000
    //Если процессор многоядерный то модно указать процессору какие расчеты ему производить
    //первый процесор перемножай 1 - 250,000,000
    //Второй процессор 250,000,000 - 500,000,000
    //третий процессор 500,000,000 - 750,000,000
    //Четвертый процессор 750,000,000 - 1,000,000,000
    //в дальнейшем перемножение между собой
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        //В заданиях где порядок действий НЕ важен parallelStream использовать можно
        double sumRezalt = list.parallelStream()
                .reduce((accumulator, elrment) -> accumulator + elrment).get();
        System.out.println("sumRezalt = " + sumRezalt);

        //В заданиях где порядок действий важен parallelStream использовать нельзя, т.к значения будут не корректными
        double divisionRezalt = list.parallelStream()
                .reduce((accumulator, elrment) -> accumulator / elrment).get();
        System.out.println("divisionRezalt = " + divisionRezalt);
    }
}
