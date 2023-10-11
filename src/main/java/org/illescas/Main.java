package org.illescas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Calculator c = new Calculator();
        double addResult = c.add(2,8);
        double subResult = c.subtract(2, 8);
        double multResult = c.multiply(2, 8);
        double divResult = c.divide(2, 8);

        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(multResult);
        System.out.println(divResult);
    }
    public static void loop() {
        System.out.println("Testing git changes");
    }
}