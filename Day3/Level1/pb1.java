import java.util.Scanner;
public class pb1 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        num = input.nextInt();
        if(num%5 == 0){
            System.out.printf("%d is divisible by 5 ",num);
        }
        else{
            System.out.printf("%d is not divisible by 5 ", num);
        }
    }
}
