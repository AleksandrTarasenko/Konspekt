package Core.Class;

public class ClassName {
    /*
    Программно получить имя класса

Иногда из программы нужно получить имя используемого класса.
Для этого есть специальные методы getClass().getName() и другие родственные методы.
public void onClick(View view) {
    String className = view.getClass().getName();
    String simpleName = view.getClass().getSimpleName();
    String canonicalName = view.getClass().getCanonicalName();

    if (canonicalName == null) {
        canonicalName = "null";
    }

    String s = "Имя класса: " + className + "\n" + "SimpleName: " + simpleName
            + "\n" + "CanonicalName: " + canonicalName + "\n";

    mInfoTextView.setText(s);
}
Если нужно узнать имя класса активности, то достаточно кода.
// подставьте имя вашей активности
String className = MainActivity.class.getName();

сли тебе известно имя класса, то можешь получить сам класс.

try {
    // получим объект Class
	Class<?> myClass = Class.forName("ru.alexanderklimov.test.MainActivity");
	mInfoTextView.setText(myClass.getName()); // выводим в TextView
    Intent intent = new Intent(this, myClass);
    startActivity(intent);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Метод getSuperclass() возвращает имя суперкласса.
     */
}
