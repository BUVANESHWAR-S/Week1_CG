import java.util.Scanner;
public class array_out_index {
    static String gen_ex(String[] names){
        return names[names.length+1];
    }
    static void aray_out_ind_ex(String[] names){
        try{
            gen_ex(names);
        }
        catch(ArrayIndexOutOfBoundsException aoe){
            System.out.println("Index out of bound");
        }
    }
    public static void main(String[] args) {
        String[] names = {"hellie", "jibbie", "Reshma", "Buvaneshwar", "no-one"};
        aray_out_ind_ex(names);
    }
}
