package Lessons;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Calculator cal2 = new Calculator(105, 450, "Red");
        long result = cal.razn(6,8);
        System.out.println(result);

        System.out.println(cal.sum(2,4));
        System.out.println(cal.razn(30,8));
        System.out.println(cal.del(10,5));
        System.out.println(cal.umnozh(6,7));

        System.out.println(cal.color);

    }
}
