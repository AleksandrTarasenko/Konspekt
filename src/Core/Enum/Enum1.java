package Core.Enum;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();

        System.out.println(today.weekDay); //Сработает toString метода  enum
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1==w2); //true
        //System.out.println(WeekDays.FRIDAY == WeekDays2.FRIDAY); //Так нельзя
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY)); //Так всегда будет false т.к. тип всегда разный
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        //WeekDays w16 = WeekDays.valueOf("Monday"); Будет исключпение, имя должнг точно совпадать
        System.out.println(w15);
        WeekDays[] array = WeekDays.values(); //получение массива из enum
        System.out.println(Arrays.toString(array));//вывод массива

    }
}

enum WeekDays {
    MONDAY ("bad"),
    TUESDAY ("bad"),
    WEDNESDAY ("so-so"),
    THURSDAY ( "so-so"),
    FRIDAY ("good"),
    SATURDAY ("great"),
    SUNDAY ("good");
    private String mood; //переменные

    WeekDays(String mood) { //конструктор private не писать, но нужно знать что идентификатор всегда private
        this.mood = mood;
    }
    private WeekDays() { // надо знать что есть конструктор без параметров
    }

    public String getMood() { //методы
        return mood;
    }
}
enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
class Today {
    WeekDays weekDay;
    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case THURSDAY:
            case WEDNESDAY:
            case TUESDAY:
            case FRIDAY:
                System.out.println("иди на работу");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("можно отдохнуть");
            break;
        }
        System.out.println("Настроение в этот день " + weekDay.getMood() );
    }


}
