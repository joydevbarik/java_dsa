import java.util.*;
public class welcome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swap machine\n");

        System.out.println("Enter the value of a ");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        int c = a;
         a = b;
         b = c;

        System.out.println("Swapping is done");
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is:"+b);

    }
}