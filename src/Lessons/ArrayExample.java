package Lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        //array- конечная именновая группа элементов одного типа.
        /*String[] array = new String[4]; //создает массив строк на 4 элемента.
        //индекс- номер ячейки
        array[1] = "Hello";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);*/

        /*Scanner scanner = new Scanner(System.in);
        double[] masDouble = new double[scanner.nextInt()];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = Math.random();
            System.out.println(masDouble[i]);
        }
        System.out.println();
        for (int i = 0; i < masDouble.length; i++) {
            if (i % 2 != 0) {
                masDouble[i] = Math.pow(masDouble[i], 2);
            }
            System.out.println(masDouble[i]);
        }
        System.out.println();
        for (int i = 0; i < masDouble.length; i++) {
            System.out.println(masDouble[i]);
        }
        System.out.println();
        for (int i = masDouble.length - 1; i >= 0; i--) {
            System.out.println(masDouble[i]);
        }*/

        // 5 lesson

        //FOR EACH forEach
        // for((переменная, в которую записываем) -тип как и эл-ты внутри + назавание переменной : что хотим перебрать)
       /* int[] array = {1,10, 6, 19, 8};
        int[] finalArray = {0,0,0,0,0,0,0};
        for (int number : array) {  // внутри не умеет сохраннять изменения, лучше использовать обычный
            System.out.println(number);
        }
        // Arrays.method()
        // sortirovka
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // find an element
        System.out.println(Arrays.binarySearch(array,6)); //ВАЖНО массив должен быть отсортирован
        //copy
        System.arraycopy(array,1,finalArray, 3, 3);
        System.out.println(Arrays.toString(finalArray));*/

        //многомерные массивы
       /* int[][] array2 = new int[3][4];// stroki i stolbiki
        System.out.println(Arrays.deepToString(array2));
        array2[1][2] = 100;//stroka potom stolb
        System.out.println(Arrays.deepToString(array2));

        System.out.println(array2[2].length); //узнаем длины строки*/
/*
        int[][] a = new int [1][1];
        int[][] b = new int [1][1];
        System.out.println(Arrays.deepEquals(a,b));
        // int[][] binArray = {{9, 3, 100, 16}, {7, 3, 1}};
        for (int i = 0; i < binArray.length; i++){
            for (int j = 0; j < binArray[i].length;j++){
                System.out.print(binArray[i][j] + " ");
            }
            System.out.println();
            }*/
        /*for (int[] line: binArray){
            for (int element: line){
                System.out.print(element + " ");
            }
            System.out.println();
        }*/
        // random
        //создать двумерный массив и заполнить рандомными числами
        /*Random random = new Random();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
                System.out.println(max);
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);*/
            }
        }




