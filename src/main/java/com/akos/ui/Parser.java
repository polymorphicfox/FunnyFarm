package com.akos.ui;

/*
Парсит строку в примитивные типы или классы-обертки
 */
public class Parser {
    public static Object parse(String str, Class cls) {
        if (cls.equals(int.class) || cls.equals(Integer.class)) {
            return Integer.parseInt(str);
        }
        if (cls.equals(double.class) || cls.equals(Double.class)) {
            return Double.parseDouble(str);
        }
        if (cls.equals(float.class) || cls.equals(Float.class)) {
            return Integer.parseInt(str);
        }
        if (cls.equals(String.class)) {
            return str;
        }
        throw new IllegalArgumentException("this type not supported");
    }
}
