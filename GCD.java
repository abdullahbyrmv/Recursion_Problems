import java.util.Scanner;
public class GCD { // Greatest Common Divisor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.print("Please Enter Second Number : ");
        int number2 = sc.nextInt();
        System.out.println("The Greatest Common Divisor of " + number1 + " and " + number2 + " is " + gcd(number1,number2));
        System.out.println("gcd("+ number1 + "," + number2 + ") == " + gcd(number1,number2));
    }

    public static int gcd(int a , int b){
        if(a < 0 || b < 0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b , a % b);
    }
}
