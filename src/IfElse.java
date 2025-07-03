import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // print if a user can vote??
        System.out.print("How old are you? ");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        // print if its cold or hot outside??
        // (if temperature < 25 = cold)
        System.out.print("What is the temperature? ");
        float temperature = in.nextFloat();

        if (temperature < 25) {
            System.out.println("Cold weather");
        } else {
            System.out.println("Hot weather");
        }
    }
}
