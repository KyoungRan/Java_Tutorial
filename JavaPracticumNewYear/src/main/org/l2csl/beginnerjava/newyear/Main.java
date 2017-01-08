package org.l2csl.beginnerjava.newyear;

public class Main {

    public static void main(String [] args) {
        System.out.println("Hello World");
        int sum = 0;
        sum = add(3, 5);
        System.out.println(sum);
        explode("Boom");
        FancyPrinter f = new FancyPrinter("I can code");
        f.print();
        ClassyPrinter c = new ClassyPrinter("I'm a pro");
        c.print(true);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void explode(String c) {
        for(int i = 0; i < c.length(); i++) {
            System.out.println(c.charAt(i));
        }
    }
}

