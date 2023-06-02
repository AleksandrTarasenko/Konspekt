package Spring;

public class BeanWithJavaCodeVersion2 {
    /*
    Конфигурация Spring Container-а с помощью Java кода. Способ 2
    Аннотация @Configuration
    Используется для создания конфиг файла для создания бинов в ручную

    • Данный способ не использует сканирование пакета и поиск бинов. Здесь бины описываются в конфиг классе.
    • Данный способ не использует аннотацию @Autowired. Здесь зависимости прописываются вручную.
    • Название метода – это bean id.
    • Аннотация @Bean перехватывает все обращения к бину и регулирует его создание.

    @Configuration
    public class myConfig {

        @Bean
        @Scope("singleton")  // или prototype (singleton не прописывается, по умолчанию @Scope = singleton)
        public Pet catBean() {
            return new Cat();
        }
    }
        @Bean
        public Person personBean() {
            return new Person(catBean());
    }
------------------------------------------------------------------------------------------------------------------------
    Аннотация @PropertySource
    Аннотация @PropertySource указывает на property файл откуда мы можем использовать значения для полей

    @Configuration
    @PropertySource("classpath:myApp.properties")
    public class myConfig {
     */
}
