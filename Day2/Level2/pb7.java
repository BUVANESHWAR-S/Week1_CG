import java.util.Scanner;
public class pb7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, temp;
        System.out.println("enter num1: ");
        num1 = input.nextInt();
        System.out.println("enter num2: ");
        num2 = input.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are " +num1+ " and "+num2);
    }
}