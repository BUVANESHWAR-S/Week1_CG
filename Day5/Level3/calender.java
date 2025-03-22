
import java.util.Arrays;
import java.util.Scanner;
public class calender {
    static Scanner input = new Scanner(System.in);
    static String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static String get_mnth(int month_n){
        String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return arr[month_n - 1];
    }
    static boolean check_leap_yr(int yr_n){
        int leap_yr = 0;
        if(yr_n%4 == 0){
            if(yr_n%100 == 0 && yr_n % 400 != 0){
               leap_yr =1;
            }
            else{
                leap_yr = 0;
            }
        }
        if(leap_yr == 1){
            return false;
        }
        else{
            return true;
        }
    }
    static int get_dates(int month_n, int yr_n){
        int[] arr = {31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        
        if(check_leap_yr(yr_n)){
            arr[1] = 29;    
        }
        else{
            arr[1] = 28;
        }
        return arr[month_n-1];
    }
    static int get_first_day(int month_n, int yr_n){
        int d =1, y, m, y0, x, m0, d0;
        y = yr_n;
        m = month_n;
        y0 = y- (14 - m) / 12;
        x = y0 + y0/4 - y0/100 + y0/400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + 31*m0 / 12) % 7;
        return d0;

    }
    public static void main(String[] args) {
        int month_n, yr_n;
        System.out.println("enter the month: ");
        month_n = input.nextInt();
        System.out.println("enter year: ");
        yr_n = input.nextInt();
        String m = get_mnth(month_n);
        int f_day = get_first_day(month_n, yr_n);
        System.out.println(m +" "+yr_n);
        int d = get_dates(month_n, yr_n);
        for(String i : days){
            System.out.print(i+"");
        }
        System.out.println();
        for(int i = 0; i<f_day;i++){
            System.out.print("   ");
        }
        for (int date = 1; date<=d; date++){
            System.out.printf("%3d", date);
            if((f_day + date)%7 == 0){
                System.out.println();
            }
        }
    }
}
