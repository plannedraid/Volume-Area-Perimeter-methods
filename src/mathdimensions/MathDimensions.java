/*
 * Dylan Moore
 * Oct 31 2019
 * Program uses user input to determin a rectangles perimeter, area, and volume as well as a triangle
 * perimeter and area using methods 
 */
package mathdimensions;

import java.util.Scanner;

/**
 *
 * @author dymoo6791
 */
public class MathDimensions {

    /**
     * // @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do {
            System.out.println("-----------------------------");
            System.out.println("1 Perimiter of a rectangle");
            System.out.println("2 Area of a rectangle");
            System.out.println("3 Volume of a rectangle prism"); //prompt user
            System.out.println("4 Perimeter of triangle");
            System.out.println("5 Area of triangle");
            System.out.println("6 Exit program");

            int select = input.nextInt(); //user input
            if (select == 1) {
                System.out.println("Enter first dimension"); //prompt user for first side
                int sideA = input.nextInt();
                System.out.println("Enter second dimension"); //prompt user for second side
                int sideB = input.nextInt();
                rectPerimeter(sideA, sideB); //calls to rectPerimeter method and outputs answer
            } else if (select == 2) {
                System.out.println("Enter first dimension"); //prompt user for first side
                int sideA = input.nextInt();
                System.out.println("Enter second dimension"); //prompt user for second side
                int sideB = input.nextInt();
                rectArea(sideA, sideB); //calls to rectArea method and outputs answer
            } else if (select == 3) {
                System.out.println("Enter first dimension"); //prompt user for first side
                int sideA = input.nextInt();
                System.out.println("Enter second dimension"); //prompt user for second side
                int sideB = input.nextInt();
                System.out.println("Enter third dimension"); //prompt user for third side
                int sideC = input.nextInt();
                rectVolume(sideA, sideB, sideC); //calls to rectVolume method and outputs answer
            } else if (select == 4) {
                System.out.println("Enter first dimension"); //prompt user for first side
                int sideA = input.nextInt();
                System.out.println("Enter second dimension"); //prompt user for second side
                int sideB = input.nextInt();
                System.out.println("Enter third dimension"); //prompt user for third side
                int sideC = input.nextInt();
                triPerimeter(sideA, sideB, sideC); //calls to triPerimeter method and outputs answer
            } else if (select == 5) {
                System.out.println("Enter base"); //prompt user for base
                int sideA = input.nextInt();
                System.out.println("Enter height"); //prompt user for height
                int height = input.nextInt();
                triArea(sideA, height); //calls to triArea method and outputs answer
            } else if (select == 6) {
                run = false; //ends program
            }
        } while (run == true);
    }

    /**
     * rectPerimeter() Method receives 2 integers and multiplies each by 2 then
     * adds them together to output the perimeter in the main program
     *
     * @param n1
     * @param n2
     */
    public static void rectPerimeter(int n1, int n2) {
        int add = n1 * 2 + n2 * 2;
        System.out.println("Perimeter is " + add);
    }

    /**
     * rectVolume() Method receives 3 integers then multiplies them together to
     * output the volume in the main program
     *
     * @param n1
     * @param n2
     * @param n3
     */
    public static void rectVolume(int n1, int n2, int n3) {
        int vol = n1 * n2 * n3;
        System.out.println("Volume is " + vol);
    }

    /**
     * rectArea() Method receives 2 integers then multiplies them together to
     * output the area in the main program
     *
     * @param n1
     * @param n2
     */
    public static void rectArea(int n1, int n2) {
        int area = n1 * n2;
        System.out.println("Area is " + area);
    }

    /**
     * triArea() Method receives 2 integers then multiplies them together then
     * divides the total by 2 to output the area in the main program
     *
     * @param n1
     * @param n2
     */
    public static void triArea(int n1, int n2) {
        int area = n1 * n2 / 2;
        System.out.println("Area is " + area);
    }

    /**
     * triPerimeter() Method receives 3 integers then adds them together to
     * output the perimeter in the main program
     *
     * @param n1
     * @param n2
     * @param n3
     */
    public static void triPerimeter(int n1, int n2, int n3) {
        int perimeter = n1 + n2 + n3;
        System.out.println("Perimeter is " + perimeter);
    }
}
