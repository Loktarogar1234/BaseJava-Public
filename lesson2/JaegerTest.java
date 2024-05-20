package lesson2;

public class JaegerTest {
    public static void main(String[] args) {
        // Создание первого робота с помощью сеттеров
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(2.1f);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(9);

        // Создание второго робота с помощью конструктора
        Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.85f, 10, 9);

        // Вызов методов и вывод значений полей
        jaegerOne.move();
        System.out.println(jaegerOne.fight());

        jaegerTwo.move();
        System.out.println(jaegerTwo.fight());

        // Вывод значений полей через переопределённый метод toString
        System.out.println(jaegerOne);
        System.out.println(jaegerTwo);
    }
}
