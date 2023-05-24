package Core.Exception;

public class ExceptionEx {
    /*
     три типа исключений

     //На исключения надо либо реагировать, либо делегировать, но ни в коем случае не игнорировать.//

     Проверяемые исключения – (java.lang.Throwable и java.lang.Core.Exception)
     вид исключения, которое происходит на стадии компиляции, их также именуют исключениями периода компиляции.
     Обозначенные исключения не следует игнорировать в ходе компиляции,
     они требуют должного обращения (разрешения) со стороны программиста.

     Непроверяемые исключения (java.lang.RuntimeException)
      – представляет собой исключение, которое происходит во время выполнения.
     Они также носят название исключения на этапе выполнения.
     как логические ошибки либо неверный способ использования API.

     Ошибки – (java.lang.Error)
     не являются исключениями, однако представляют проблемы, которые возникают независимо от пользователя
     либо программиста. Ошибки в вашем коде обычно игнорируются в виду того,
     что в редких случаях их обработка окажется результативной.
     К примеру, ошибка возникнет при переполнении стека. На этапе компиляции они также игнорируются.

     Классификация
     java.lang.Core.Exception
     о ситуации, которые разработчик никак не может предотвратить, например, не получилось закрыть файловый дескриптор
     или отослать письмо, и исключение является одним из вариантов нормальной работы кода.
     Это проверяемые исключения, мы обязаны на такие исключения реагировать,
     это будет проверено на этапе компиляции.
     Пример: java.io.IOException, java.io.FileNotFoundException.

     java.lang.RuntimeException
     о ситуации, которые разработчик никак не может предотвратить, например, не получилось закрыть файловый дескриптор
     или отослать письмо, и исключение является одним из вариантов нормальной работы кода.
     Это проверяемые исключения, мы обязаны на такие исключения реагировать, это будет проверено на этапе компиляции.
     Пример: java.io.IOException, java.io.FileNotFoundException.

     java.lang.Error
     Это критические ошибки, аварийные ситуации, после которых мы с трудом или вообще не в состоянии продолжить работу.
     Например, закончилась память, переполнился стек вызовов и т.д.
     Это непроверяемые исключения, реагировать на них или нет решает разработчик.
     Реагировать на подобные ошибки следует только в том случае, если разработчик точно знает как поступить в такой ситуации.
     Перехватывать такие ошибки не рекомендуется, так как чаще всего разработчик не знает как реагировать
     на подобного рода аварийные ситуации.
     */
}