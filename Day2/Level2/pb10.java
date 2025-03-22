import java.util.Scanner;
public class pb10{
    public static void main(String[] args){
     int no_of_chocolate, no_of_children;
     Scanner input = new Scanner(System.in);
     System.out.println("enter number of children: ");
     no_of_children = input.nextInt();
     System.out.println("enter number of chocolate: ");
     no_of_chocolate = input.nextInt();
     System.out.println("The number of chocolates each child gets is "+no_of_chocolate/no_of_children+" and the number of remaining chocolates are "+no_of_chocolate%no_of_children); 
    }
}