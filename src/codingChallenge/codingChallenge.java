package codingChallenge;

public class codingChallenge {
    public static void main(String[] args) {
        System.out.println(inRange(90, 100));
        System.out.println(firstHalf("slamming"));
        System.out.println(convert("groovy"));
//        String str = "funky";
//        String[] splitter = (str.split(str));
//        System.out.println(splitter[]);
    }

    public static int inRange(int a, int b) {
        int sum = (a + b);
        if (sum >= 50 && sum <= 80) {
            return 65;
        } else {
            return 80;
        }
    }

    public static String firstHalf (String str) {
        int strLength = str.length();
        int strHalf = (strLength / 2);
        if (strLength % 2 == 0) {
            str = str.substring(0, strHalf);
        } return str;

    }

    public static String convert (String str) {
        int strLength = str.length();
        if (strLength >= 3) {
            String firstThree = (str.substring(0, 3));
            String lastHalf = str.substring(3);
            String lowered = firstThree.toLowerCase();
            String full = (lowered + lastHalf);
            return full;

        } else {
            return  str.toUpperCase();
        }
    }

//    public static String letterAfter (String str) {
//        System.out.println(str.split(str));
//    }
}
