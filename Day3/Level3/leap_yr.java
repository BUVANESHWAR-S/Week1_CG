import java.util.Scanner;
public class leap_yr {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a year: ");
        year = input.nextInt();
        boolean is_leap_yr = false;
        if((year%400 == 0)||((year%4 == 0) && (year%100 != 0))){
            is_leap_yr = true;
        }
        else{
            is_leap_yr = false;
        }

        if(is_leap_yr){
            System.out.println("leap year");
        }
        else{
            System.out.println("non-leap year");
        }
    }
}

// if(year >= 1582 && year%4 == 0){
//     is_leap_yr = true;
//     if(year%100 == 0 ){
//         if(year%400 == 0){
//         is_leap_yr = true;
//     }
//         else{
//             is_leap_yr = false;
//         }
// }
// }
// else{
//     is_leap_yr = false;
// }