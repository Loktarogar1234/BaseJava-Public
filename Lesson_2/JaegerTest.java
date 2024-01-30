package Lesson_2;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(2.1f);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(9);

        Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.85f, 10, 9);

        jaegerOne.move();
        jaegerOne.fight();
        jaegerTwo.move();
        jaegerTwo.fight();

        System.out.println(jaegerOne.getModelName() + " " + jaegerOne.getMark());
        System.out.println(jaegerTwo.getModelName() + " " + jaegerTwo.getMark());

    }
}
