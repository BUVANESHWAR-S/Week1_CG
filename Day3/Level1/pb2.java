import java.util.Scanner;
public class pb2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if(num1>num2 && num1>=num3){
            System.out.printf("%d is the largest number",num1);
        }
        else if (num2 >= num3) {
            System.out.printf("%d is the largest number",num2);
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println("all thre numbers are equal");
        }
        else{
            System.out.printf("%d is the largest number",num3);
        }
    }
}

// if(num1<num2 && num1<num3){
//     System.out.printf("%d is the smallest number",num1);
// }
// else{
//     System.out.printf("%d is not the smallest number", num1);
// }