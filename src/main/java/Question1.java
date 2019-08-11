public class Question1 {


    public static void main(String[] args) {
        String line1 = "i am sick today (:()";
        String line2 = "(:))";
        String line3 = ":((";
        String line4 = ")(";
        String line5 = "cup: hacker :):)";
        System.out.println("line1: " + checkFeelings(line1));
        System.out.println("line2: " + checkFeelings(line2));
        System.out.println("line2: " + checkFeelings(line3));
        System.out.println("line2: " + checkFeelings(line4));
        System.out.println("line2: " + checkFeelings(line5));
    }

    public static String checkFeelings(String line) {
        int leftparenthesis = 0;
        int rightparenthesis = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                leftparenthesis += 1;
                if (i == 0 || line.charAt(i - 1) != ':') {
                    leftparenthesis += 1;
                }
            } else if (line.charAt(i) == ')') {
                if (i == 0 || line.charAt(i - 1) != ':') {
                    rightparenthesis -= 1;
                }
                if (rightparenthesis < 0) {
                    break;
                }
            }
        }
        if (leftparenthesis >= 0 && rightparenthesis == 0) {
            return "YES";
        }
        return "NO";
    }
}
