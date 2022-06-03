import java.util.Scanner;
public class Product_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Size of Array : ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Please Enter Element number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("The Product of All the Elements of Array is : " + product_of_Array(array,n));
    }

    public static int product_of_Array(int array[], int n)
    {
        if (n <= 0)
            return 1;
        return (product_of_Array(array, n - 1) * array[n - 1]);
    }
}
