import java.util.Scanner;
public class pb5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fee, discounted_amnt, final_price, discount_per;
        System.out.println("enter the fee amount: ");
        fee = input.nextFloat();
        System.out.println("enter the discount percentage: ");
        discount_per = input.nextFloat();
        discounted_amnt = fee*(discount_per/100);
        final_price = fee- discounted_amnt;
        System.out.printf("The discount amount is INR %f and final discounted fee is INR %f", discounted_amnt, final_price);
    }
}
