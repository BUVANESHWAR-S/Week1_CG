import java.util.Scanner;
public class pb6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int feets, miles, yards;
        System.out.println("enter the distance in feets: ");
        feets = input.nextInt();
        yards = feets/3;
        miles = yards/1760;
        System.out.printf("%d feets is equivalent to %d miles and %d yards", feets, miles, yards);
    }
}
