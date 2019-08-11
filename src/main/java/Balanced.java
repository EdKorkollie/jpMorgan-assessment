public class Balanced {

    public static void main(String[] args) throws Exception {
        String line1 = "i am sick today (:()";
        String line2 = "(:))";
        String line3 = ":((";
        String line4 = ")(";
        String line5 = "cup: hacker :):)";

        System.out.println(balanceParenthesis(line1));
        System.out.println(balanceParenthesis(line2));
        System.out.println(balanceParenthesis(line3));
        System.out.println(balanceParenthesis(line4));
        System.out.println(balanceParenthesis(line5));
    }

    private static String balanceParenthesis(String line) {
        String s = line.replaceAll( "[^:\\(\\)]", "" );

        for (int i = 0; i < s.length() / 2; i++) {
            String lead = "";
            String trail = "";
            if (s.charAt(i) == '(' && s.charAt(s.length() - i - 1) == ')') {
                if (i > 0) {
                    lead = s.substring(0, i);
                    trail = s.substring(s.length() - i, s.length());
                }
                s = lead + s.substring(i + 1, s.length() - i - 1) + trail;
                --i;
            }
        }
        s = s.replaceAll( ":\\(", "" );
        s = s.replaceAll( ":\\)", "" );

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                return "NO";
            }
        }

        return "YES";
    }
}
