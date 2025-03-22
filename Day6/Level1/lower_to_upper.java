import java.util.Scanner;
public class lower_to_upper {
    static String str_(String str){
        String str_ = "";
        int asci;
        for(int i =0; i<str.length(); i++){
            if((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90){
                asci = (int)(str.charAt(i)) + 32;
                str_ += (char)asci;
               
            }
            else if((int)(str.charAt(i))>=97 && (int)(str.charAt(i))<=122){
                str_ += str.charAt(i);
            }
            else{
                str_ += str.charAt(i);
            }

        }
        return str_;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println(str_(str));
        
    }
}
