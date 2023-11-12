package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        //cоздание объекта класса Wolf
        Wolf myWolf = new Wolf();

        //присваивание значений
        myWolf.gender = "Самец";
        myWolf.name = "Альфа";
        myWolf.weight = 45.5;
        myWolf.age = 6;
        myWolf.color = "Серый";

        //вывод значений
        System.out.println("Пол: " + myWolf.gender);
        System.out.println("Кличка: " + myWolf.name);
        System.out.println("Вес: " + myWolf.weight);
        System.out.println("Возраст: " + myWolf.age);
        System.out.println("Окрас: " + myWolf.color);

        //вызов методов
        myWolf.walk();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}
