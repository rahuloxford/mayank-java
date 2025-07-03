public class VarTypes {
    public static void main(String[] args) {

        byte number1 = 100; // 1 byte (8 bit) limit (-128 to 127)
        System.out.println(number1);
        short number2 = 23_454; // 2 byte (16 bit) limit (-32768 to 32767)
        System.out.println(number2);
        int number3 = 3463562; // 4 byte (32 bit) limit (-2147483648 to 2147483647)
        number3 = 250;
        System.out.println(number3);
        long number4 = 9_223_372_036_854_775_807L; // 8 byte (64 bit) limit (-9,223,372,036,854,775,807 to 9,223,372,036,854,775,807)
        System.out.println(number4);

        float pi = 3.1415F;
        System.out.println(pi);
        double ratio = 0.15267964575;
        System.out.println(ratio);
        char letter = 'A';
        System.out.println(letter);
        boolean isWinter = true;
        System.out.println(isWinter);

        String name = "Lady Mormount";
        System.out.println(name);

    }
}
