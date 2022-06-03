import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Positive Number : ");
        int number = sc.nextInt();
        System.out.println("The sum of digits of the number " + number + " is " + sum_of_digits(number));
    }

    public static int sum_of_digits(int n){
        if(n == 0 || n < 0){
            return 0;
        }
        return n % 10 + sum_of_digits(n / 10);
    }
}
