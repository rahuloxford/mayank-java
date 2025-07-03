import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // How to take input from the user??

        // To take input from the user we need to create
        // A obj of scanner class

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a byte number: ");
//        byte number1 = sc.nextByte();
//        System.out.println(number1);
//
//        System.out.print("Enter a short number: ");
//        short number2 = sc.nextShort();
//        System.out.println(number2);
//
//        System.out.print("Enter a int number: ");
//        int number3 = sc.nextInt();
//        System.out.println(number3);
//
//        System.out.print("Enter a long number: ");
//        long number4 = sc.nextLong();
//        System.out.println(number4);
//
//        System.out.print("Enter a float number: ");
//        float number5 = sc.nextFloat();
//        System.out.println(number5);
//
//        System.out.print("Enter a double number: ");
//        double number6 = sc.nextDouble();
//        System.out.println(number6);


//        System.out.print("Enter your name: ");
////        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println(name);


        System.out.print("Enter a single char: ");
        char letter = sc.next().charAt(0);

        System.out.println(letter);

    }
}
