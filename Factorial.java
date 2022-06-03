import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number which you want to calculate the factorial : ");
        int input = sc.nextInt();
        System.out.println("The result of " + input + " factorial is " + factorial(input));
        System.out.println(input + "! = " + factorial(input));
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
