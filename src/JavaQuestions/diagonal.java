//wap to accept length and breadth of a rectangle from user and calculate diagonal of a rectangle
import java.util.*;
public class diagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,b,d;
        System.out.println("Enter the value of length:");
        l = input.nextDouble();
        System.out.println("Enter the value of breadth:");
        b = input.nextDouble();
        d = Math.sqrt(Math.pow(l,2)+Math.pow(b,2));
        System.out.println("The value of diagonal is:-"+d);
    }
}