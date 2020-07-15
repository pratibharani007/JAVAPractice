package com.company;

public class Numbers {
    public static void main(String[] args) {
        short s;
        int i;
        long l;
        float salary;
        double djjjjjj;
        String name;
        String address;

        s = 10;
        i = 100;
        l = 1000L;
        salary = 25000.50f;
        djjjjjj = 3455.589;
        name = "Rani";
        address = "292 Old Rutherglen Road, Glasgow";


        System.out.format("s:%d \n", s);
        System.out.format("i:%d \n", i);
        System.out.format("l:%d \n", l);
        System.out.format("d:%f \n", djjjjjj);
        System.out.format("name:%s \n", name);
        System.out.format("name:%s\nmonkey: %s\nsalary:%f\n", name, address, salary);
    }
}