package Lesson_2;

public class Jaeger {

    private String modelName = "Bracer Phoenix";
    private String mark = "Mark-5";
    private String origin = "USA";
    private float height = 70.7f;
    //private float weight = 2.1f;
    private int strength = 8;
    private int armor = 9;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        if(modelName == "") {
            System.out.println("Пустая строка");
        }
        this.modelName = modelName;
    }
    boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}
