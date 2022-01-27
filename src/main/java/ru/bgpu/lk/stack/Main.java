package ru.bgpu.lk.stack;

public class Main {

    public static void main(String[] args) {
        LkStack<Integer> stack = new LkStack<>(5);

        for(int i = 0; i <= 10 && !stack.isFull(); i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.size()+" - "+stack.pull());
        }
    }
}
