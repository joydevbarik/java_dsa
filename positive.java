
//wap to accept negative number from user and convert it into positive
import java.util.*;
public class positive {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,pos;
       System.out.println("Enter the value of n:");
       n = input.nextInt();
       pos = Math.abs(n);
       System.out.println("The positive value is:"+pos);
   }
}
