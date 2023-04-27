package Nested_Class.Local_Inner_Class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getRezult();
    }
}
//Локальные Local INNER классы не явл элементами класса
// они локальны для метода или какой-либо части кода

class Math {
    private int a = 10;  //локальный INNER класс видит элементы внешнего класса
    int delimoe=21; //или final,
    //delimoe = 20; //при  этом  изменить её нельзя
    public void getRezult() {
        class Delenie { // не может быть static
            //область видимости, блок в котором он находится
            void abc(){
                //delimoe = 20; //при  этом  изменить её нельзя
            }
            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
       // delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}