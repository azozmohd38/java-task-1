public class RectangleCalculator {
    public static void main(String[]args){
        final double length = 12.5;
        final double width = 8.0;
        double area;
        double perimeter;

        //find area
        area = length * width; // calculate the rectangle area

        //find perimeter
        perimeter = 2 * (length + width);


        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area); // display the area
        System.out.println("Perimeter: " + perimeter);



    }
}
