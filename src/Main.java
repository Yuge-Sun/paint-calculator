public class Main {
    public static void main(String[] args) {
        double length = 12.0;
        double width = 10.0;
        double height = 3.0;
        double area1 = length * height;
        double area2 = width * height;
        double ceiling = length * width;
        double totalarea = 2*(area1+area2)+ceiling;
        int painttype = 2;
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
        System.out.print("Total Price of paint: £" + ((double)totalprice)/100);
    }
}
