import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        int userX = scan.nextInt();

        System.out.println("Enter y: ");
        int userY = scan.nextInt();

        Circle circle16 = new Circle(new Point(userX, userY), 16.0);

        Circle circle40 = new Circle(new Point(14,12), 40.0);

        if(circle16.intersects(circle40)){
            System.out.println("Circles intersect!");
        }
        else{
            System.out.println("Circles do not intersect!");
        }
    }
}
