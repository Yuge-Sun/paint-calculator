import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        double length = 12.0;
        double width = 10.0;
        double height = 3.0;
*/
        System.out.print("Enter the height of the room: \n");
        Scanner myObj = new Scanner(System.in);
        double height = myObj.nextDouble();

        System.out.print("Enter the number of walls: \n");
        int numberofwalls = myObj.nextInt();
        double totalarea = 0;
        for (int i = 1 ; i <= numberofwalls ; i++) {
            System.out.print("Enter the length of wall " + i + ":\n");
            double length = myObj.nextDouble();
//            System.out.print("Enter the width of wall " + i + ":\n");
//            double width = myObj.nextDouble();
            totalarea = totalarea + length*height;
        }
        System.out.print("Enter the area of the ceiling:\n");
        double ceilingarea = myObj.nextDouble();
        totalarea = totalarea + ceilingarea;
        System.out.print("Please Select a type of paint:\nType 1: £10.00/bucket, Type 2: £19.99/bucket, Type 3: £50.00/bucket\n");
        int painttype = myObj.nextInt();
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
