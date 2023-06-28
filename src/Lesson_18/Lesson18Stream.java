package Lesson_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson18Stream {
    public static void main(String[] args) {
        /*//Create Optional
        // можем создать пустую обертку
        Object firstOptional = Optional.empty(); //? используется как заглушка, чтобы джава не ругалась, в методе, при испаользовании
        Optional<String> strLine = Optional.of("LA"); //если уверены, что объект не null

        String line = "group67";
        Optional<String> strLineNull = Optional.ofNullable(line); // делает проверку на нал.

        // Check is empty on not
        System.out.println(strLineNull.isEmpty());
        System.out.println(strLineNull.isPresent());

        //run some code
        strLineNull.ifPresent(l -> System.out.println(l)); // можно заменить ссылкой.
        //Выполняет метод если объект не пустой

        //open Optional= Доставть опшинал.
        String result = strLineNull.orElse("DEFAULT_VALUE");
        String result2 = strLineNull.orElseGet(() -> {
            return "DEFAULT_VALUE";
        });

        String result3 = strLineNull.get(); //НЕ ХОРОШО ТАК. можно обернуть в if.

        String result4 = strLineNull.orElseThrow();
        String result5 = strLineNull.orElseThrow(() -> new ArithmeticException());

        Optional<String> res = strLineNull.filter(value -> value.equals("group67"));
        // если вернут тру то вернет опшинал с объектом
        // если вернет фолс то вернет опишинал эмпти

        System.out.println(res);

        //map - принимает значение и отдает другое
        int size = strLineNull.map(value -> value.length()).orElse(0);
        System.out.println(size);*/

        //Stream

        // создание
        // create (of)
       /* Stream.of(10, 20, 30, 40, 50); // данных немного поэтому вручную.

        // create Collection
        ArrayList<String> list = new ArrayList<>();
        list.stream();

        // create array
        int [] array = {10,20,30,40,50};
        Arrays.stream(array);
*/
        //.filter(a -> a % 2 == 0); можно писать сколько угодно филтров. но последний форич или подобные, которые завершают стримы.
        Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 80, 100);
        //конвейерные методы
              /*  .filter(num -> num > 25)
                .skip(2) // пропускает п элементов.
                .distinct() //убирает дубликаты, сравнивая с икуалс.
                .peek(p -> Math.round(p))
                .map(n -> n + " USD") // изменяет данные. тут цифры в строки
                .limit(3) // с первыми  кол-во - ничего не делаем
                .sorted()
                .flatMap(a -> Arrays.stream(a.split(" ")))*///это все конвеерные методы
        // это уже терминанальные:
        //.findFirst()
        //.findAny();
        //.collect(Collectors.toList());
        //.anyMatch(a ->a.equals("USD");
        //.nonMatch();
        //.allMatch(a -> a.length() > 1);
        //.forEach(a -> System.out.println(a));
        //.min(Integer::compare);
        //.count();
        //.toArray(String::new); == .toArray(value -> new String[value]);
        //.reduce((a,b)-> a + b + "H");


    }
}

