import java.util.Scanner;
public class pb6{
    public static void main(String[] args){
        int salary, bonus, tot_income;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary: ");
        salary = input.nextInt();
        System.out.println("enter your bonus: ");
        bonus = input.nextInt();
        tot_income = salary + bonus;
        System.out.println("The salary is INR "+salary+ " and bonus is INR "+bonus+" . Hence Total Income is INR " +tot_income);

    }
}