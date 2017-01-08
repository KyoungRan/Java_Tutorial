package org.l2csl.beginnerjava.newyear;

public class FancyPrinter {

    public String [] stringArr;

    public FancyPrinter(String a) {
        this.stringArr = a.split(" ");
    }

    public void print() {
        for (String i : stringArr ) System.out.println(i);
    }
}
