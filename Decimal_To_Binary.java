import java.util.Scanner;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Decimal Number : ");
        int decimal = sc.nextInt();
        System.out.print("The Binary form of " + decimal + " is " + decimal_to_binary(decimal));
    }

    public static int decimal_to_binary(int n){
        if(n == 0){
            return 0;
        }
        return n % 2 + 10 * decimal_to_binary(n / 2);
    }
}
