public class RectangleCalculator {
    public static void main(String[]args){
        double length = 12.5;
        double width = 8.0;
        double area;
        double perimter;

        //find area
        area = length * width;

        //find perimeter
        perimter = 2 * (length + width);


        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimter);



    }
}
