
public class Conditionals {

    public static void main(String args[]) {
        System.out.println(lotteryTicket(15, 55, 75));
        System.out.println(caughtSpeedingSecondEffortKrishan(85, true));
        System.out.println(blackjack(-2, 21));

    }

    public static boolean isOdd(int n) {
        return (n % 2 == 1);
    }

    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        return ((n % 2 == 1) && (n % 3 == 0));
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        return isOdd(n) && isOddAndIsMultipleOfThree(n);
    }

    public static void fizzMultipleofThree(int n) {
        if (isOddAndIsMultipleOfThree(n)) {
            System.out.println("Fizz");
        } else {
            System.out.println("otherwise");
        }
    }

    public static boolean cigarParty(int nums, boolean isWeekend) {
        return (!isWeekend && nums >= 40 && nums <= 60)
                || (isWeekend && nums >= 40);
    }


    public static int caughtSpeedingFirstEffortKrishan(int speed, boolean isBirthday) {
        /*
        Human "readability" and computer's "performing requirements" are different. As math tutor, I expect
        ( 5 < X && something) to be written clearly to distinguish from (5 < X < 10 && !something).
        A human understands right or wrong by reading a math paper. But computer languages does computation and it requires
        conditions and when interrelated conditions are fufilled, it will not go to the next condition. for the problem solution,
        I solved it as I would in a math class. I read something that is very readable to me as a human. However, a computer
        will not only read, but also perform actions based on interrelated conditions. Here, the first If statement specifies all the
        cases that are meant for not birthday's no ticket speed limit. for the next speed test, speed >= 61 is redundant.
         */
        if ((speed <= 60 && !isBirthday)
                || (speed <= 65 && isBirthday)) {
            return 0;
        }
        if ((speed >= 61 && speed <= 80 && !isBirthday) || (speed >= 66 && speed <= 85 && isBirthday)) {
            return 1;
        }
//        if ((speed >= 81 && !isBirthday)
//                || (speed >= 86 && isBirthday)) {
//            return 2;
//        }

        return 2;
    }

    public static int caughtSpeedingSecondEffortKrishan(int speed, boolean isBirthday) {
        /*
        After removing all the redundant statements from the previous codes. Much less code and computer is okay with that. remember, computer does things for you.
        For me, I would assume the second if statement is not clear for the computer and it will confuse with the first if statement. Not really, If computer does finds
        a satisfying condition, it will not even come to the second if statement, it will simply return 0. Only, if it finds something is unsatisfying for it
        in the first if block, it will come down to the second if statement and keep doing that. Computer does not read code like human math teacher and keeps thinking,
        how much marks should be taken away from this approach. It is an efficient doer. However, it is our duty to do things easier for us. SO that the code
        we write is easier for us to read now and in the future. That is why, Ta's code is much more readable for human. My approach to have less code but it requires
        a lot of human effort that is not needed. We are not taking a math course. We want to make a machine do things for us. let us make this process easier for us.
         */
        if ((speed <= 60 && !isBirthday)
                || (speed <= 65 && isBirthday)) {
            return 0;
        }
        if ((speed <= 80 && !isBirthday) || (speed <= 85 && isBirthday)) {
            return 1;
        }
        return 2;
    }

    public static int caughtSpeedingFirstEffortForgotNameTA(int speed, boolean isBirthday) {

        /*
        The TA Organized his code around the boolean value. He organized the problem differently.
        if (true){
        do something
        }
        else{
        do something else
         */

        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            }
            if (speed <= 80) {
                return 1;
            }
            return 2;
        } else {
            if (speed <= 65) {
                return 0;
            }
            if (speed <= 85) {
                return 1;
            }
            return 2;
        }
    }

    public static int caughtSpeedingSecondEffortNameForgotTa(int speed, boolean isBirthday) {
        /*
        Solution is the same, paths differ.
        ------------------------------------
        This is a modified way of doing the same question, putting different speeds
        under the boolean condition and then putting them under another condition.
        That means different people can perceive the same problem differently. Based on their
        understanding, they can break down their problem differently. Based on how they break down,
        the solution will be same but their paths will differ.
        */
        int noTicketSpeed;
        int mediumTicketSpeed;
        if (isBirthday) {
            noTicketSpeed = 65;
            mediumTicketSpeed = 85;
        } else {
            noTicketSpeed = 60;
            mediumTicketSpeed = 80;
        }

        if (speed <= noTicketSpeed) {
            return 0;
        }
        if (speed <= mediumTicketSpeed) {
            return 1;
        }

        return 2;
    }

    public static String alarmClockInitialEffort(int day, boolean isVacation) {
        if ((day == 0 || day == 6) && isVacation) {
            return "off";
        } else if ((day == 0 || day == 6) || (day >= 1 && day <= 5 && isVacation)) {
            return "10:00";
        }
        return "7:00";

    }

    public static String alarmClockSecondEffortInspiredByTA(int day, boolean isVacation) {
        if (isVacation) {
            if (day == 0 || day == 6) {
                return "off";
            }
            if (day >= 1 && day <= 5) {
                return "10:00";
            }
        } else {
            if ((day == 0 || day == 6)) {
                return "10:00";
            }
        }
        return "7:00";
    }

    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        } else if ((a == b) || (a == c) || (b == c)) {
            return 10;
        }
        return 0;
    }

    public static int blackjack(int a, int b) {
        if ((a <= 21 && b <= 21 && (21 - a) >= (21 - b))
                || (b <= 21 && a > 21)) {
            return b;
        } else if ((a <= 21 && b <= 21) && ((21 - b) >= (21 - a))
                || (a <= 21 && b > 21)) {
            return a;
        }
        return 0;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return Math.abs(a - b) == Math.abs(b - c)
                    || Math.abs(a - c) == Math.abs(a - b)
                    || Math.abs(a - c) == Math.abs(b - c);
        }
        return (a == b) && (b == c);
    }

}
