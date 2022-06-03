import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the base : ");
        int base = sc.nextInt();
        System.out.print("Please Enter the exp : ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " == " + power(base , exp));
    }

    public static int power(int base , int exp){
        if(exp < 0){
            return -1;
        }
        if(exp == 0){
            return 1;
        }
        return base * power(base ,exp - 1);
    }
}
