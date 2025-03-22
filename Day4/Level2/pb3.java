import java.util.Arrays;
import java.util.Scanner;
public class pb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        //int[] arr_1 = new int[10];
        System.out.println("enter the value");
        for (int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sec_largest && arr[i] != largest){
                sec_largest = arr[i];
            }
        }

        System.out.printf("largest number %d\n",largest);
        if(sec_largest != Integer.MIN_VALUE){
            System.out.printf("Second largest number %d",sec_largest);
        }
        else{
            System.out.println("no Second largest found");
        }
    }
}
