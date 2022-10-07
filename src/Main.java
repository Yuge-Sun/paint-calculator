public class Main {
    public static void main(String[] args) {
        double length = 12.0;
        double width = 10.0;
        double height = 3.0;
        double area1 = length * height;
        double area2 = width * height;
        double ceiling = length * width;
        double totalarea = 2*(area1+area2)+ceiling;
        double bucketsofpaintperarea = 0.1;
        double bucketsofpaintneeded = totalarea * bucketsofpaintperarea;
        System.out.print((int)Math.ceil(bucketsofpaintneeded) + " Bucket(s) of Paint Needed");
    }
}
