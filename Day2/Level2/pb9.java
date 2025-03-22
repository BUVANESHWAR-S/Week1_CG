import java.util.Scanner;
public class pb9{
    public static void main(String[] args){
        int side1, side2, side3, perimeter, distance, laps;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of all the 3sides: ");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();
        System.out.println("enter the distance need to be covered in km: ");
        distance = input.nextInt()*1000;
        perimeter = side1+side2+side3;
        laps = distance/perimeter;
        System.out.println("The total number of rounds the athlete will run is "+laps+" to complete "+distance/1000+" km");
    }
}