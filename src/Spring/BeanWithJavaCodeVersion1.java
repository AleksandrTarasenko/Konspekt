package Spring;

public class BeanWithJavaCodeVersion1 {
    /*
    Конфигурация Spring Container-а с помощью Java кода. Способ 1

    Аннотация @Configuration
    Аннотация @Configuration означает, что данный класс помеченный ею является конфигурацией.

    Аннотация @ComponentScan
    С помощью аннотации @ComponentScan мы показываем, какой пакет нужно сканировать на наличие бинов и разных аннотаций.

    @Configuration
    @ComponentScan("com.zaurtregulov.spring.spring_introduction")
        public class myConfig {
        }
------------------------------------------------------------------------------------------------------------------------
    Контейнер для записи с помощью Java кода будет представлен классом AnnotationConfigApplicationContext

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
    Person person = context.getBean("personBean", Person.class);
     */
}
