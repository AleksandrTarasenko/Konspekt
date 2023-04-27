package Collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Aleksandr");// метод push - Добавление элемента в stack
        stack.push("Миша");
        stack.push("Олег");
        stack.push("Катя");//последний(верхний) элемент стека
        System.out.println(stack);
        System.out.println(stack.pop()); // метод pop() - удаление верхнего(последнего) элемента из стека
        System.out.println(stack);
        //метод peek() проверяет какой элемент на самом верху стека
        System.out.println("на самом верху стека элемент " + stack.peek());
        //метод isEmpty проверяет пустой ли стек
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); //вывелся элемент и удалился
            System.out.println(stack);
        }
    }
}
