import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class pb4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, remainder;
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("enter a number:");
        number = input.nextInt();
        int count = 0;
        while(number>0){
            remainder = number%10;
            number /= 10;
            arr.add(remainder);
        }
        System.out.println(arr);
    }
}
