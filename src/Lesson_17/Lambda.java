package Lesson_17;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda {
    public static void main(String[] args) {
        //1-создать интерфейс
        //2-шаблом который будет исполнять лямбду (параметры на вход)-> логика

        /*FunctionalInter firstLambda = (int a, int b) -> a + b;*/

        // использовать ее

      /*  long result = firstLambda.sum(10,20);
        System.out.println(result);*/
/*
        UnaryOperator<Integer> firstLambda = (a) -> a * a;
        BinaryOperator<Integer> secondLambda = (a, b) -> a + b;
        Predicate<Integer> thirdLambda = (number) -> number % 2 == 0;
        System.out.println(thirdLambda.test(4));

        Consumer<Integer> c = (x) -> System.out.println(x); // принимает параметр но не возвращает результат или = System.out::println; переменная примим ее. короче
        Supplier<Integer> s = () -> { //можно достатьт из базы данных                                                // ссылка на объект
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };

        // принимает первое, возвращает второе
        Function <String, Integer> fl = (n) -> Integer.parseInt(n);*/

        BinaryOperator<Integer> binLambda = (a, b) -> {
            if (a < b) {
                return a;
            } else if (a > b){
                return b;
            } else {
                return 0;
            }
        };
        System.out.println(binLambda.apply(5,6));

    }
}