package Annatation_Example;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("Annatation_Example.Xiaomi");
        // в параметрах указывается верное имя пакета, иначе исключение
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation into from Xiaomi class: " +
                sm1.OS() + ", " + sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("Annatation_Example.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation into from Iphone class: " +
                sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }
}
//
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // используется для рефлексии
@interface SmartPhone {
    String OS() default "Android"; // default - значение по умолчанию
    int yearOfCompanyCreation() default 2010;
    //можно массивы
    //нельзя ссылочные данные
}
@SmartPhone
class Xiaomi {
    String model;
    double price;
}
@SmartPhone (OS ="IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}