package Map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Aleksandr Tarasenko");
        map1.put(1254, "Ivan Ivanov");
        map1.put(65556, "Mariya Sidorova");
        map1.put(95432, "Nikolay Petrov"); //если ключи разные, а значения одинаковые, HashMap сохранит оба значения
        map1.put(33262, "Nikolay Petrov");
        map1.put(1000, "Oleg Ivanov"); //если ключи одинаковые, а значения разные, HashMap перезапишет значение у ключа
        map1.put(null, "Сергей Петров"); //можно создать null ключ
        map1.put(865215, null); //можно создать null значение
        map1.putIfAbsent(1000, "Петр Сидоров"); // метод putIfAbsent добавление элемента в колекцию, если такого элемента нет
        System.out.println(map1);
        System.out.println(map1.get(1000)); //метод get вывод элемента по ключу
        map1.remove(1254); //метод remove удаляет элемент по ключу
        System.out.println(map1.containsValue("Mariya Sidorova")); //метод containsValue проверяет есть ли элемент по значению
        System.out.println(map1.containsKey(1000)); //метод containsKey проверяет есть ли элемент по ключу
        System.out.println(map1.keySet()); //метод keySet выдает множество ключей имеющихся в списке
        System.out.println(map1.values());//метод values выдает множество значений имеющихся в списке

        Map<String, String> map2 = new HashMap<>();//ключи могут быть однаковыми
        map2.put("Sasha", "Dobriy");



    }
}
