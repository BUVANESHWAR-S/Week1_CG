import java.util.Scanner;
public class pb5{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.println("enter fahrenheit value: ");
        fahrenheit = inp.nextFloat();
        celsius = (fahrenheit - 32)*5/9;
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsius+ " celsius");
    }
}