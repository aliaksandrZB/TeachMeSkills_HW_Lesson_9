package task_1.StringEditor;

public class StringEditor {

    public static void printTwoBlocks (String str) {
        String[] strArr = str.split("-");
        System.out.println(strArr[0] + "-" + strArr[2]);
    }

    public static void replacingLetters (String str) {
        String[] strArr = str.split("-");
        System.out.println(str.replace(strArr[1], "   ").replace(strArr[3], "   "));
    }

    public static void onlyLowercaseLetters (String str) {
        String[] strArr = str.split("-");
        String str2 = strArr[1] + "/" + strArr[3] + "/" + strArr[4].toCharArray()[1] + "/" + strArr[4].toCharArray()[3];
        System.out.println(str2.toLowerCase());
    }

    public static void onlyUppercaseLetters (String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '-') {
                sb.setCharAt(i, '/');
            }
            if (sb.charAt(i) >= 49 && sb.charAt(i) <= 57  ) {
                sb.deleteCharAt(i--);
            }
        }
        sb.deleteCharAt(0).deleteCharAt(3);
        sb.insert(9, '/');
        System.out.println(sb.toString().toUpperCase());
    }

    public static void doesContainSubstring (String str, String str2) {
        if (str.toLowerCase().contains(str2.toLowerCase())) {
            System.out.println("The substring \"" + str2 + "\" is contained in the string");
        } else {
            System.out.println("There is no substring \"" + str2 + "\" in the string string");
        }
    }

    public static void startsWith (String str, String str2) {
        if (str.indexOf(str2) == 0) {
            System.out.println("The string starts with a substring \"" + str2 + "\"");
        } else {
            System.out.println("The string does not start with a substring \"" + str2 + "\"");
        }
    }

    public static void endsWith (String str, String str2) {
        if (str.lastIndexOf(str2) == str.length() - 4) {
            System.out.println("The string ends with a substringg \"" + str2 + "\"");
        } else {
            System.out.println("The string does not end with a substring \"" + str2 + "\"");
        }
    }



}
