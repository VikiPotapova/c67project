public class Example {
    void someMethod (String name, int... number){ //в объекте можно передать туда любое количество намбер
        for (int a : number){
            System.out.println(a);
        }
    }
}
