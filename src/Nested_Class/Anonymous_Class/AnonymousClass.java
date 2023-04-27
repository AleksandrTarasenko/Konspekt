package Nested_Class.Anonymous_Class;

public class AnonymousClass {
    //Анонимный класс
    private int x=5; //анонимный класс может использовать private переменные в своем классе, создав объект внешнего класса
    public static void main(String[] args) {
        Math m =new Math() {  //здесь, при создании элемента интерфейса создается Анонимный класс который имплементирует interface
            //При этом Override(перезаписывается) созданный interface с указанием что в return
            int с =10;
            void abc(){}
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass(); //создаем объект внешнего класса
                return a+b+ac.x; //используем private переменные с объектом внешнего класса
            }
        }; //точка с запятой здесь обязательна, т.к. это целое выражение
        Math m2 =new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m2.doOperation(3,6));
    }
}

interface Math {
    int doOperation(int a, int b);
}
class Math2 {
    int doOperation2(int a, int b){
        return a - b;
    }

}
