import java.util.Scanner;
public class pb8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name, from_city, via_city, to_city;
        System.out.println("Enter you name: ");
        name = input.next();
        double fromtovia, viatodest, tot_dist;
        int timefrom_to_via, timevia_to_dest, tot_time;
        System.out.println("Enter from_city: ");
        from_city = input.next();
        System.out.println("Enter via_city: ");
        via_city = input.next();
        System.out.println("Enter to_city: ");
        to_city = input.next();
        System.out.println("Enter the distance from "+from_city+ " to "+ via_city+": ");
        fromtovia = input.nextDouble();
        System.out.println("Enter the distance from "+via_city+ " to " +to_city+": ");
        viatodest = input.nextDouble();
        System.out.println("Enter the time taken to reach "+via_city+ " from "+from_city+": ");
        timefrom_to_via = input.nextInt();
        System.out.println("Enter the time taken to reach "+to_city+" from "+via_city+": ");
        timevia_to_dest = input.nextInt();

        tot_dist = fromtovia + viatodest;
        tot_time = timefrom_to_via + timevia_to_dest;
        System.out.println("Total distance covered by "+name+" is "+tot_dist+" miles");
        System.out.println("Total time taken to cover "+tot_dist+" is "+tot_time+" mins");
    }
}
//next() - takes only oneword from input
//nextLine() - it take whole sentence