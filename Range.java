import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum of All Numbers in Range [0 ; " + n + "] == " + Recursive_Range(n));
    }

    public static int Recursive_Range(int n) {
        if (n<=0) {
            return 0;
        }
        return n + Recursive_Range(n - 1);
    }
}
