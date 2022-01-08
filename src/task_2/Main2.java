package task_2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("string:");
        String str = sc.nextLine();    //     A nod`s as good as a wink to a blind hourse   -   для вставки
//        String str = "A nod`s as good as a wink to a blind hourse";

        String[] strArr = str.split(" ");
        String minWord = strArr[0], maxWord = strArr[0];
        for (int i = 1; i < strArr.length; ++i) {
            if (strArr[i].toLowerCase().length() <= minWord.toLowerCase().length()) {
                minWord = strArr[i];
            }
            if (strArr[i].toLowerCase().length() >= maxWord.toLowerCase().length()) {
                maxWord = strArr[i];
            }
        }
        System.out.println("Shortest word: \n" + minWord);
        System.out.println("Longest word: \n" + maxWord);

    }

}
