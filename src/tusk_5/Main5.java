package tusk_5;

import java.util.Scanner;
import static java.lang.String.valueOf;

public class Main5 {

    public static void main(String[] args) {

        System.out.println("string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();    //     bookkeeper   -   для вставки
//        String str = "bookkeeper";

        char[] charArr = str.toCharArray();
        char[] newStr = new char[str.length() * 2];
        for (int i = 0, j = 0; j < str.length(); i += 2) {
            newStr[i] = charArr[j];
            newStr[i + 1] = charArr[j++];
        }

        System.out.println(valueOf(newStr));

    }

}
