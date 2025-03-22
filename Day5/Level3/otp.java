import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class otp {
    static int[] otp_ = new int[10];
    static void generate_otp(){
        for(int i = 0; i<otp_.length; i++){
            otp_[i] = (int)(Math.random()*900000)+100000;
        }
    }
    static boolean check_unique(int[] otp_){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : arr){
            if(arr.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        generate_otp();
        System.out.println(Arrays.toString(otp_));
        System.out.println(check_unique(otp_));
    }
}
