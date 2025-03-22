import java.util.Scanner;
public class substr {
    static String get_substr(String str, int i1, int i2){
        String sub_str = "";
        if(i1-1 > str.length() || i2-1>str.length()){
            //System.out.println("invalid");
            return "invalid";
        }
        else{
            for(int i = i1-1; i<i2;i++){
                sub_str += str.charAt(i);
            }
            
        }
        return sub_str;
    }
    static String substr(String str, int i1, int i2){
        String substr;
        substr = str.substring(i1-1, i2);
        return substr;
    }
    static boolean cmpr_substr(String sub_str1, String sub_str2){
        if(sub_str1.length() != sub_str2.length()){
            return false;
        }
        else{
            for(int i = 0; i<sub_str1.length(); i++){
                if(sub_str1.charAt(i) != sub_str2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str, sub_str1, sub_str2;
        int i1, i2;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        str = input.next();
        System.out.println("enter the start and end index: ");
        i1 = input.nextInt();
        i2 = input.nextInt();
        sub_str1 = get_substr(str, i1, i2);
        sub_str2 = substr(str, i1, i2);
        System.out.println(cmpr_substr(sub_str1, sub_str2));
    }
}
