package Regex;

public class PrintfAndFormat {
    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t Hello %-12s \t %-12s \t %,.1f \n"
                ,emp.id, emp.name, emp.surename, emp.salary*(1+ emp.bonusPst));
        /*
        шаблон спецификатора формата
        %[flags][width][.precision]datatype_specifier
        % и datatype_specifier - обязательные поля
        нужно соблюдать очередность
        flags - флаги
        «-» выравнивание по левому краю
        «0» добавление нулей перед числом
        «,» разделитель разрядов в числах
        width - мин кол символов для текста
        .precision - точность (округление дробных чисел)
        datatype_specifier - спецификатор типа данных
        «b» boolean, «c» character, «d» целое число, «f» десятичное число
        */
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Aleksandr", "Tarasenko", 423456, 0.15);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6456, 0.08);
        Employee emp3 = new Employee(1, "Mariya", "Sidorova", 8556, 0.12);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);
        // в первом параметре указываем как выводить
        // Стринг нужно выровнять по левому краю,
        // double нужно округлить до десятых

        String newString = String.format("%03d \t Hello %-12s \t %-12s \t %,.1f"
                ,1 ,"Aleksandr", "Tarasenko", 423456*(1+0.15));
        System.out.println(newString);
    }
}

class Employee {
    int id;
    String name;
    String surename;
    int salary;
    double bonusPst;

    public Employee(int id, String name, String surename, int salary, double bonusPst) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.salary = salary;
        this.bonusPst = bonusPst;
    }
}