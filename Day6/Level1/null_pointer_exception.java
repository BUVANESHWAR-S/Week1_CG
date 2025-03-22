import java.util.Scanner;
public class null_pointer_exception {
    static String generate_ex(){
        String s ;
        s = null;
        return s;
    }
    static void get_string(){
        try {
            String s = generate_ex();
            System.out.println(s.length());
        } catch (NullPointerException npe) {
            System.out.println("you cant store null in a string variable");
            System.out.println(npe);
        }
    }
    public static void main(String[] args) {
        get_string();
    }
}
