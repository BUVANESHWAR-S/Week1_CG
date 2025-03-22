import java.util.ArrayList;
import java.util.Scanner;
public class str1 {
    static char[] char_(String str){
        char[] char_arr = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            char_arr[i] = str.charAt(i);
        }
        return char_arr;
    }
    static char[] char_1(String str){
        char[] a = str.toCharArray();
        return a;
    }
    static boolean cmpr(char[] arr, char[] a){
        if (arr.length != a.length) {
            return false;
        }
        else{
            for(int i = 0; i<arr.length; i++){
                if(arr[i] != a[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
        char[] char_arr = char_(str);
        char[] a = char_1(str);
        System.out.println(cmpr(char_arr, a));
    }
}
