package Lamda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Privet"));
    }

    public static void main(String[] args) {
        int i =10;   //Переменная объявленная вне лямда выражения, м.б. использованна в нём
        // i=15; нельзя изменять переменную как до так и после так и в нутри ляимда, т.к. лямда выражение работать не будет
        //лучше испольовать final
        def((String s) -> {
            int a = 5; //переменая переданая в лямда выражение не видна за её пределами
            System.out.println(i);
            return s.length();
        });

        //System.out.println(s); //так работать не будет
        //System.out.println(a); //так работать не будет
        //def(() -> 18); //выражение может не принимать параметры если они неуказаны в интерфейсе,
        // тогда скобки () в левой половини обязательны
    }
}

interface I {
    int abc(String s);
}
