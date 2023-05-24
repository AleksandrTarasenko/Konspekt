package Spring;

public class BeanScope {
    /*
    Scope (область видимости) определяет:
        • жизненный цикл бина
        • возможное количество создаваемых бинов

        Разновидности bean scope:
        singletone ()
        prototype

        для web:
        request
        session
        global-session
------------------------------------------------------------------------------------------------------------------
    singletone – дефолтный scope.
    • такой бин создаётся сразу после прочтения Spring Container-ом конфиг файла.
    • является общим для всех, кто запросит его у Spring Container-а.
    • подходит для stateless объектов (состояние который менять не нужно) .
    <bean id = "myPet"
          class = "com.zaurtregulov.spring.spring_introduction.Dog"
          scope="singleton">
    </bean>
    -------------------------------------------------------------------------------------------------------
    prototype (прототип)
    Bean этого типа создается каждый раз каогда мы хотим полчить из контейнера
    • такой бин создаётся только после обращения к Spring Container-у с помощью метода getBean.
    • для каждого такого обращения создаётся новый бин в Spring Container-е.
    • подходит для stateful объектов.
     <bean id = "myPet"
          class = "com.zaurtregulov.spring.spring_introduction.Dog"
          scope="prototype">
    </bean>
    ---------------------------------------------------------------------------------------------------------------


     */
}
