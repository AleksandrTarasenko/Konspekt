package Exception;

public class Try_catch_finally {
    /*
    Правила try/catch/finally
    Блок try находится перед блоком catch или finally. При этом должен присутствовать хотя бы один из этих блоков.
    Между try, catch и finally не может быть никаких операторов.
    Один блок try может иметь несколько catch блоков. В таком случае будет выполняться первый подходящий блок.
    Поэтому сначала должны идти более специальные блоки обработки исключений, а потом уже более общие.
    Блок finally будет выполнен всегда, кроме случая,
    когда JVM преждевременно завершит работу или будет сгенерировано исключение непосредственно в самом finally блоке

    catch
    Сначала должны идти более специальные блоки обработки исключений, а потом уже более общие.
    на два разных исключения предусмотрена одна и та же реакция, Поэтому допускается объединить два catch блока с помощью |
    catch (IllegalArgumentException | IndexOutOfBoundsException e)

    Делегирование - throws пробрасывание
    передача объявленного исключения в место вызова метода. И то, как на него реагировать уже становится заботой вызывающего этот метод.

    Собственные исключения
    class MyNewException extends Exception {
        MyNewException() {
        }
    }
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

    Реагирование через re-throw
    Часто бывает необходимо перехватить исключение, сделать запись о том, что случилось (в файл лога, например)
    и делегировать его вызывающему коду. Как уже было сказано выше, в рамках конструкции try/catch/finally
    можно сгенерировать другое исключение. Такой подход называется re-throw.
    try {
    Reader readerConf = ....
    readerConf.readConfig();
    } catch(IOException ex) {
    System.err.println("Log exception: " + ex);
    throw new ConfigException(ex);
    }
    Во время чтения конфигурационного файла произошло исключение java.io.IOException, в catch блоке оно было перехвачено,
    сделана запись в консоль о проблеме, после чего было создано новое, более конкретное, исключение ConfigException,
    с указанием причины (перехваченное исключение, ссылка на которое ex) и оно было проброшено дальше.

    преобразование проверяемых исключений в непроверяемые
    UncheckedIOException, которое предназначено как раз для того, чтобы сделать java.io.IOException непроверяемым,
    обернуть в unchecked обертку.

    Для получения причины возникновения исключения существует метод getCause.
    public class ExceptionExample {
    public Config readConfig() throws ConfigException { // (1)
      try {
        Reader readerConf = ....;
        readerConf.readConfig();
      } catch (IOException ex) {
          System.err.println("Log exception: " + ex);
          throw new ConfigException(ex); // (2)
      }
    }

    public void run() {
        try {
            Config config = readConfig(); // (3)
        } catch (ConfigException e) {
            Throwable t = e.getCause(); // (4)
         }
        }
    }
    В коде выше:

В строке (1) объявлен метод readConfig, который может выбросить ConfigException.
В строке (2) создаётся исключение ConfigException, в конструктор которого передается IOException - причина возникновения.
readConfig вызывается в (3) строке кода.
А в (4) вызван метод getCause который и вернёт причину возникновения ConfigException - IOException.

    Сохранение исключения
    Исключения можно присвоить переменной или свойству класса, передать по ссылке в метод и т.д.
    Ситуация, когда надо сделать N операций, какие-то из них могут быть не выполнены и будет сгенерировано исключение,
    но реагировать на эти исключения будут позже, скопом.

    class Example {
    private List<Exception> exceptions;

    // some code

    public void parse(String s) {
        try {
            // do smth
        } catch(Exception ex) {
            exceptions.add(ex);
        }
    }

    private void handleExceptions()  {
        for(Exception e : exceptions) {
            System.err.println("Log exception: " + e);
        }
    }
}

    Логирование
    В большинстве случаев лучше всего логировать исключение в месте его обработки.

    Try-with-resources или try-с-ресурсами
    Для этого объявили специальный интерфейс java.lang.AutoCloseable, у которого один метод:
    void close() throws Exception;

    try (FileReader fr = new FileReader(path);
    BufferedReader br = new BufferedReader(fr)) {
         // read from file
    } catch (IOException e) {
         // catch and do smth
    }

    Помните, что TWR, грубо говоря, просто добавляет вам блок кода вида:
    finally {
        resource.close();
    }
     */
}
