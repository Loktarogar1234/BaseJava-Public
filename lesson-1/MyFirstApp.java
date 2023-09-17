import java.nio.charset.Charset;
import java.util.Scanner;

public class MyFirstApp {	
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset().displayName());
        System.out.println("Write once, run anywhere!");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя (Без регистрации и SMS!): ");
        System.out.println(console.nextLine());
    }
}