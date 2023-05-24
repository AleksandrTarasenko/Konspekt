package Spring;

public class BeanInitAndDestroy {
    /*
    Жизненный цикл бина
    Запуск приложения  ->  Начало работы Spring Container  ->  Создание бина  ->  DI – внедряются зависимости
                                                                                                          V
 Конец работы Spring Container <- Использование нами этого бина  <-  Бин готов для использования  <-  init-method
            V
     destroy-method  ->  Остановка приложения

    Чаще всего init-method используется для открытия или настройки каких-либо ресурсов, например баз данных, стримов и т.д.
    destroy-method чаще всего используется для их закрытия.

    В классе прописываем эти методы (init и destroy)
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }
    затем прописываем их в конфиг файле
    <bean id="myPet"
          class="com.zaurtregulov.spring.spring_introduction.Dog"
          init-method="init"
          destroy-method="destroy">
    </bean>
    У данных методов access modifier может быть любым
    У данных методов return type может быть любым. Но из-за того, что возвращаемое значение мы никак не можем использовать,
    чаще всего return type – это void.
    Называться данные методы могут как угодно.
    В данных методах не должно быть параметров.

    Если у бина scope = prototype, то:
    1) init-method будет вызываться для каждого новосозданного бина
    2) для этого бина destroy-method вызываться не будет
    3) программисту необходимо самостоятельно писать код для закрытия/освобождения ресурсов, которые были использованы в бине

     */
}
