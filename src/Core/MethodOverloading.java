package Core;

public class MethodOverloading {
    /*
    Можно использовать методы с одним и тем же именем, но с разными типами и/или количеством параметров.
    Такой механизм называется перегрузкой методов (method overloading).
     */
    public class Program {
        public  void main(String[] args) {
            System.out.println(sum(2, 3));          // 5
            System.out.println(sum(4.5, 3.2));      // 7.7
            System.out.println(sum(4, 3, 7));       // 14
        }
        int sum(int x, int y) {
            return x + y;
        }
         double sum(double x, double y) {
            return x + y;
        }
         int sum(int x, int y, int z) {
            return x + y + z;
        }
        //Стоит отметить, что на перегрузку методов влияют количество и типы параметров.
        //Однако различие в типе возвращаемого значения для перегрузки не имеет никакого значения
    }
}
