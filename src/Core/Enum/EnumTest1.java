package Core.Enum;

public class EnumTest1 {
    public static final int MONDAY = 1;
    void method(int dayOfWeek) {
        System.out.println("today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        EnumTest1 t = new EnumTest1();
        t.method(158);
    }
}
