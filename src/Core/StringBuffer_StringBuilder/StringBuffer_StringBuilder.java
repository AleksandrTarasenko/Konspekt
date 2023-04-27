package Core.StringBuffer_StringBuilder;

public class StringBuffer_StringBuilder {
    //StringBuffer определяет четыре конструктора:

/*
    StringBuffer()
    StringBuffer(int capacity)
    StringBuffer(String str)
    StringBuffer(CharSequence chars)

    //Аналогичные конструкторы определяет StringBuilder:

    StringBuilder()
    StringBuilder(int capacity)
    StringBuilder(String str)
    StringBuilder(CharSequence chars)

StringBuilder и StringBuffer изменяемые
    при этом StringBuffer StringBuffer синхронизированный и потокобезопасный из-за чего медленный в однопоточных приложения

    Конструктор без параметров резервирует в памяти место для 16 символов.
    С помощью метода capacity() мы можем получить количество символов
     получить строку, которая хранится в StringBuffer, использовать стандартный метод toString():
Получение и установка символов
Метод charAt() получает, а метод setCharAt() устанавливает символ по определенному индексу:
Метод getChars() получает набор символов между определенными индексами:
Добавление в строку
Метод append() добавляет подстроку в конец StringBuffer:
Метод insert() добавляет строку или символ по определенному индексу в StringBuffer:
Удаление символов
Метод delete() удаляет все символы с определенного индекса о определенной позиции, а метод deleteCharAt() удаляет один символ по определенному индексу:
Обрезка строки
Метод substring() обрезает строку с определенного индекса до конца, либо до определенного индекса:
Изменение длины
Для изменения длины StringBuffer (не емкости буфера символов) применяется метод setLength().
Замена в строке
Для замены подстроки между определенными позициями в StringBuffer на другую подстроку применяется метод replace():
Обратный порядок в строке
Метод reverse() меняет порядок в StringBuffer на обратный:

 */
}
