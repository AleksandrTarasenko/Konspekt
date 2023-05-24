package Spring;

public class BeanWithAnnotation {
    /*
    Аннотации – это специальные комментарии/метки/метаданные, которые нужны для передачи определённой информации.

    Конфигурация с помощью аннотаций более короткий и быстрый способ, чем конфигурация с помощью XML файла.

    Аннотация @Component

    Процесс состоит из 2-х этапов:
    1. сканирование классов и поиск аннотации @Component
    2. Создание (регистрация) бина в Spring Container-е

    Создается xml файл и прописывается следующая команда в нем (applicationContext3.xml)
    <context:component-scan base-package="com.zaurtregulov.spring.spring_introduction"/>
    Здесь:
    component-scan это имя анотации которую нужно сканировать
    base-package это имя папки ниже по иерархии папки java которую нужно сканировать (вложенные папки сканируются автоматич.)

    В классе где нужно создать Bean, перед наименованием класса, указать анотацию и нужное имя бина
    @Component("catBean")

    импорт должен произойти самостоятельно
    import org.springframework.stereotype.Component;
    однако его нужно проверять что он подтянулся

    теперь в классе с методом main так же создается экземпляр ClassPathXmlApplicationContext и создается объект Cat через Bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        context.close();

    Если к аннотации @Component не прописать bean id, то бину будет назначен дефолтный id.
    Дефолтный bean id получается из имени класса, заменяя его первую заглавную букву на прописную.
    Если в имени класса ДВе и более заглавных букв в начале имени класса, то имя бина совпадает с именем класса
       @Component
        public class Cat {
        Создастся бин с имененм cat

        @Component
        public class SQLTest
        Создастся бин с имененм SQLTest
------------------------------------------------------------------------------------------------------------------------
    Анотация @Autowired
    Для внедрения зависимостей с помощью аннотаций используется аннотация @Autowired

    Типы autowiring-а или где мы можем использовать данный DI:
    • Конструктор
    • Сеттер
    • Поле

    • Конструктор
    Процесс внедрения зависимостей при использовании @Autowired
    1. Сканирование пакета, поиск классов с аннотацией @Component
    2. При наличии аннотации @Autowired начинается поиск подходящего по типу бина
    Далее ситуация развивается по одному из сценариев:
     Если находится 1 подходящий бин, происходит внедрение зависимости;
     Если подходящих по типу бинов нет, то выбрасывается исключение;
     Если подходящих по типу бинов больше одного, тоже выбрасывается исключение.
    @Component("personBean") (Класс где находится анотация @Autowired должен содержать анотацию @Component)
    public class Person {...
        ...
    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
         }
    }
---------------------------------------------------------------------------------------------------------------------
    • Сеттер
    public class Person {...
        ...
    @Autowired
    public void setPet(Pet pet) { (метод может быть любым)
        System.out.println("Class person set pet");
        this.pet = pet;
    }
    -----------------------------------------------------------------------------------------------------------------
    • Поле
    @Component("personBean")
        public class Person {...
    @Autowired
    private Pet pet;
    ....

     Анотация @Qualifier
    Если при использовании @Autowired подходящих по типу бинов больше одного, то выбрасывается исключение.
    Предотвратить выброс данного исключения можно конкретно указав, какой бин должен быть внедрён.
    Для этого и используют аннотацию @Qualifier

    Для поля
    @Component("personBean")
        public class Person {...
    @Autowired
    @Qualifier("dog")
    private Pet pet;
    ...

    для Setter
    @Component("personBean")
    public class Person {...

    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class person set pet");
        this.pet = pet;
    }

    для Конструктора
    @Component("personBean")
    public class Person {...

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
    --------------------------------------------------------------------------------------------------------------
    Анотация @Value
    Для внедрения строк и других значений можно использовать аннотацию @Value.
    В этом случае в сеттерах нет необходимости, как это было при конфигурации с помощью XML файла.

    HardCoded
    @Value("Tarasenko")
    private String surname;
    @Value("40")
    private int age;

    Вариант с properties файлом
    в applicationContext прописываем
    <context:property-placeholder location="classpath:myApp.properties"/>
    где myApp.properties  - properties файл
    в properties файле прописываем имя и значение
        person.surname = Tarasenko
        person.age = 40
    в классе к полям прописываем
        @Value("${person.surname}")
        private String surname;
        @Value("${person.age}")
        private int age;
------------------------------------------------------------------------------------------------------------------------
    Анотация @scope
    @Scope("singleton")
    @Scope("prototype")

    Если у бина scope = prototype, то:
    • init-method будет вызываться для каждого новосозданного бина.
    • для этого бина destroy-method вызываться не будет
    • программисту необходимо самостоятельно писать код для закрытия/освобождения ресурсов, которые были использованы в бине
------------------------------------------------------------------------------------------------------------------------
    Анотации @PostConstruct (init-method) и @PreDestroy (destroy-method)
    Необходимы для реализации методов init и destroy
    @Component
    public class Dog implements Pet{
    ...
        @PostConstruct
        public void init() {
            System.out.println("Class Dog: init method");
        }
        @PreDestroy
        public void destroy() {
            System.out.println("Class Dog: destroy method");
        }
    }
     */

}
