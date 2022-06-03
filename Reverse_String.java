import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a String : ");
        String word = sc.nextLine();
        System.out.println("The Reverse Format of the word " + word + " is " + String_Reverser(word));
        System.out.println("Reverse Format : " + String_Reverser(word));
    }

    public static String String_Reverser(String a){
        if (a.isEmpty())
            return a;
        return String_Reverser(a.substring(1)) + a.charAt(0);
    }
}
