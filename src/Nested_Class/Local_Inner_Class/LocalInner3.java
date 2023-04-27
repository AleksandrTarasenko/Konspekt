package Nested_Class.Local_Inner_Class;

public class LocalInner3 {
    public static void main(String[] args) {
        class Slojenie implements Math3 {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.doOperation(5,3 ));
    }
}

interface Math3 {
    int doOperation(int a, int b);

}