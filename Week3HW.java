import java.util.Scanner;

public class Week3HW {
    public static void main(String[] args) {

        //  Write a Java program that takes two numbers as input and display the product of two numbers.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");

        int firstUserInput = in.nextInt();
        int secondUserInput = in.nextInt();

        System.out.println(returnUserInputs(firstUserInput, secondUserInput));

        // Write a Java program that reads a number in inches, converts it to meters.
        // Note: One inch is 0.0254 meter. Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters

        double inches = in.nextDouble();

        System.out.println(inchesToMeters(inches));


    }
    public static int returnUserInputs(int x, int y) {
        return x + y;
    }
    public static double inchesToMeters(double x) {
        return x * 0.0254;
    }
}
