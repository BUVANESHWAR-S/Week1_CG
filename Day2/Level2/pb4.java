import java.util.Scanner;
public class pb4{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.println("enter celsius value: ");
        celsius = inp.nextFloat();
        fahrenheit = (celsius*9/5)+32;
        System.out.println("The "+celsius+" celsius is "+fahrenheit+ " faranheit");
    }
}