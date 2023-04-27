package Core;

import java.math.BigInteger;

public class BigIntegerBigDecimalEx {
    //BigInteger
    //BigInteger.valueOf(int) - преобразует int в String

    //BigInteger add(BigInteger other): возвращает сумму двух чисел
    //BigInteger subtract(BigInteger other): возвращает разность двух чисел
    //BigInteger multiply(BigInteger other): возвращает произведение двух чисел
    //BigInteger divide(BigInteger other): возвращает частное двух чисел
    //BigInteger mod(BigInteger other): возвращает остаток от целочисленного деления двух чисел
    //BigInteger sqrt(): возвращает квадратный корень числа
    //int compareTo(BigInteger other): сравнивает два числа. Возвращает -1, если текущий объект меньше числа other, 1 - если текущий объект больше и 0 - если числа равны
    //static BigInteger valueOf(long x): возвращает объект BigInteger, значение которого равно числу, переданному в качестве параметра
    //int intValue(): конвертирует объект BigInteger в объект int
    //byte byteValue(): преобразует объект BigInteger в byte
    //short shortValue(): преобразует объект BigInteger в short
    //long longValue(): преобразует объект BigInteger в long

       public static void maxLongSqr() {
        long l = Long.MAX_VALUE;
        BigInteger bid = BigInteger.valueOf(l);
        bid = bid.multiply(bid);
        System.out.println(bid);
       }
    //факториал числа
    public static BigInteger factorial(int value) {
        BigInteger bi = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++ ) {
            BigInteger b = BigInteger.valueOf(i);
            bi = bi.multiply(b);
        }
        return bi;
    }
    //факториал числа через рекурсию
    public static BigInteger factorial2(int value2) {
        if (value2 <= 1) {
            return BigInteger.valueOf(1);
        }
        else {
            return BigInteger.valueOf(value2).multiply(factorial2(value2 - 1)); //здесь через цикл всегда вызывается метод повторно
        }
    }


    //BigDecimal
    //BigDecimal add(BigDecimal other): возвращает сумму двух чисел
    //BigDecimal subtract(BigDecimal other): возвращает разность двух чисел
    //BigDecimal multiply(BigDecimal other): возвращает произведение двух чисел
    //BigDecimal divide(BigDecimal other): возвращает частное двух чисел
    //BigDecimal divide(BigDecimal other, RoundingMode mode): результат деления двух чисел, округленное в соответствии с режимом mode
    //int compareTo(BigDecimal other): сравнивает два числа. Возвращает -1, если текущий объект меньше числа other, 1 - если текущий объект больше и 0 - если числа равны
    //static BigDecimal valueOf(double x): возвращает объект BigDecimal, значение которого равно числу, переданному в качестве параметра
    //double doubleValue(): преобразует объект BigDecimal в double
    //float floatValue(): преобразует объект BigDecimal в float
}
