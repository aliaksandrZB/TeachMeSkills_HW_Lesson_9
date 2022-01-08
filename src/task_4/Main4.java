package task_4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("string:");
        String str = sc.nextLine();    //     sdf jiowfq nfrrfn idfgjgfdi pqi i   -   для вставки
//        String str = "sdf jiowfq nfrrfn idfgjgfdi pqi i";

        if (str.trim().isEmpty()) {
            System.out.println("the string is empty");
            return;
        }

        String[] strArr = str.split(" ");
        System.out.println("string number:");
        int numWord = sc.nextInt();
//        int numWord = 3;

        if (numWord < 1 || numWord > strArr.length) {
            System.out.println("String number entered incorrectly");
            return;
        }

        boolean flag = true;
        for (int i = 0; i < strArr[numWord - 1].length() / 2; ++i) {
            if (strArr[numWord - 1].charAt(i) != strArr[numWord - 1].charAt(strArr[numWord - 1].length() - 1 - i)) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("the word is a palindrome");
        } else {
            System.out.println("the word is not a palindrome");
        }



    }

}
