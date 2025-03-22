import java.util.Scanner;
public class pb1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, remainder, quotient;
        System.out.println("enter num1: ");
        num1 = input.nextInt();
        System.out.println("enter num2: ");
        num2 = input.nextInt();
        remainder = num1%num2;
        quotient = num1/num2;
        System.out.println("The Quotient is " +quotient+" and Reminder is " +remainder+ " of two number "+num1+ " and "+num2);
    }
}