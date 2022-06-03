import java.util.Scanner;
public class First_Uppercase_Letter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a String : ");
        String word = sc.nextLine();
        if (first_uppercase_letter(word) == ' ') {
            System.out.print("There is no Uppercase Letter in the word " + word);
        } else {
            System.out.println("The First Uppercase of word" + word + " is " + first_uppercase_letter(word));
        }
    }
    public static char first_uppercase_letter(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first_uppercase_letter(str.substring(1));
        }
    }
}
