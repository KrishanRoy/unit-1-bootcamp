import com.sun.deploy.util.StringUtils;

import java.util.Random;

public class Methods {

    public static void main(String args[]) {
        prettyInteger(4);
        longerPrettyInteger(4);
        System.out.println(random(5 , 10));
    }

    public static int calculateSquare(int num) {
        int squareOfTheInt = num * num;
        return squareOfTheInt;
    }

    public static double calculateSquareRoot(int num) {
        double squareRootOfTheInt = Math.sqrt(num);
        return squareRootOfTheInt;
    }

    public static String toLowerCase(String word) {
        String turnLowerCase = word.toLowerCase();
        return turnLowerCase;
    }

    public static boolean isMultiple(int a, int b) {

        return b % a == 0;
    }

    public static void prettyInteger(int num) {
        String asteriks = "";
        for (int i = 0; i < num; i++) {
            asteriks += "*";
        }
        System.out.println(asteriks + num + asteriks);

    }

    public static void longerPrettyInteger(int num) {
        String withAsteriks = "";
        StringBuilder builder = new StringBuilder(num);
        for (int i = 0; i < num; i++) {
            builder.append("*");
        }
        String newStr = builder.toString();
        System.out.println(newStr + num + newStr);
    }
    public static int random (int a, int b){
        Random randomNumber = new Random();
        int number = 0;
        int max = 0;
        int min = 0;
        if (a > b) {
             max = a;
             min = b;
             number = min + randomNumber.nextInt((max - min + 1));
        }
        if (b > a){
            max = b;
            min = a;
            number = min + randomNumber.nextInt((max - min + 1));
        }
        return number;
    }
}
