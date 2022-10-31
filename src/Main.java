
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Generating Random number from 1 to 10");
        Random randomGenerator=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomGenerator.nextInt(10) + 1);
        }

    }
}





