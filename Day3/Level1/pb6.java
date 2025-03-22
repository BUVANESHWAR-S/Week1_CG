import java.util.Scanner;
public class pb6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, date;
        System.out.println("enter the month and date: ");
        month = input.nextInt();
        date = input.nextInt();
        boolean is_spring = false;
        if(month >= 3 && month<=6){
            if(date > 0 && date<=31){
                is_spring = true;
                if((month == 3 && date >=20)||(month == 6 && date <= 20)){
                    is_spring = true;
                }
                else{
                    is_spring = false;
                }
            }
            else{
                System.out.println("invalid date");
            }
        }else{
            is_spring = false;
        }
        if(is_spring){
            System.out.println("its a spring season");
        }
        else{
            System.out.println("its not a spring season");
        }
    }
}
