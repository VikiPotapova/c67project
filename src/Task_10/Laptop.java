package Task_10;

public class Laptop {
    private String brand;
    private String model;
    private int memory;

    public Laptop(String brand, String model, int memory) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

}
