package com.example;

public class Alumno {
    private String nombre;

    public Alumno() {
        nombre = "Juan";
        getValor();
        getPrimerCaracter("palabra");
        System.out.println(paraAString(13));
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        if (palabra != null && palabra.length() > 0) {
            return palabra.charAt(0);
        } else {
            return '?';
        }
    }

    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        return ((Integer) x1).toString();

    }
}
