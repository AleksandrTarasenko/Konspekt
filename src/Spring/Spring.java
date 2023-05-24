package Spring;

public class Spring {
    /*
    Документация по Spring
    https://docs.spring.io/spring-framework/reference/index.html

    Основные функции, которые выполняет Spring Container:
    1. IoC (Inversion of Control)– инверсия управления  Создание и управление объектам
    2. DI – Dependency Injection Внедрение зависимостей
    -------------------------------------------------------------------------------------------------------------------
    IoC (Inversion of Control)
    IoC – аутсорсинг создания и управления объектами. Т.е. передача программистом прав на создание и управление объектами Spring-у.

    Способы конфигурации Spring Container:
    • XML file (устаревший способ)
    • Annotations + XML file (современный способ)
    • Java code (современный способ)

    • XML file
    Конфигурация XML файла:
        <bean id = "myPet"
          class = "com.zaurtregulov.spring.spring_introduction.Dog">
    </bean>
    • id – идентификатор бина
    • class – полное имя класса
    Spring Bean (или просто bean) – это объект, который создаётся и управляется Spring Container

    Для извлечения Bean необходимо создать Spring Container
    ApplicationContext представляет собой Spring Container.
    Поэтому для получения бина из Spring Container нам нужно создать ApplicationContext.
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Pet pet = context.getBean("myPet", Pet.class);
    //pet.say();
    context.close();
--------------------------------------------------------------------------------------------------------------------

    DI – Dependency Injection Внедрение зависимостей
    DI – аутсорсинг добавления/внедрения зависимостей.
    DI делает объекты нашего приложения слабо зависимыми друг от друга.

    Способы внедрения зависимостей:
    • С помощью конструктора
    • С помощью сеттеров
    • Autowiring
    -------------------------------------------------------------------------------------------------
    • С помощью конструктора
    <bean id = "myPet"
          class = "com.zaurtregulov.spring.spring_introduction.Dog">
    </bean>

    <bean id="myPerson"
          class="com.zaurtregulov.spring.spring_introduction.Person">
        <constructor-arg ref="myPet"/>
    </bean>
         • constructor-arg – аргумент конструктора
         • ref – ссылка на bean id
-----------------------------------------------------------------------------------------------------------
     • С помощью сеттеров
       <bean id = "myPet"
          class = "com.zaurtregulov.spring.spring_introduction.Dog">
        </bean>

         <bean id="myPerson"
          class="com.zaurtregulov.spring.spring_introduction.Person">
            <property name="pet" ref="myPet"/>
         </bean>
         Первая буква в слове «pet» становится заглавной и в начало слова
        добавляется «set». После чего вызывается получившийся метод.
---------------------------------------------------------------------------------------------------------
    • Внедрение строк и других значений
    <bean id="myPerson"
            class="com.zaurtregulov.spring.spring_introduction.Person">
        <property name="surname" value="Tarasenko"/>
        <property name="age" value="40"/>
    </bean>
    • value – значение, которое мы хотим присвоит
---------------------------------------------------------------------------------------------------
    • Внедрение строк и других значений из properties файла:
        Создать properties файл (myApp.properties) (файл с расширением properties)  в папке resources
        прописать значения данных которые мы будем вносить в конфиг файл
        person.surname = Tarasenko
        person.age = 40
        Показать в конфиг файле что это за файл через коменду перевсеми бинами
         <context:property-placeholder location="classpath:myApp.properties"/>
         и использовать написание ${person.surname} в бине вместо фиксированных значений

        <bean id="myPerson"
          class="com.zaurtregulov.spring.spring_introduction.Person">
            <property name="surname" value="${person.surname}"/>
            <property name="age" value="${person.age}"/>
         </bean>
     */
}
