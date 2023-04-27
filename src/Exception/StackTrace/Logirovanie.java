package Exception.StackTrace;

public class Logirovanie {
    public static void main(String[] args) {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        String info = "";
        if (st.length >= 3) {
            StackTraceElement element = st[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            info = className + "#" + methodName;
        }
    }

}
/*
StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

StackTraceElement[] - указание на тип массива
stackTraceElements - имя массива,
Thread.currentThread() - получение ссылки на текущий поток, в котором выполняются методы, которые мы хотим отследить
getStackTrace() - получаем весь Стэк вызываемых методов

Вот что еще мы можем получить из StackTraceElement:

String getClassName() - Возвращает имя класса.
String getMethodName() - Возвращает имя метода.
String getFileName() - Возвращает имя файла (в одном файле может быть много классов).
String getModuleName() - Возвращает имя модуля (может быть null).
String getModuleVersion() - Возвращает версию модуля (может быть null).
int getLineNumber() - Возвращает номер строки в файле, в которой был вызов метода.
 */
