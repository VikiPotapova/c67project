package Lesson_19;

public class Lesson19 {
    public static void main(String[] args) {
       /* var a = """
                <h1> Hello world </h>
                <h1> Goodbye </h1>
                """;*/
        // вместо слово класс можно написать record и это будет шаблон. в скобках параметры написать.
        // public record Dog (String name, int weight, String color)/можно задать конструктор
        // instanceof (d instanceof Dog) лежит ли д в иерархии собака.
        // yield in switch case as "return" in default/
        // sealed - запечатанный классы. указываем какие могут от него наслдеоваться, какие нет
        // example:
        // public sealed class Animal permits Dog, etc. они должны быть файнал те, что наслдеуются. или пометить "non-sealed"

        System.out.println(Thread.currentThread());


    }
}
