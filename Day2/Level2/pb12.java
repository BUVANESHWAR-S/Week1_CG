import java.util.Scanner;
public class pb12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pound, kilogram;
        System.out.println("enter your weight in pounds: ");
        pound = input.nextDouble();
        kilogram =pound/2.2;
        System.out.printf("The weight of the person in pound is %f and in kg is %f",pound, kilogram);
    }
}
