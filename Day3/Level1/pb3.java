import java.util.Scanner;
public class pb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum;
        System.out.println("enter a natural number: ");
        num = input.nextInt();
        if(num >= 0){
            sum = num*(num+1)/2;
            System.out.printf("The sum of %d natural numbers is %d",num, sum);
        }
        else{
            System.out.printf("%d is not a natural number",num);
        }
    }
}
