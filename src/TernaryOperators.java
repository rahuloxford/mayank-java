import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Short hand for if else

        // datatype variable = (condition) ? data : data;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);

    }
}
