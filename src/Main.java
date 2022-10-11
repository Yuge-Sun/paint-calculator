import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
/*        double length = 12.0;
        double width = 10.0;
        double height = 3.0;
*/
        System.out.print("Enter the height of the room: \n");
        Scanner userinput = new Scanner(System.in);
        double height = userinput.nextDouble();
        System.out.print("Enter the number of walls: \n");
        int numberofwalls = userinput.nextInt();
        double totalarea = 0;
        for (int i = 1 ; i <= numberofwalls ; i++) {
            System.out.print("Enter the length of wall " + i + ":\n");
            double length = userinput.nextDouble();
            totalarea = totalarea + length*height;
            System.out.print("Enter the number of obstacles on this wall: \n");
            int obstaclenum = userinput.nextInt();
            double obstacles[] = new double[obstaclenum];
            for (int j = 0 ; j < obstaclenum ; j++) {
                int k=j+1;
                System.out.print("Enter the length of obstacle " + k + ":\n");
                double obstaclelength = userinput.nextDouble();
                System.out.print("Enter the width of obstacle " + k + ":\n");
                double obstaclewidth = userinput.nextDouble();
                obstacles[j] = obstaclelength*obstaclewidth;
                totalarea = totalarea - obstacles[j];
            }
//            System.out.print("Enter the width of wall " + i + ":\n");
//            double width = userinput.nextDouble();
        }
        System.out.print("Enter the area of the ceiling:\n");
        double ceilingarea = userinput.nextDouble();
        totalarea = totalarea + ceilingarea;
        System.out.print("Please Select a type of paint:\nType 1: £10.00/bucket, Type 2: £19.99/bucket, Type 3: £50.00/bucket\n");
        int painttype = userinput.nextInt();
        int paintprice = 0;
        int paintpriceA = 1000;
        int paintpriceB = 1999;
        int paintpriceC = 5000;
        switch (painttype) {
            case 1:
                paintprice = paintpriceA;
                break;
            case 2:
                paintprice = paintpriceB;
                break;
            case 3:
                paintprice = paintpriceC;
                break;
            default:
                System.out.print("Wrong Paint Type");
        }
        double bucketsofpaintperarea = 0.1;
        double bucketsofpaintneeded = totalarea * bucketsofpaintperarea;
        System.out.print((int)Math.ceil(bucketsofpaintneeded) + " Bucket(s) of Paint Needed\n");
        int totalprice = (int)Math.ceil(bucketsofpaintneeded) * paintprice;
        System.out.print("Total Price of Paint: £" + ((double)totalprice)/100);
    }
}
