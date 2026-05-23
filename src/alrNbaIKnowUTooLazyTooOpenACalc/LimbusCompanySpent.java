package alrNbaIKnowUTooLazyTooOpenACalc;

import java.util.Scanner;

public class LimbusCompanySpent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your Lunacy: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline after nextInt()

        int pulls = n / 1300;
        int leftover = n % 1300;

        System.out.printf(
            "You have %d 10-pull(s) to spend, with %d Lunacy left over.%n",
            pulls, leftover
        );

        System.out.printf(
            "\nWould you like to know how many pulls you could get with %d Lunacy left over?%n"
            + "( Y / N ) : ",
            leftover
        );

        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("Y")) {
            int pulls2 = leftover / 130;
            int leftover2 = leftover % 130;
            System.out.printf(
                "You have %d pull(s) to spend, with %d Lunacy left over.%n",
                pulls2, leftover2
            );
        }

        sc.close();
    }
}