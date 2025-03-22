import java.util.Scanner;
public class chck_str {
    static boolean Check_str(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        boolean temp = true;
        if(l1 != l2){
            temp = false;
            return temp;
        }
        else{
            for(int i = 0; i<l1; i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    temp = false;
                    return temp;
                }
            }
        }
        return temp;
    }
    static boolean Check_str1(String str1, String str2){
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.println("enter str1:");
        str1 = input.next();
        System.out.println("enter str2");
        str2 = input.next();
        System.out.println(Check_str(str1, str2));
        System.out.println(Check_str1(str1, str2));
    }
}
