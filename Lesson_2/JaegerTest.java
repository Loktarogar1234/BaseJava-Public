public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        System.out.println("modelName = " + jaegerOne.getModelName());
        jaegerOne.setModelName("kijdsflaisdfh");
        System.out.println("modelName = " + jaegerOne.getModelName());
    }
}
