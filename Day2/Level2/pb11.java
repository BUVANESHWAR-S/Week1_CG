import java.util.Scanner;
public class pb11{
    public static void main(String[] args){
        float si, p, r, t;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter principal:");
        p = inp.nextFloat();
        System.out.println("enter rate:");
        r = inp.nextFloat();
        System.out.println("enter time: ");
        t = inp.nextFloat();
        si = (p*r*t)/100;
        System.out.printf("The Simple Interest is %f for Principal %f, Rate of Interest %f and Time %f",si,p,r,t);
    }
}
