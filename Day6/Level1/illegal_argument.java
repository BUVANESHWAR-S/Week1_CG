import java.util.Scanner;
public class illegal_argument {
    static String sub_string(String s, int i1, int  i2){
        return s.substring(i1+i2, i2);
    }
    static void illegal_exception(String s, int i1, int i2){
        try {
            sub_string(s,i1,i2);
            
        } catch (Exception e) {
            System.out.println("start index of the sub-string cannot be greater than end index");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = input.next();
        System.out.println("enter the start and end index: ");
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        illegal_exception(str, i1, i2);
    }
}
