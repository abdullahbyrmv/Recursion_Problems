import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int input = sc.nextInt();
        System.out.println("The " + input + "th term of fibonacci numbers is : " + fibonacci(input));
    }

    public static int fibonacci(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
