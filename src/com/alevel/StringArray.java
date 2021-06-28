package com.alevel;

import java.util.Arrays;

public class StringArray {

      String[] sArrayCopy;

   public StringArray (String... sArray) {//Конструктор с переменным кол-вом аргументов (... sArray является массивом теперь)
       this.sArrayCopy = Arrays.copyOf(sArray, sArray.length);
       System.out.println("Количество аргументов исходного массива (для проверки): " + this.sArrayCopy.length);
       System.out.println("Исходный массив строк (для проверки): ");
       for (String p : sArrayCopy) {//выводим все элементы  массива /for (int i=0; i<length; i++)
           System.out.println( p );
       }
   }



    public void insertSort() {//сортировать массив строк по возрастанию длины его элементов слева-направо
        int in, out;
        for (out = 1; out < sArrayCopy.length; out++) // out - разделительный маркер
        {
            String temp = sArrayCopy[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while (in > 0 && sArrayCopy[in - 1].length() >= temp.length()) // Пока не найден меньший элемент
            {
                sArrayCopy[in] = sArrayCopy[in - 1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            sArrayCopy[in] = temp; // Вставить помеченный элемент
        }
        for (String k : sArrayCopy) {//выводим все элементы отсортированного массива for (int i=0; i<length; i++)
            System.out.println(" " + k + ";  ");

        }
    }

    public void insertSortRevers() {//сортировать массив строк по возрастанию длины его элементов справа-налево
        int in, out;
        for (out = sArrayCopy.length-2; out >= 0; out--) // out - разделительный маркер, начать с предпоследнего элемента
        {
            String temp = sArrayCopy[out]; // Скопировать содержимое помеченного элемента
            in = out; // Начать перемещения с out
            while (in > 0 && sArrayCopy[in+1].length() <= temp.length()) // Пока не найден меньший элемент
            {
                sArrayCopy[in] = sArrayCopy[in+1]; // Сдвинуть элемент влево
                ++in; // Перейти на одну позицию /вправо
            }
            sArrayCopy[in] = temp; // Вставить помеченный элемент
        }
        for (String n : sArrayCopy) {//выводим все элементы отсортированного массива for (int i=0; i<length; i++)
            System.out.println(" " + n + ";  ");

        }
    }


    public void printOneLine() {//Метод вывода массива sArrayCopy в одну строку с нумерацией
        for (String m : sArrayCopy) {//проходит в цикле по всем элементам массива for (int i=0; i<length; i++)
            int indexOfEl = Arrays.asList(sArrayCopy).indexOf(m)+1;
            System.out.print(indexOfEl + ":" + m + ";  ");
        }
  /*int j = 1;//промежуточная переменная для подсчета номера строки
        for (String i : sArrayCopy) {//проходит в цикле по всем элементам массива for (int i=0; i<length; i++)
            System.out.print(j + ":" + i + ";  ");
             j = j + 1;*/
    }

}


