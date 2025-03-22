import java.util.Scanner;
public class pb3{
    public static void main(String[] args){
        double a, b, c;
        double op1, op2, op3, op4;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a: ");
        a = input.nextDouble();
        System.out.println("enter b: ");
        b = input.nextDouble();
        System.out.println("enter c: ");
        c = input.nextDouble();
        op1 = a+b*c;
        op2 = a*b+c;
        op3 = c+a/b;
        op4 = a%b+c;
        System.out.println("The results of Int Operations are " +op1+", "+op2+", "+op3+ " and " +op4);
 

    }
}