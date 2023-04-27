package InterfaceLesson;

public class Test1 extends Test2{

    @Override
    void abc() {

    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
    }
}

 interface runAble {
     void run();
}

   class Test2 {

       void abc() {

      }
  }

enum abd  implements runAble{

    gf, fg,as,;

    @Override
    public void run() {
        System.out.println("Ghfgf");
    }
}
