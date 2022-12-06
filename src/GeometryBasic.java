import java.util.Scanner;

public class GeometryBasic {

    public static void main(String args[]){

        // Get input from the user through console.
        Scanner scan = new Scanner(System.in);

        //find area of the square
        System.out.println("Please input first area of the square: ");
        double side1 = scan.nextDouble();
        System.out.println("Please input second area of the square: ");
        double side2 = scan.nextDouble();
        double resultSquare = side1 * side2;
        System.out.println("The result is " + resultSquare);

        //find area of the square where one side does not equal each other
        //Rectangular
        System.out.println("Please input first area of the square: ");
        double RecSide1 = scan.nextDouble();
        System.out.println("Please input second area of the square: ");
        double RecSide2 = scan.nextDouble();
        double resultRec = RecSide1 * RecSide2;
        System.out.println("The result is " + resultSquare);

        //Rhombus or Parallelogram (ด้านเท่า / ขนมเปียกปูน)
        System.out.println("Please input first area of the square: ");
        double PlgB = scan.nextDouble();
        System.out.println("Please input second area of the square: ");
        double PlgH = scan.nextDouble();
        double resultPlg = PlgB * PlgH;
        System.out.println("The result is " + resultPlg);
        /* Or else use this: (vector) / 2 */

        //Trapezoid
        System.out.println("Please input first area of the square: ");
        double parallel1 = scan.nextDouble();
        System.out.println("Please input second area of the square: ");
        double parallel2 = scan.nextDouble();
        System.out.println("Please input height of the square: ");
        double parallelHeight = scan.nextDouble();
        double resultTrapez = (parallel1 + parallel2 / 2) * parallelHeight;
        System.out.println("The result is " + resultPlg);
        /* Or else use this: (vector) / 2 */

        //Triangle
        System.out.println("Please input first area of the triangle: ");
        double TriB = scan.nextDouble(); // Base
        System.out.println("Please input second area of the triangle: ");
        double TriH = scan.nextDouble(); // Height
        double resultTri = (TriB * TriH) / 2;
        System.out.println("The result is " + (resultTri));
        /* Or else use this: (vector) / 2 */

        //find area of the circle

        System.out.println("Please input radius of the circle: ");
        double r = scan.nextDouble();
        System.out.println("Calculating... ");
        double resultCircle = (2 * (Math.PI) * r);
        System.out.println("The result is " + resultCircle);
        //Cross check result
        System.out.println("Cross check result = " + Math.PI * (r + r));


    }
}