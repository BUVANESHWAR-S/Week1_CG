import java.util.Scanner;
public class pb2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for(int i = 0; i<name.length;i++){
            System.out.printf("enter the height and age of %s\n", name[i]);
            height[i] = input.nextDouble();
            age[i] = input.nextInt();
        }
        String older_p = name[0];
        int older = age[0];
        String taller_p = name[0];
        double taller = height[0];
        for (int j = 1; j<(name.length); j++){
            if(older < age[j]){
                older = age[j];
                older_p = name[j];
            }
            if(taller < height[j]){
                taller = height[j];
                taller_p = name[j];
            }

        }
        System.out.printf("%s is the tallest among all three\n", taller_p);
        System.out.printf("%s is oldest among all three", older_p);
    }
}
