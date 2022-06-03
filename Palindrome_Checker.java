import java.util.Scanner;
public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Word : ");
        String word = sc.nextLine();
        if(palindrome_checker(word)){
            System.out.print("The word " + word + " is palindrome");
        }
        else{
            System.out.print("The word " + word + " is not palindrome");
        }
    }

    public static boolean palindrome_checker(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return palindrome_checker(s.substring(1, s.length()-1));
        return false;
    }
}
