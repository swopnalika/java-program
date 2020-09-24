import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        System.out.println("Take input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of these numbers=");
        System.out.println(sum);
    }
}

