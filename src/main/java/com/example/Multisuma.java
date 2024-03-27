package com.example;

public final class Multisuma {
    public static void main(String[] args) {
        double resultado = multisuma(1.0, 2.0, 3.0);
        System.out.println(resultado);
    }

    public static double multisuma(double a, double b, double c) {
        return a * b + c;
    }
}
