import java.util.Scanner;

public class Week3HW {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int firstUserInput = in.nextInt();
        int secondUserInput = in.nextInt();

        System.out.println(returnUserInputs(firstUserInput, secondUserInput));

    }
    public static int returnUserInputs(int x, int y) {
        return x + y;
    }
}
