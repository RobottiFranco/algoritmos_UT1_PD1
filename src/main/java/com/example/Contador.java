package com.example;

class Contador {
    final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContado() {
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public static void main(String[] args) {
        Contador monstrarContador = new Contador();
        monstrarContador.mostrarContado();
    }
}

class do_while_Contador {
    final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContado() {
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
    }

    public static void main(String[] args) {
        Contador monstrarContador = new Contador();
        monstrarContador.mostrarContado();
    }
}

class for_Contador {
    final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void mostrarContado() {
        for (int i = contador; i < MAX_CONT; i += incremento) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Contador monstrarContador = new Contador();
        monstrarContador.mostrarContado();
    }
}
