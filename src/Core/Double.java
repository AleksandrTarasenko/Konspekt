package Core;

public class Double {

    public static boolean doubleExpression(double a, double b, double c) {
        final double threshold = 0.0001;
        // threshold - данная переменная позволяет ограничивать допустимую погрешность с double числами
        if (Math.abs((a + b) - c) < threshold) {
            //методом Math.abs приводим значение по модулю отнимает требуемые значения для сравнения
            // если результат меньше переменной threshold, то числа считаются одинаковыми по округлению до числа threshold
            //иначе числа считаются разными
            return true;
        } else {
            return false;
        }
    }
}
