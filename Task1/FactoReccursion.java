package Task1;
import java.util.Scanner;

public class FactoReccursion {

    public static int factoReccursion(int num){
        if(num == 0){
            return 1;
        }
        return num * factoReccursion(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int num = sc.nextInt();
        System.out.println(factoReccursion(num));
    }
    
}
