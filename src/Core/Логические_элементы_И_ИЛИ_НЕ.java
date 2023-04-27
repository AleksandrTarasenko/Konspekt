package Core;

public class Логические_элементы_И_ИЛИ_НЕ {
    public static void main(String[] args) {
        //И» (AND) &: конъюнкция, логическое умножение
        //true && true == true
        //false && false == false
        //true && false == false
        //false && true	 == false
        boolean d = true & false;
        System.out.println(d); //false

        //Включающее «ИЛИ» (OR) |: дизъюнкция, логическое сложение
        //true || true == true
        //false || false == false
        //true || false == true
        //false || true == true
        boolean d1 = true & false;
        System.out.println(d1); //false

        //Исключающее «ИЛИ» (XOR) ^: строгая дизъюнкция, логическое вычитание
        //true ^ true == false
        //false ^ false == false
        //true ^ false == true
        //false ^ true == true
        boolean d2 = true ^ false;
        System.out.println(d2); //true
        boolean d3 = true ^ true;
        System.out.println(d3); //false

        //«НЕ» (NOT) !: инверсия, отрицание
        //!true == false
        //!false == true
        boolean d4 = !true;
        System.out.println(d4); //false

        //Условное И &&; Условное ИЛИ ||

        /*&& и || называются сокращёнными логическими операторами AND и OR соответственно.
        // Разница с & и | заключается в том, что для операторов & и | всегда вычисляются значения обоих операндов,
        // а при работе операторов && и || второй операнд вычисляется только по необходимости.

        //Если первый операнд && равен false, то второй не вычисляется, так как уже понятно, что результат всего выражения будет false.
        //Если первый операнд || равен true, то второй не вычисляется, так как уже понятно, что || вернёт true.

        Приоритет логических операций
                !
                &
                ^
                |
                &&
                ||
*/
    }
}
