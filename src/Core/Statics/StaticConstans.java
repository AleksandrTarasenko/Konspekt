package Core.Statics;

public class StaticConstans {
    //Также статическими бывают константы, которые являются общими для всего класса.

}
 class Program{
    public static void main(String[] args) {
        double radius = 60;
        System.out.printf("Radisu: %f \n", radius);             // 60
        System.out.printf("Area: %f \n", Math.PI * radius);     // 188,4
    }
}
class Math{
    public static final double PI = 3.14;
}
/*
 В частности, в выражении:
System.out.println("hello");
out - как раз представляет статическую константу класса System.
Поэтому обращение к ней идет без создания объекта класса System.
 */