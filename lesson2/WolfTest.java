package lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();

        // Присваивание значений через сеттеры
        myWolf.setGender("Самец");
        myWolf.setName("Альфа");
        myWolf.setWeight(45.5);
        myWolf.setAge(6);
        myWolf.setColor("Серый");

        // Вывод значений через геттер
        System.out.println("Пол: " + myWolf.getGender());
        System.out.println("Кличка: " + myWolf.getName());
        System.out.println("Вес: " + myWolf.getGender());
        System.out.println("Возраст: " + myWolf.getAge());
        System.out.println("Окрас: " + myWolf.getColor());

        // Вызов методов
        myWolf.walk();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}
