package Core.String;

 class StringEx {
    //Для создания новой строки мы можем использовать один из конструкторов класса String,
    // либо напрямую присвоить строку в двойных кавычках:

    //все объекты класса String виртуальная машина хранит в пуле строк.

    //Основные плюсы неизменности строк:

    //1. Можно передавать строку между потоками, не опасаясь, что она будет изменена.
    //2. Отсутствуют проблемы с синхронизацией потоков.
    //3. Отсутствуют проблемы с утечкой памяти.
    //4. Отсутствуют проблемы с доступом и безопасностью при использовании строк для передачи параметров авторизации, открытия файлов и т. д.
    //5. Кэширование hashcode.
    //6. Экономия памяти при использовании пула строк для хранения повторяющихся строк.

    //Преобразование объектов других классов к строковому представлению выполняется через неявный вызов метода toString у объекта.

     //String уступает массиву char в безопасности хранения данных.

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
        //3 - начальный индекс, 4 - кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //пустая строка
        System.out.println(str3); // hello
        System.out.println(str4); // come

        //длина строки length()
        String str5 = "Java";
        System.out.println(str5.length()); // 4

        //toCharArray() можно обратно преобразовать строку в массив символов:
        String str6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str6.toCharArray();

        //Строка может быть пустой. Для этого ей можно присвоить пустые кавычки или удалить из стоки все символы:
        String s = "";   // пустая строка
        if (s.length() == 0) {
            System.out.println("String is empty");//В этом случае длина строки, возвращаемая методом length(), равна 0.
        }
        //isEmpty(). Если строка пуста, он возвращает true:
        String s4 = "";   // пустая строка
        if (s.isEmpty()) {
            System.out.println("String is empty");
        }
        //String может не указывать на какой-либо объект и иметь значение null:
        String s2 = null;   // строка не указывает на объект
        if (s == null) {
            System.out.println("String is null");
        }
        //Значение null не эквивалентно пустой строке. Например, в следующем случае мы столкнемся с ошибкой выполнения:
        String s3 = null;   // строка не указывает на объект
        if (s.length() == 0) { // ! Ошибка
            System.out.println("String is empty");
        }
        //Так как переменная не указывает ни на какой объект String, то соответственно мы не можем обращаться к методам объекта String. Чтобы избежать подобных ошибок, можно предварительно проверять строку на null:
        String s6 = null;   // строка не указывает на объект
        if (s == null || s.length() == 0) {
            System.out.println("String is empty");
        }
        // метод split можно ограничить по количеству выходного количества массива при разделении
        String str = "Hello, world it's Amigo!";
        String[] arr = str.split(" ", 2); // 2 - limit — максимально допустимое значение получаемого массива.
        for (String s9 : arr) {
            System.out.println(s);
        }
    }
}
//Преобразование объектов других классов к строковому представлению выполняется через неявный вызов метода toString у объекта
 class StringExamples {
    public static void main(String[] args) {
        Human max = new Human("Макс");
        String out = "Java объект: " + max;
        System.out.println(out);
        // Вывод: Java объект: Человек с именем Макс
    }

    static class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Человек с именем " + name;
        }
    }
}

class V {
    //Сравнение строк
        public static void main(String[] args) {
        String x = "Test String";
        // Для сравнения строк можно воспользоваться методом equals():
        System.out.println("Test String".equals(x)); // true

        // Когда при сравнении строк нам не важен регистр, нужно использовать метод equalsIgnoreCase():
        System.out.println("test string".equalsIgnoreCase(x)); // true

        //Для перевода экземпляра любого Java-класса или любого примитивного типа данных к строковому представлению,
            // можно использовать метод String.valueOf():
            String a = String.valueOf(1);
            String b = String.valueOf(12.0D);
            String c = String.valueOf(123.4F);
            String d = String.valueOf(123456L);
            String s = String.valueOf(true);
            //String human = String.valueOf(new Human("Alex"));
    }
}
