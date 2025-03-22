import java.util.Scanner;
public class string_out_of_bound {
    static Character out_of_index(String s){
        return s.charAt(s.length());
    }
    static void exception_handle(String s){
        try {
            out_of_index(s);
        } catch (StringIndexOutOfBoundsException obe) {
            System.out.println("String index is out bound");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        exception_handle(s);

    }
}
