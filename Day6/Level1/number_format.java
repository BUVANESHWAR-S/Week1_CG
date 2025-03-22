import java.util.Scanner;
public class number_format {
    static int num(String s){
        int num = Integer.parseInt(s);
        return num;
    }
    static void num_format_ex(String s){
        try {
            num(s);
        } catch (NumberFormatException nfe) {
            System.out.println("you cant use string there");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = input.next();
        num_format_ex(s);

    }
}
// you can parse only an integer in string character. you can't parse alphabetic characters.