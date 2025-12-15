package Task1;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to swap");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

    }
}
