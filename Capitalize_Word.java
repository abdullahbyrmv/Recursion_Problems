import java.util.Scanner;
public class Capitalize_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a word or Sentence : ");
        String sentence = sc.nextLine();
        System.out.println("Each of the First Words Capitalized Version of Word or Sentence : " + capitalize_word(sentence));
    }

    public static String capitalize_word(String str) { // capitalize first letters of sentence or word

        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.charAt(str.length() - 2) == ' ')) {
            chr = Character.toUpperCase(chr);
        }
        return capitalize_word(str.substring(0,str.length()-1))+ chr;
    }
}
