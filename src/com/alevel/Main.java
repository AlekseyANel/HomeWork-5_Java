package com.alevel;

public class Main {

    public static void main(String[] args) {

        StringArray stringArray = new StringArray("first","2econd","третий3","4git","fifthпятый");

        System.out.println("Сортировка массива строк в прямом порядке по возрастанию длины его элементов:" );
        stringArray.insertSort();

        System.out.println("Сортировка массива строк в обратном порядке по возрастанию длины его элементов:" );
        stringArray.insertSortRevers();

        System.out.println("Метод показывает пронумерованный массив одной строкой: " );
        stringArray.printOneLine();
    }

}
