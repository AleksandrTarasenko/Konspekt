package Nested_Class.Local_Inner_Class;

public class LocalInner2 {
    public static void main(String[] args) {
        Math2 math = new Math2();
        math.getRezult(21, 4);
    }
}
//Локальные Local INNER классы не явл элементами класса
// они локальны для метода или какой-либо части кода

class Math2 {

    public void getRezult(final int delimoe, final int delitel) {
        class Delenie {
            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {

                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();

        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel );
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}