package ru.bgpu.lk.stack;

public class Main {

    public static final String OPEN  = "{<[(";
    public static final String CLOSE = "}>])";

    public static void main(String[] args) {
        LkStack<Integer> stack = new LkStack<>(5);

        for(int i = 0; i <= 10 && !stack.isFull(); i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.size()+" - "+stack.pull());
        }

        String s1 = "{vasja([<(in)>()p])}";
        String s2 = "{(1+1[<()>([)]out])}";
        System.out.println(s1+" - "+checkString(s1));
        System.out.println(s2+" - "+checkString(s2));
    }

    public static boolean checkString(String in) {
        LkStack<String> stack = new LkStack<>(in.length()/2+1);
        for(String s: in.split("")) {
            if(OPEN.contains(s)) {
                stack.push(s);
            } else if(CLOSE.contains(s)) {
                if(stack.isEmpty() || OPEN.indexOf(stack.pull()) != CLOSE.indexOf(s)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
