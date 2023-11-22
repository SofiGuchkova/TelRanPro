package org.telran.pro.javapro.lesson.LessonFeefteen;

import java.util.function.Function;

public class MainApp {

    public static void main(String[] args) {
        String inputString = "Пример строки";

        Function<String, String> toUpperCaseFunction = str -> str.toUpperCase();

        String result = transformString(inputString, toUpperCaseFunction);

        System.out.println("Исходная строка: " + inputString);
        System.out.println("Преобразованная строка: " + result);
    }

    public static String transformString(String input, Function<String, String> stringTransformFunction) {
        return stringTransformFunction.apply(input);
    }

}