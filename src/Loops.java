
public class Loops {

    public static void main(String args[]) {
        System.out.println(withoutX("pxhixl"));
    }
    //1. Write a method that prints the numbers 1 through 10 using a loop.
    //=================================================================================================================================

    public static void printOneToTen() {
        String num = "";
        for (int i = 1; i <= 10; i++) {
            num = num + i + " ";
        }
        System.out.println(num);
    }
    //2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
    //=================================================================================================================================

    public static void printOneToTenDifferentKind() {
        StringBuilder builder = new StringBuilder(10);
        for (int i = 1; i <= 10; i++) {
            builder.append(i + " ");
        }
        System.out.println(builder.toString());
    }
    //2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
    //=================================================================================================================================

    public static void printOneToTenAnotherKind() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
    //3. Write a method that takes in an `int` n and prints the numbers 1 through n.
    //=================================================================================================================================

    public static void printOneToN(int n) {
        StringBuilder builder = new StringBuilder(n);
        for (int i = 1; i <= n; i++) {
            builder.append(i + " ");
        }
        System.out.println(builder.toString());
    }
    //4. Write a method that takes in an `int` n and prints the even numbers 2 through n.
    //=================================================================================================================================

    public static void printEvenNumbers(int n) {
        StringBuilder builder = new StringBuilder(n);
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                builder.append(i + " ");
            }
        }
        System.out.println(builder.toString());
    }
    //5. Write a method that prints the sum of 1 through 10 using a loop.
    //=================================================================================================================================

    public static void addOneToTen() {
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(num);
    }

    //6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.
    //=================================================================================================================================

    public static void addOneToN(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += i;
        }
        System.out.println(num);
    }

    //7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
    //=================================================================================================================================

    public static void addOneToTenThousand() {
        int num = 0;
        for (int i = 1; i <= 10000; i++) {
            num += i;
        }
        System.out.println(num);
    }

    //8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times. If n is negative, print "".
    //=================================================================================================================================

    public static void printOutS(int n, String s) {
        if (n >= 0)
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        if (n < 0) {
            System.out.println("");
        }
    }
    //9. Modify the method to print out the string concatenated with itself n times.
    //=================================================================================================================================


    public static void printConcatanatedString(int n, String s) {
        StringBuilder builder = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        System.out.println(builder.toString());
    }

    //10. Write a method that prints the first ten Fibonnaci numbers.
    //=================================================================================================================================

    public static void printFirstTenFibonacciNumbers() {
        int n = 10, t1 = 0, t2 = 1;
        int total = 0;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    //11. Write a method to sum the first ten Fibonnaci numbers.
    //=================================================================================================================================

    public static void printFirstTenFibonacciNumbersAddition() {
        int n = 10, t1 = 0, t2 = 1;
        int total = 0;
        System.out.print("After Adding First " + n + " terms: ");
        for (int i = 1; i <= n; i++) {

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            total = sum - 1;
        }
        System.out.println(total);
    }
    //12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.
    //=================================================================================================================================

    public static void printNFibonacciNumbersAddition(int n) {
        int t1 = 0, t2 = 1;
        int total = 0;
        System.out.print("After Adding First " + n + " terms: ");
        for (int i = 1; i <= n; i++) {

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            total = sum - 1;
        }
        System.out.println(total);
    }

    //HackerRank Warmup 1
    //=================================================================================================================================
    //public static int sockMerchant(int n , int [] arr);

    public static String withoutX(String str) {
        // if (str.length() < 2 && !str.equals("x")){
        //   return str;
        // }
        // if (str.length() < 2 && str.equals("x")){
        //   return "";
        // }
        // if(str.length() == 2 && str.equals("xx")){
        //   return "";
        // }
        // if(str.length() == 2 && str.charAt(0) == 'x'){
        //   return str.substring(1);
        // }
        // if((str.length() == 2 && !str.equals("xx"))
        // || (str.length() >= 2 && str.charAt(0) != 'x' && str.charAt(str.length()-1) != 'x')){
        //   return str;
        // }
        // if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(str.length()-1) != 'x'){
        //   return str.substring(1);
        // }
        // if (str.length() > 2 && str.charAt(0) != 'x' && str.charAt(str.length()-1) == 'x'){
        //   return str.substring(0, str.length()-1);
        // }
        // return str.substring(1, str.length() -1);
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
            str = str.substring(0, str.length()-1);
        }

        return str;
    }



}
