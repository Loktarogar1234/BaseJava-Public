package Lesson_2;
public class Person {
     String gender = "man";
     String name = "Steve";
     int height = 178; // в см.
     int weight = 81; // в кг.
     int age = 41;

    public Person(String gender, String name, int height, int weight, int age) {
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

     void walk() {
        System.out.println(name + " идет");
    }

     void sit() {
        System.out.println(name + " сидит");
    }

     void run() {
        System.out.println(name + " бежит");
    }

     void talk() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " учит Java");
    }
}
