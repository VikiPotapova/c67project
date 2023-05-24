package Lessons;

public class Biuld {
    // public  - доступно везде
    //public String type;

    // - по умолчанию (доступно только в папке) private package
    // String type

    // private - в пределах того класса, где находится
    // private String type

    // protected - в пределах пакета, а наследники в других в пакетах.
    // protected String type

    private String type;
    private String color;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    //getter & setter -методы для доступа к полям. посредники

}
