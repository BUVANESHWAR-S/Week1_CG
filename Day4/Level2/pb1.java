import java.util.Scanner;
public class pb1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary, y_o_s, bonus, new_salary;
        salary = y_o_s = bonus = new_salary = new double[10];

        for(int i = 0; i<salary.length; i++){
            System.out.println("enter the salary for employer"+(i+1)+":");
            salary[i] = input.nextDouble();
            System.out.println("enter the year_of_experience of employer"+(i+1)+":");
            y_o_s[i] = input.nextDouble();
        }
        for(int i = 0; i<y_o_s.length;i++){
            if(y_o_s[i] >= 5){
                bonus[i] = salary[i]*(5f/100f);
            }
            else if(y_o_s[i] >0 && y_o_s[i]<5){
                bonus[i] = salary[i]*(2f/100f);
            }
            else{
                System.out.println("invalid");
            }
        }
        for(int i = 0; i<salary.length; i++){
            new_salary[i] = salary[i] + bonus[i];
            System.out.printf("employer%d - bounus: %f, old_salary: %f, new_salary: %f", i+1, bonus[i], salary[i], new_salary[i]);
        }


    }
}
