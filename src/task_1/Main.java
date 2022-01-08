package task_1;

import task_1.StringEditor.StringEditor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("string:");
        String str = sc.nextLine();    //     7938-FMw-2841-siL-8S1f   для вставки
//        String str = "7938-FMw-2841-siL-8S1f";

        StringEditor.printTwoBlocks(str);

        StringEditor.replacingLetters(str);

        StringEditor.onlyLowercaseLetters(str);

        StringEditor.onlyUppercaseLetters(str);

        String str2 = "abc";
        StringEditor.doesContainSubstring(str, str2);

        str2 = "555";
        StringEditor.startsWith(str, str2);

        str2 = "1a2b";
        StringEditor.endsWith(str, str2);

    }

}
