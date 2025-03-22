import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;

public class euclidean{
    static Scanner input = new Scanner(System.in);
    static double euclidean_distance(int x1, int y1, int x2, int y2){
        double p1, p2, d;
        p1 = x2-x1;
        p2 = y2-y1;
        d = Math.sqrt((Math.pow(p1, 2) + Math.pow(p2, 2)));
        return d;
    }
    static double[] eqn_line(int x1, int y1, int x2, int y2){
        double m, b;
        double[] y = new double[2];
        m = (y2 - y1)/(x2 - x1);
        b = y1 - (m*x1);
        y[0] = m;
        y[1] = b;
        return y;
    }
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double euc_distance;
        System.out.println("enter points: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        euc_distance = euclidean_distance(x1, y1, x2, y2);
        System.out.println(euc_distance);
        System.out.println(Arrays.toString(eqn_line(x1, y1, x2, y2)));
    }
}