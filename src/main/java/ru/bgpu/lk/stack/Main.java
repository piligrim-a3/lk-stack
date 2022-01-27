package ru.bgpu.lk.stack;

public class Main {

    public static void main(String[] args) {
        LkStack<Integer> stack = new LkStack<>(10);

        for(int i = 0; i <= 5; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.size()+" - "+stack.pull());
        }
    }
}
