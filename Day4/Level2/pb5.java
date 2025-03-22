import java.util.Arrays;
import java.util.Scanner;
public class pb5 {
    public static void main(String[] args) {
        int num, col =2;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of person");
        num = input.nextInt();
        double[][] personal_data = new double[num][3];
        String[] weight_sts = new String[num];

        for(int i = 0; i<personal_data.length; i++){
            System.out.printf("enter the person%d details\n", i+1);
            for (int j = 0; j < personal_data[i].length-1; j++) {
                personal_data[i][j] = input.nextDouble();
            }
            personal_data[i][personal_data[i].length-1] = personal_data[i][0]/(personal_data[i][1]*personal_data[i][1]);
        }
        for(int i=0 ; i<personal_data.length; i++){
            if (personal_data[i][personal_data[i].length-1] >= 18.5 && personal_data[i][personal_data[i].length-1]<=24.9) {
                weight_sts[i] = "normal weight";
            }
            else if (personal_data[i][personal_data[i].length-1] >= 25.0 && personal_data[i][personal_data[i].length-1]<=29.9) {
                weight_sts[i] = "over weight";
            }
            else if(personal_data[i][personal_data[i].length-1] > 0 && personal_data[i][personal_data[i].length-1]< 18.5){
                weight_sts[i] = "under weight";
            }
            else if(personal_data[i][personal_data.length-1]>=30){
                weight_sts[i] = "Obese";
            }
            else{
                System.out.println("incorrect input");
            }
        }
        for(int i = 0; i<weight_sts.length; i++){
            System.out.printf("person%d: %s\n",i+1, weight_sts[i]);
        }

    }
}
