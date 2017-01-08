package org.l2csl.beginnerjava.newyear;

public class ClassyPrinter extends FancyPrinter {

    public String classy;

    public ClassyPrinter(String classy) {
        super(classy);
        this.classy = classy;
    }

    @Override
    public void print() {
        System.out.println(reverseString(classy));
    }


    public static String reverseString(String s) {
        return ( new StringBuffer(s).reverse().toString());
    }

    public void print(boolean b) {
        if (true) {
            super.print();
        }  else {
            print();
        }
    }
}
