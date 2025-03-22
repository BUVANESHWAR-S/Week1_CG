import java.util.Scanner;
public class pb7 {
    public static void main(String[] args) {
     int no_of_students, no_of_handshakes;
     Scanner input = new Scanner(System.in);
     System.out.println("enter number of students: ");
     no_of_students = input.nextInt();
     no_of_handshakes = (no_of_students*(no_of_students-1))/2;
     System.out.printf("no of possible handshakes: %d",no_of_handshakes);
     input.close();
    }
}
