package task_3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("string:");
        String str = sc.nextLine();    //     fffff ab f 1234 jkjk   -   для вставки
//        String str = "fffff ab f 1234 jkjk";

        String[] strArr = str.split(" ");
        StringBuilder[] sbArr = new StringBuilder[strArr.length];

        for (int i = 0; i < sbArr.length; ++i) {
            sbArr[i] = new StringBuilder("");
        }

        for (int i = 0; i < strArr.length; ++i) {
            for (int j = 0; j < strArr[i].length(); ++j) {
                if (!isAlreadySymbol(strArr[i].charAt(j), sbArr[i].toString())) {
                    sbArr[i].append(strArr[i].charAt(j));
                }
            }
        }

        int minStrNum = 0;
        for (int i = 1; i < sbArr.length; ++i) {
            if (sbArr[minStrNum].length() > sbArr[i].length()) {
                minStrNum = i;
            }
        }

        System.out.println(strArr[minStrNum]);

    }

    private static boolean isAlreadySymbol(char ch, String str) {
        if (str.indexOf(ch) != -1) {
            return true;
        }
        return false;
    }

}
